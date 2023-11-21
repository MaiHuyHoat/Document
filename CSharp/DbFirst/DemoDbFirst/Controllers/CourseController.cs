using Microsoft.AspNetCore.Mvc;
using Models.Entites;

namespace DemoDbFirst.Controllers;

public class CourseController : BaseController<CourseController>
{
    public CourseController(DemoDbFirstContext dbContext, 
        ILogger<CourseController> logger,
        IConfiguration config)
        : base(dbContext, logger, config)
    {
    }

    [HttpGet]
    public IActionResult GetList()
    {
        var res = _dbContext.Courses;
        return Ok(res);
    }

    [HttpGet("{id:long}")]
    public IActionResult GetDetails(long id)
    {
        return Ok(_dbContext.Courses.Find(id));
    }


    [HttpPost]
    public IActionResult Add([FromBody] Course model)
    {
        _dbContext.Courses.Add(model);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }

    [HttpPut]
    public IActionResult Edit([FromBody] Course model)
    {
        var data = _dbContext.Courses.Find(model.Id);
        if (data == null) return NotFound("No data found");

        data.Name = model.Name;
        data.Status = model.Status;
        data.Description = model.Description;
        data.UpdatedBy = "";
        data.UpdatedDate = DateTime.Now;

        _dbContext.Courses.Update(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }

    [HttpDelete]
    public IActionResult Delete([FromQuery] long id)
    {
        var data = _dbContext.Courses.Find(id);
        if (data == null) return NotFound("No data found");

        _dbContext.Courses.Remove(data);
        var eff = _dbContext.SaveChanges();
        return eff > 0 ? Ok("Success") : BadRequest("Failed");
    }
}