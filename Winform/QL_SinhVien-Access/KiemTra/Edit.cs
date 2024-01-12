using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

using System.Data;
using System.Data.OleDb;

using KiemTra.Model;

namespace KiemTra
{
    public partial class Edit : Form
    {
        private Context _context;
        public event EventHandler modelEdited;
        public Edit(int id )
        {
            InitializeComponent();
            this._context = new Context();
            this.loadCbbKhoa(null);
            this.loadCbbLop(null);
            this.setSinhVienInForm(id);
        }
        private void OnModelEdited()
        {
            if (this.modelEdited != null) this.modelEdited.Invoke(this, EventArgs.Empty);
        }
        private void loadCbbKhoa(String tenLop)
        {
            String sql = "SELECT k.* FROM KHOA k";
            this.comboBoxKhoa.Items.Clear();
            if (tenLop != null)
            {
                sql += " INNER JOIN LOP l ON L.MAKHOA=k.MAKHOA WHERE l.TENLOP LIKE '%" + tenLop + "%'";
            }
            else
            {
                this.comboBoxKhoa.Items.Add("Tất cả");
            }

            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {

                while (dataReader.Read())
                {
                    String khoa = dataReader.GetString(1);
                    this.comboBoxKhoa.Items.Add(khoa);
                }
            }
            this.comboBoxKhoa.SelectedIndex = 0;
        }
        private void loadCbbLop(String tenKhoa)
        {
            String sql = "SELECT l.* FROM LOP l ";
            this.comboBoxLop.Items.Clear();
            if (tenKhoa != null)
            {
                sql += " INNER JOIN KHOA k ON k.MAKHOA=l.MAKHOA WHERE k.TENKHOA LIKE '%" + tenKhoa + "%'";
            }
            else
            {
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

        private int getMaKhoaByTen(string ten)
        {
            string sql = " SELECT * FROM KHOA k  WHERE k.TENKHOA LIKE '%" + ten + "%'";
            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {
                if (dataReader.Read())
                {
                    int ma = dataReader.GetInt32(0);
                    return ma;

                }
            }
            return -1;

        }
        private int getMaLopByTen(string ten)
        {
            string sql = " SELECT * FROM LOP l  WHERE l.TENLOP LIKE '%" + ten + "%'";
            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {
                if (dataReader.Read())
                {
                    int ma = dataReader.GetInt32(0);
                    return ma;

                }
            }
            return -1;

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
        private void setSinhVienInForm(int id)
        {
            String sql = string.Format("SELECT s.MASINHVIEN , s.HOTEN,s.NGAYSINH , l.TENLOP, k.TENKHOA FROM (SINHVIEN s INNER JOIN LOP l ON l.MALOP= s.MALOP) INNER JOIN KHOA k ON k.MAKHOA= s.MAKHOA WHERE s.MASINHVIEN={0}",id);
          
            using (OleDbDataReader dataReader = this._context.ExecuteQuery(sql))
            {
                
                while (dataReader.Read())
                {
                    int ma = dataReader.GetInt32(0);
                    this.textBoxMa.Text = ma.ToString();
                    String hoTen = dataReader.GetString(1);
                    this.textBoxHoTen.Text = hoTen;
                    DateTime ngaySinh = dataReader.GetDateTime(2);
                    this.dateTimePickerNgaySinh.Value = ngaySinh;
                    String tenKhoa = dataReader.GetString(4);
                    this.comboBoxKhoa.SelectedItem = tenKhoa;
                    String tenLop = dataReader.GetString(3);
                    this.comboBoxLop.SelectedItem = tenLop ;
                    
                    
                }
            }
        }

        private void buttonLuu_Click(object sender, EventArgs e)
        {
            string ma = this.textBoxMa.Text;
            string hoten = this.textBoxHoTen.Text;
            DateTime ngaysinh = this.dateTimePickerNgaySinh.Value;
            string ngaysinhStr = ngaysinh.ToString("MM-dd-yyyy");
            String tenKhoa = this.comboBoxKhoa.SelectedItem.ToString();
            String tenLop = this.comboBoxLop.SelectedItem.ToString();
            if (string.IsNullOrEmpty(ma) || string.IsNullOrEmpty(hoten) || tenKhoa.ToLower().Contains("tất cả") || tenLop.ToLower().Contains("tất cả"))
            {
                MessageBox.Show("Bạn cần nhập đủ thông tin để thêm !");
                return;
            }
            else
            {
                int maLop = this.getMaLopByTen(tenLop);
                int maKhoa = this.getMaKhoaByTen(tenKhoa);
                string sql = string.Format("UPDATE SINHVIEN SET HOTEN={0}, NGAYSINH={1}, MALOP={2},MAKHOA={3} WHERE MASINHVIEN={4} ",
                   "'" + hoten + "'", "#" + ngaysinhStr + "#", maLop, maKhoa,  ma);
                int rf = this._context.ExecuteNonQuery(sql);
                if (rf > 0)
                {
                    MessageBox.Show("Đã sửa sinh viên thành công !");
                    this.OnModelEdited();
                    this.Dispose();
                }



            }
        }
    }
}
