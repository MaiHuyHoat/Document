using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

using System.Threading;
using System.Data;
using System.Data.OleDb;

using KiemTra.Model;
namespace KiemTra
{
    public partial class Main : Form
    {
        private Context _context;
        public Main()
        {
            InitializeComponent();
            this._context = new Context();
            this.loadData(null);
            this.loadCbbKhoa(null);
            this.loadCbbLop(null);
            this.setDtpSinhTu();
            this.setDtpSinhDen();
        }
        private void loadData(Dictionary<String,String> constraintI )
        {

            String sql = "SELECT s.MASINHVIEN , s.HOTEN,s.NGAYSINH , l.TENLOP, k.TENKHOA FROM (SINHVIEN s INNER JOIN LOP l ON l.MALOP= s.MALOP) INNER JOIN KHOA k ON k.MAKHOA= s.MAKHOA ";
              if (constraintI != null)
            {
                sql += " WHERE 1=1 ";
                foreach (var item in constraintI)
                {
                    if (!string.IsNullOrEmpty(item.Value))
                    {
                       if (item.Key.ToLower().Contains("like")) sql += "AND " + item.Key + " '%" + item.Value + "%' ";
                        else if(item.Key.ToLower().Contains("between"))sql+= " AND "+item.Key+" "+item.Value  ;
                        else  sql += "AND " + item.Key + "=" + item.Value + " ";
                    }
                }
            }
            using(OleDbDataReader dataReader = this._context.ExecuteQuery(sql) ){
                this.dataGridViewShow.Rows.Clear();
                while(dataReader.Read()){
                    int ma = dataReader.GetInt32(0);
                    String hoTen = dataReader.GetString(1);
                    DateTime ngaySinh = dataReader.GetDateTime(2);
                    String tenLop = dataReader.GetString(3);
                    String tenKhoa = dataReader.GetString(4);
                    String[] row = { ma.ToString(), hoTen, ngaySinh.ToString(), tenLop, tenKhoa };
                    this.dataGridViewShow.Rows.Add(row);
                }
                }
        }
        public void realoadData(object sender, EventArgs ev)
        {
            //MessageBox.Show("Load lai dữ liệu ");
            
           this.loadData(null);
            this.setDtpSinhTu();
            this.setDtpSinhDen();
        }
    
        private void loadCbbKhoa(String tenLop) {
            String sql = "SELECT k.* FROM KHOA k";
            this.comboBoxKhoa.Items.Clear();
            if (tenLop != null)
            {
                sql += " INNER JOIN LOP l ON L.MAKHOA=k.MAKHOA WHERE l.TENLOP LIKE '%" + tenLop + "%'";
            }
            else {
                this.comboBoxKhoa.Items.Add("Tất cả");
            }
          
            using( OleDbDataReader dataReader= this._context.ExecuteQuery(sql) ){
           
                while (dataReader.Read())
                {
                    String khoa = dataReader.GetString(1);
                    this.comboBoxKhoa.Items.Add(khoa);
                }
            }
            this.comboBoxKhoa.SelectedIndex = 0;
        }
        private void loadCbbLop(String tenKhoa )
        {
            String sql = "SELECT l.* FROM LOP l ";
            this.comboBoxLop.Items.Clear();
            if (tenKhoa != null)
            {
                sql += " INNER JOIN KHOA k ON k.MAKHOA=l.MAKHOA WHERE k.TENKHOA LIKE '%" + tenKhoa + "%'";
            }
            else {
                this.comboBoxLop.Items.Add("Tất cả");
            }
            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {
               
                while (dataReader.Read())
                {
                    String lop = dataReader.GetString(1);
                    this.comboBoxLop.Items.Add(lop);
                }
            }
            this.comboBoxLop.SelectedIndex = 0;
        }
        private void setDtpSinhTu()
        {
            string sql = "SELECT MIN(NGAYSINH) FROM SINHVIEN ";
            using( OleDbDataReader dataReader= this._context.ExecuteQuery(sql) )
            {
                if (dataReader.Read())
                {
                    DateTime ngaysinhMin = dataReader.GetDateTime(0);
                    this.dateTimePickerSinhNhatTu.Value = ngaysinhMin;
                }
            }
        }
        private void setDtpSinhDen()
        {
            string sql = "SELECT MAX(NGAYSINH) FROM SINHVIEN ";
            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {
                if (dataReader.Read())
                {
                    DateTime ngaysinhMax = dataReader.GetDateTime(0);
                    this.dateTimePickerSinhNhatDen.Value = ngaysinhMax;
                }
            }
        }

