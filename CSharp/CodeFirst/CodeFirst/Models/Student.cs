using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CodeFirst.Models
{
    public class Student
    {
      
        public int StudentId { get; set; }
    
        [Column(Order = 1)]
        public string? StudentName { get; set; }
   
        public int Gender { get; set; }
        
        [Column(Order = 2)]
        public string? Address { get; set; }
        public int Status { get; set; }
        //[ForeignKey("RoomId")]
        public int RoomId { get; set; } 
        // navigation property
        public virtual Room? Room { get; set; }


    }   
}
