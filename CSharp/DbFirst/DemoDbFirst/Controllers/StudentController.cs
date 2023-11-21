using Common;
using Microsoft.AspNetCore.Mvc;
using Models.Entites;
using Models.Models.Request;
using Models.Models.Response;

namespace DemoDbFirst.Controllers;

public class StudentController : BaseController<StudentController>
{
    public StudentController(DemoDbFirstContext dbContext,
        ILogger<StudentController> logger,
        IConfiguration config)
        : base(dbContext, logger, config)
    {
    }

    [HttpGet]
    public IActionResult GetList()
    {
        var res = _dbContext.Students.Select(m
            => new StudentModel
            {
                Address = m.Address,
                Age = m.Age,
                Description = m.Description,
                Gender = m.Gender,
                Id = m.Id,
                Name = m.Name,
                Status = m.Status,
                Username = m.Username
            });
        return Ok(res);
    }

    [HttpGet("{id:long}")]
    public IActionResult GetDetails(long id)
    {
        var student = _dbContext.Students.Find(id);
        var course = from sc in _dbContext.StudentCourses
            join cs in _dbContext.Courses on sc.CourseId equals cs.Id
            where sc.StudentId == id
            select new Course
            {
                Id = cs.Id,
                Name = cs.Name,
                Description = cs.Description,
                Status = cs.Status
            };
        ;
        return Ok(new StudentDetailModel
        {
            Id = student.Id,
            Name = student.Name,
            Age = student.Age,
            Address = student.Address,
            Gender = student.Gender,
            Status = student.Status,
            Username = student.Username,
            Description = student.Description,
            Courses = course.ToList()
        });
    }


    [HttpPost]
    public IActionResult Add([FromBody] StudentModel m)
    {
        var data = new Student
        {
            Address = m.Address,
            Age = m.Age,
            Description = m.Description,
            Gender = m.Gender,
            Id = m.Id,
            Name = m.Name,
            Status = m.Status,
            Username = m.Username
        };
        _dbContext.Students.Add(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }

    [HttpPut]
    public IActionResult Edit([FromBody] StudentModel model)
    {
        var data = _dbContext.Students.Find(model.Id);
        if (data == null) return NotFound("No data found");

        data.Name = model.Name;
        data.Address = model.Address;
        data.Age = model.Age;
        data.Gender = model.Gender;
        data.Status = model.Status;
        data.Description = model.Description;
        data.UpdatedBy = "";
        data.UpdatedDate = DateTime.Now;

        _dbContext.Students.Update(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }

    [HttpPut]
    public IActionResult ResetPassword([FromBody] ResetPasswordModel model)
    {
        var data = _dbContext.Students.Find(model.StudentId);
        if (data == null) return NotFound("No data found");

        data.Salt ??= Guid.NewGuid().ToString();

        var passHash = data.Username.ComputeSha256Hash(data.Salt, model.Password);

        data.Password = passHash;
        data.UpdatedBy = "";
        data.UpdatedDate = DateTime.Now;

        _dbContext.Students.Update(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }

    [HttpDelete]
    public IActionResult Delete([FromQuery] long id)
    {
        var data = _dbContext.Students.Find(id);
        if (data == null) return NotFound("No data found");

        _dbContext.Students.Remove(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }


    [HttpPost]
    public IActionResult RegistryCourse(RegistryCourseModel model)
    {
        var dataStudent = _dbContext.Students.Find(model.StudentId);
        if (dataStudent == null) return NotFound("No data found");

        var dataCourse = _dbContext.Courses.Find(model.CourseId);
        if (dataCourse == null) return NotFound("No data found");

        var data = _dbContext.StudentCourses.Find(model.StudentId, model.CourseId);
        if (data != null) return NotFound("Data Exists");

        var course = new StudentCourse
        {
            CourseId = model.CourseId,
            StudentId = model.StudentId
        };
        _dbContext.StudentCourses.Add(course);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }
}