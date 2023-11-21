/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class Database {
    public static String user = "root"; //user đăng nhập vào MYSQL
    public static String pass =""; //password của user "root" mặc định là trống
    public static String url = 
     "jdbc:mysql://localhost:3306/DemoJDBC?useUnicode=true&characterEncoding=utf8";
    //xây dựng hàm kết nối CSDL, trả về đối tượng Connection
    public static Connection KetnoiCSDL()
    {
        Connection cnn = null; //chứa kết nối đến CSDL
        try {
            //tải thư viện com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            //kết nối đến CSDL với thông tin trong url
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;//trả về kết nối CSDL
    }
}
