using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoCode_12_7.Model
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Phone { get; set; }
        public string Address { get; set; }
        public string Description { get; set; }
        public string Position { get; set; }

        public Employee(int id, string name, string phone, string address, string description, string position)
        {
            Id = id;
            Name = name;
            Phone = phone;
            Address = address;
            Description = description;
            Position = position;
        }
    }
}
