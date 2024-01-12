using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.OleDb;
using System.Windows.Forms;
namespace KiemTra.Model
{
    class Context
    {
        public OleDbConnection conn;
        public Context()
        {
            String strConn = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source="+ Application.StartupPath +"\\KiemTra.mdb";
          
            try
            {
                this.conn = new OleDbConnection();
                this.conn.ConnectionString = strConn;
                this.conn.Open();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Lỗi kết nối Db: " + ex);
            }
        }
        public OleDbDataReader ExecuteQuery(String query)
        {
           
            try
            {
                using (OleDbCommand odc = new OleDbCommand(query, this.conn))
                {
                    OleDbDataReader reader = odc.ExecuteReader();
                   
                    return reader;
                }
            }
            catch (Exception ex)
            {
                // Xử lý lỗi (hiển thị hoặc log lỗi, tùy thuộc vào yêu cầu của bạn)
                MessageBox.Show(query);
                MessageBox.Show("Lỗi khi thực hiện truy vấn: " + ex.Message);
                return null; // Hoặc thực hiện xử lý lỗi khác tùy thuộc vào yêu cầu của bạn
            }
        }
        public int ExecuteNonQuery(string query)
        {
            try
            {
                using (OleDbCommand odc = new OleDbCommand(query, this.conn))
                {
                    int rowsAffected = odc.ExecuteNonQuery();
                    return rowsAffected;
                }
            }
            catch (Exception ex)
            {
                // Xử lý lỗi (hiển thị hoặc log lỗi, tùy thuộc vào yêu cầu của bạn)
                MessageBox.Show(query);
                MessageBox.Show("Lỗi khi thực hiện truy vấn: " + ex.Message);
                return -1; // Hoặc thực hiện xử lý lỗi khác tùy thuộc vào yêu cầu của bạn
            }
        }

        public void closeConnextion()
        {
            this.conn.Close();
        }
    }
}
