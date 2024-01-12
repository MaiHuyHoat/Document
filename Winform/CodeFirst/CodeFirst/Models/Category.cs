using Microsoft.EntityFrameworkCore.ChangeTracking;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeFirst.Models
{
    internal class Category
    {
        public int CategoryId { get; set; }

        public string? Name { get; set; } = null;

        public virtual ObservableCollectionListSource<Product> Products { get; } = new();
    }
}
