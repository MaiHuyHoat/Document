using CodeFirst.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CodeFirst
{
    public partial class Main : Form
    {
        private ProductsContext _context;
        private List<Category> _categories;    
        public Main()
        {
            InitializeComponent();
            this._context = new ProductsContext();
           
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);
            this.fillDataCategory();
            
        }
        protected void fillDataCategory()
        {

            this._categories = this._context.Categories.ToList();
            foreach (Category c in this._categories)
            {
                string[] row = { c.CategoryId.ToString(), c.Name };
                this.dataGridViewCategories.Rows.Add(row);


            }

        }
        protected override void OnClosing(CancelEventArgs e)
        {
            base.OnClosing(e);

            this._context?.Dispose();
            this._context = null;
        }


        private void dataGridViewCategories_SelectionChanged(object sender, EventArgs e)
        {

            if(this.dataGridViewCategories.SelectedRows.Count > 0)
            {
                DataGridViewRow row = this.dataGridViewCategories.SelectedRows[0];
                int idCategory = int.Parse(row.Cells["ColumnCategoryId"].Value.ToString());

                List<Product> products = (from p in this._context.Products
                                          where p.CategoryId == idCategory
                                          select p).ToList();
                this.dataGridViewProducts.Rows.Clear();

                foreach (Product p in products) {
                    string[] rowAdd = { p.ProductId.ToString(), p.Name};

                        this.dataGridViewProducts.Rows.Add(rowAdd);
                        }
                                         

                


            }

        }
    }
}
