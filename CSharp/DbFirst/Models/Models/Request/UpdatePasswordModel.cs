namespace Models.Models.Request;

public class ResetPasswordModel
{
    public long StudentId { get; set; }
    public string Password { get; set; }
}

public class UpdatePasswordModel
{
    public long StudentId { get; set; }
    public string Password { get; set; }
    public string OldPassword { get; set; }
}