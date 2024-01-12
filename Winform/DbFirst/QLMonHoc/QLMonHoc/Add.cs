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
    
    public partial class Add : Form
    {

        public EventHandler _eventAdd;
        private QLMonHocContext _context;
        public void OnMonHocAdd()
        {
            this._eventAdd?.Invoke(this, EventArgs.Empty);  
        }

        public Add()
        {
            InitializeComponent();
            this._context= new QLMonHocContext();
        }

        private async void buttonThem_Click(object sender, EventArgs e)
        {
            string tenMon= this.textBoxTenMon.Text;
            string soDvht = this.textBoxSoDVHT.Text;
            if(string.IsNullOrEmpty(tenMon) || string.IsNullOrEmpty(soDvht ) ){
                MessageBox.Show("Các trường thông tin không được để trống !");
            }
            else
            {
                int SoDvht= int.Parse( soDvht );    
                MonHoc monHoc= new MonHoc();
                monHoc.TenMon = tenMon;
                monHoc.SoDvht = SoDvht;
                this._context.MonHocs.Add( monHoc );
            await this._context.SaveChangesAsync();
                this.OnMonHocAdd();
                this.Dispose();

            }
        }
    }
}