        private void comboBoxKhoa_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (this.comboBoxKhoa.SelectedIndex > 0)
            {
                String tenKhoa = this.comboBoxKhoa.SelectedItem.ToString();
                this.loadCbbLop(tenKhoa);
            }
            else
            {
                this.loadCbbLop(null);
            }
           
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String maSinhVien = this.textBoxMaSinhVien.Text;
            string hoTen = this.textBoxHoTen.Text;
            DateTime sinhTu = this.dateTimePickerSinhNhatTu.Value;
            String sinhTuStr = sinhTu.ToString("MM-dd-yyyy");
            DateTime sinhDen = this.dateTimePickerSinhNhatDen.Value;
            String sinhDenStr = sinhDen.ToString("MM-dd-yyyy");
            String khoa = this.comboBoxKhoa.SelectedItem.ToString();
            String lop = this.comboBoxLop.SelectedItem.ToString();
            Dictionary<String, String> constraint = new Dictionary<string, string>();
            if (!string.IsNullOrEmpty(maSinhVien)) constraint.Add("s.MASINHVIEN LIKE ", maSinhVien);
            if (!string.IsNullOrEmpty(hoTen)) constraint.Add("s.HOTEN LIKE ",hoTen);
            constraint.Add("s.NGAYSINH BETWEEN ", "#" + sinhTuStr + "# AND #" + sinhDenStr + "# ");
            if (!khoa.ToLower().Contains("tất cả")) constraint.Add("k.TENKHOA", "'" + khoa+"'");
            if (!lop.ToLower().Contains("tất cả")) constraint.Add("l.TENLOP", "'" + lop+ "'");
            this.loadData(constraint);
        }

        private void buttonThem_Click(object sender, EventArgs e)
        {
            Add formAdd = new Add();
            formAdd.modelAdded += this.realoadData;
            formAdd.ShowDialog();
        }

        private void buttonSua_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewShow.SelectedRows.Count > 0)
            {
                int ma = int.Parse(this.dataGridViewShow.SelectedRows[0].Cells[0].Value.ToString());
                Edit formEdit = new Edit(ma);
                formEdit.modelEdited += this.realoadData; ;
                formEdit.ShowDialog();
            }
            else
            {
                MessageBox.Show("Bạn cần chọn một sinh viên \n ( hàng trên bảng) để sửa !");

            }
          
        }

        private void buttonNapLai_Click(object sender, EventArgs e)
        {

            this.loadData(null);
            this.setDtpSinhTu();
            this.setDtpSinhDen();
        }

        private void buttonXoa_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewShow.SelectedRows.Count > 0)
            {
                
                int ma = int.Parse(this.dataGridViewShow.SelectedRows[0].Cells[0].Value.ToString());
                string ten = this.dataGridViewShow.SelectedRows[0].Cells[1].Value.ToString();
                DialogResult choose = MessageBox.Show(string.Format("Bạn có chắc muốn xoá sinh viên có tên : \n {0}", ten), "Xác nhận xoá ", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);
                if(choose== DialogResult.Yes ){
                    string sql = string.Format("DELETE FROM SINHVIEN WHERE MASINHVIEN={0}", ma);
                    int rf = this._context.ExecuteNonQuery(sql);
                    if (rf > 0) {
                        MessageBox.Show("Xoá thành công !","Thành công",MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
                        this.realoadData(sender, e);
                    }
                }
            }
            else
            {
                MessageBox.Show("Bạn cần chọn một sinh viên \n ( hàng trên bảng) để sửa !");

            }
        }

        
    }
}
