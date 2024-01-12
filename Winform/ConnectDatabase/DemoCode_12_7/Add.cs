using DemoCode_12_7.Model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace DemoCode_12_7
{
    public partial class Add : Form
    {
        public event EventHandler employeeAdded;
        
        public Add()
        {
            InitializeComponent();
        }

        private void OnEmployeeAdded()
        {
            employeeAdded?.Invoke(this, EventArgs.Empty);
        }

        private void btnThem_Click(object sender, EventArgs e)
        {
            int id = int.Parse(this.txtId.Text);
            string name= this.txtName.Text;
            string phone= this.txtPhone.Text;
            string address= this.txtAddress.Text;
            string description = this.txtDescription.Text;
            //object selectedValue = this.cbbViTri.SelectedValue;
            String position =this.cbbViTri.SelectedItem.ToString();
            list.listData.Add(new Employee(id, name, phone, address, description, position));
            this.OnEmployeeAdded();
            this.Dispose();

        }
    }
}
