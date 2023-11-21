using Common;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Models.Entites;
using Models.Models.Request;

namespace DemoDbFirst.Controllers;

public class AuthController : BaseController<AuthController>
{
    public AuthController(DemoDbFirstContext dbContext, 
        ILogger<AuthController> logger,
        IConfiguration config)
        : base(dbContext, logger, config)
    {
    }

    [AllowAnonymous]
    [HttpPost]
    public IActionResult Login([FromBody] AuthenticationModel model)
    {
        var data = _dbContext.Students.FirstOrDefault(m => m.Username == model.Username);
        if (data == null) return BadRequest("Username/password incorrect");

        var isValid = model.Username.ValidPassword(data.Salt, model.Password, data.Password);
        if(!isValid) return BadRequest("Username/password incorrect");

        var accessToken = GenerateToken(model.Username);
        return Ok(accessToken);
    }
}