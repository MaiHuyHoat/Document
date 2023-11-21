using Microsoft.EntityFrameworkCore;

namespace CodeFirst.Models
{
    public class DemoDbContext : DbContext
    {
        public DemoDbContext(DbContextOptions options) : base(options)
        {
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Room>().HasData(

               new Room
               {
                   RoomId = 1,
                   RoomName = "B8",
                   Capacity = 1,

               });
            modelBuilder.Entity<Student>().HasData(

                  new Student
                  {
                      StudentId = 1,
                      StudentName = "mai huy hoat",
                      Gender = 1,
                      Address = "nam dinh",
                      RoomId = 1,
                      Status = 1,

                  });
          
        }
     public  DbSet<Student> Students { get; set; }
      public  DbSet<Room> Rooms { get; set; }

    }
}
