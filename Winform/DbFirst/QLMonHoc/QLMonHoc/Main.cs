using QLMonHoc.Models;
using System.Data.Entity;

namespace QLMonHoc
{
 
    public partial class Main : Form
    {
        private QLMonHocContext context;
        private List<MonHoc> listMonHoc;
        private Add formAdd;
        private Edit formEdit;

        
        public Main()
        {
            InitializeComponent();
             this.context= new QLMonHocContext();
            this.listMonHoc= new List<MonHoc>();    
            this.loadData();
     
     

          

        }
        private void reLoadData(object sender, EventArgs e) {

            this.loadData();
           
        }
        private void loadData()
        {
            //this.dataGridViewQLMonHoc.Rows.Clear();
            //this.context.Database.EnsureCreated();
            //this.context.MonHocs.Load();
            //this.dataGridViewQLMonHoc.DataSource= this.context.MonHocs.Local.ToBindingList();
           
                this.listMonHoc.Clear();
                this.listMonHoc = this.context.MonHocs.ToList();
                this.dataGridViewQLMonHoc.Rows.Clear();
                foreach (MonHoc m in this.listMonHoc)
                {
                    string[] rowAdd = { m.MaMon.ToString(), m.TenMon, m.SoDvht.ToString() };
                    this.dataGridViewQLMonHoc.Rows.Add(rowAdd);

                }
            }
           

        

        private void buttonThem_Click(object sender, EventArgs e)
        {
            this.formAdd = new Add();
            this.formAdd._eventAdd += this.reLoadData;
            this.formAdd.Show();
        }

        private void buttonSua_Click(object sender, EventArgs e)
        {
            if(this.dataGridViewQLMonHoc.SelectedRows.Count > 0) {
               
                DataGridViewRow rowSelected = this.dataGridViewQLMonHoc.SelectedRows[0];
                int maMon= int.Parse(rowSelected.Cells[0].Value.ToString());
                this.formEdit = new Edit(maMon);
                this.formEdit._eventAdd+= this.reLoadData;
             
                this.formEdit.Show();
            
            }
            else
            {
                MessageBox.Show("Bạn phải chọn môn để sửa  ! ");
            }
        }

        private async void buttonXoa_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewQLMonHoc.SelectedRows.Count > 0)
            {

                DataGridViewRow rowSelected = this.dataGridViewQLMonHoc.SelectedRows[0];
                int maMon = int.Parse(rowSelected.Cells[0].Value.ToString());
                MonHoc monHocExist= this.context.MonHocs.FirstOrDefault(m=>m.MaMon==maMon);
                if(monHocExist==null) { MessageBox.Show("Không tìm thấy môn học !"); return; }
                else
                {
                   this.context.MonHocs.Remove(monHocExist);
                    await this.context.SaveChangesAsync();
                    this.loadData();
                }


               

            }
            else
            {
                MessageBox.Show("Bạn phải chọn môn để xoá  ! ");
            }
        }
    }
}