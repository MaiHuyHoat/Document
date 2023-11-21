using System;
using System.Collections.Generic;

namespace Models.Entites;

public partial class Course
{
    public long Id { get; set; }

    public string Name { get; set; } = null!;

    public int Status { get; set; }

    public string? Description { get; set; }

    public DateTime CreatedDate { get; set; }

    public string CreatedBy { get; set; } = null!;

    public DateTime? UpdatedDate { get; set; }

    public string? UpdatedBy { get; set; }
}
