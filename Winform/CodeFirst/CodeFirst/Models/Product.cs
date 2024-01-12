using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeFirst.Models
{
    internal class Product
    {
        public int ProductId { get; set; }

        public string? Name { get; set; } = null;

        public int CategoryId { get; set; }
        public virtual Category Category { get; set; } = null!;
    }
}
