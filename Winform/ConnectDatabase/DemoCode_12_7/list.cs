using DemoCode_12_7.Model;
using MySqlConnector;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DemoCode_12_7
{
    public partial class list : Form
    {
        public static ArrayList listData = new ArrayList();
        private Add formAdd;
        private DbContext dbContext;


        public list()
        {
            InitializeComponent();
            this.dbContext= new DbContext();
       
            //listData.Add(new Employee(2, "mai huy hoat", "0983928333", "Nam dinh", "Sinh viên ", "Trưởng phòng"));
            //listData.Add(new Employee(3, "Nguyen Hien Anh", "0983928333", "Hà Nội", "Sinh viên", "Giám đốc"));
            //listData.Add(new Employee(4, "Bui Huyen Trang", "0983928333", "Thái Bình", "Sinh Viên", "Nhân viên"));
            FillData();
            this.formAdd= new Add();
            this.formAdd.employeeAdded += this.ReloadData;
        }
        private void ReloadData(object sender, EventArgs e)
        {
            // Cập nhật danh sách nhân viên trên form cha
            this.FillData();
        }
        public   void FillData()
        {

            //string[] row0 = { "11/22/1968", "29", "Revolution 9",
            //"Beatles", "The Beatles [White Album]" };

            SqlDataReader sqlDataReader = this.dbContext.ExecuteQuery("Select * from employees");
            while (sqlDataReader.Read() )
            {
                int id = sqlDataReader.GetInt32(0);
                String Name= sqlDataReader.GetString(1);
                String Phone= sqlDataReader.GetString(2);
                String Address= sqlDataReader.GetString(3);
                String Description= sqlDataReader.GetString(4);
                String Position= sqlDataReader.GetString(5);
                listData.Add(new Employee(id,Name, Phone, Address, Description, Position)); 
            }
            this.dgvListEmployee.Rows.Clear();
            foreach(Employee employee in listData)
            {
                string[] row = { employee.Id.ToString(), employee.Name, employee.Phone,employee.Description,employee.Address,employee.Position };
                this.dgvListEmployee.Rows.Add(row);
            }
            //this.dgvListEmployee.Rows.Add(row0);
        }

        private void btnThem_Click(object sender, EventArgs e)
        {
       
            formAdd.ShowDialog();
            MessageBox.Show("Thêm nhân viên thành công ", "Trạng thái");
        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            if(this.dgvListEmployee.SelectedRows.Count > 0)
            {
              DataGridViewRow row= this.dgvListEmployee.SelectedRows[0];
                int id= int.Parse(row.Cells["clmId"].Value.ToString());
                foreach(Employee emp in listData) { 
                if(emp.Id== id)
                    {
                        listData.Remove(emp); 
                        MessageBox.Show("Xoá nhân viên thành công ", "Trạng thái");
                        this.FillData();
                        return;
                    }
                }
                MessageBox.Show("Không tim thấy nhân viên để xoá ", "Trạng thái");
            }
            else
            {
                MessageBox.Show("Bạn phải chọn nhân viên để xoá", "Trạng thái");
            }
        }
    }
}
