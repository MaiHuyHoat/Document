using System;
using System.Collections.Generic;

namespace Models.Entites;

public partial class StudentCourse
{
    public long StudentId { get; set; }

    public long CourseId { get; set; }

    public DateTime CreatedDate { get; set; }

    public string CreatedBy { get; set; } = null!;
}
