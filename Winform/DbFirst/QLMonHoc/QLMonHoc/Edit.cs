using QLMonHoc.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QLMonHoc
{
    public partial class Edit : Form
    {
        public EventHandler _eventAdd;
        private QLMonHocContext _context;
        private int MaMon;
        private MonHoc _monHoc;
        public void OnMonHocEdit()
        {
            this._eventAdd?.Invoke(this, EventArgs.Empty);
            
        }
        public Edit(int maMon)
        {
            InitializeComponent();
            this._context = new QLMonHocContext();
            this.MaMon = maMon;
            this.LoadMonHoc();
   
        }
       
        private void LoadMonHoc()
        {
          

                if (this._context == null)
                {
                    MessageBox.Show("Lỗi DbContext");
                }
                else
                {
                    if (this.MaMon == null)
                    {
                        MessageBox.Show("Lỗi ! Mã môn trống ");
                        return;
                    }

                    this._monHoc = this._context.MonHocs.FirstOrDefault(m => m.MaMon == this.MaMon);
                    if (this._monHoc == null)
                    {
                        MessageBox.Show("Không tìm thấy môn học có mã môn : " + this.MaMon);
                        return;
                    }
                    this.textBoxTenMon.Text = this._monHoc.TenMon;
                    this.textBoxSoDVHT.Text = this._monHoc.SoDvht.ToString();

                }
            
        }
        private async  void buttonLuu_Click(object sender, EventArgs e)
        {
            string tenMon = this.textBoxTenMon.Text;
            string soDvht = this.textBoxSoDVHT.Text;
            if (string.IsNullOrEmpty(tenMon) || string.IsNullOrEmpty(soDvht))
            {
                MessageBox.Show("Các trường thông tin không được để trống !");
            }
            else
            {
                int SoDvht = int.Parse(soDvht);
          
               this._monHoc.TenMon = tenMon;
                this._monHoc.SoDvht = SoDvht;

                 await  this._context.SaveChangesAsync();
                this.OnMonHocEdit();
                this.Dispose();

            }
        }
    }
}
