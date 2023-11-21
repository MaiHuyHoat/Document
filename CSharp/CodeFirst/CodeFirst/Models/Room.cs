using System.ComponentModel.DataAnnotations;

namespace CodeFirst.Models
{
    public class Room
    {
        public int RoomId { get; set; }
      
        public string? RoomName { get; set; }
        
        public int Capacity { get; set; }
        //navigation prorperty
        public virtual List<Student>? Students { get; set; }
    }
}
