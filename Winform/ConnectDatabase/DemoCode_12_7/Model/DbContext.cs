using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DemoCode_12_7.Model
{
    internal class DbContext
    {
        string strConnection = "Data Source=DESKTOP-KU0MU31\\SQLEXPRESS;Initial Catalog=csharp;Integrated Security=True";
        SqlConnection conn;

        public DbContext()
        {
            this.conn= new SqlConnection(strConnection);
            this.conn.Open();
            if(this.conn != null ) {
                MessageBox.Show("Kết nối database thành công ! ");
            }
        }
       public SqlDataReader ExecuteQuery(string sql)
        {
            SqlCommand cmd= new SqlCommand(sql,this.conn);
            SqlDataReader sqlDataReaderreader = cmd.ExecuteReader();
            return sqlDataReaderreader;

        }

        public void CloseConnection()
        {
            this.conn.Close();
        }
    }
}
