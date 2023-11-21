/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsLophoc;
import Models.clsSinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class tbSinhvien {
    public static int LayDSSinhvien(Vector<clsSinhvien> ds)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT SV.*, LH.tenlop FROM tbSinhvien SV INNER JOIN tbLophoc LH"
                + " ON SV.MaLop = LH.Malop";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())//duyệt từng bản ghi kết quả select
            {
                clsSinhvien sv = new clsSinhvien();
                sv.id = rs.getInt("id");
                sv.masv = rs.getString("masv");
                sv.hoten = rs.getString("hoten");
                sv.gioitinh = rs.getBoolean("gioitinh");
                sv.diachi = rs.getString("diachi");
                sv.malop = rs.getInt("malop");
                sv.tenlop = rs.getString("tenlop");
                ds.add(sv);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int ThemSinhvien(clsSinhvien sv)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbSinhvien VALUES(NULL,?,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, sv.masv);
            stm.setString(2, sv.hoten);
            stm.setBoolean(3, sv.gioitinh);
            stm.setString(4, sv.diachi);
            stm.setInt(5, sv.malop);
            int n = stm.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int XoaSinhvien(int id)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "DELETE FROM tbSinhvien WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            int n = stm.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int SuaSinhvien(clsSinhvien sv){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "UPDATE tbSinhvien SET masv=?,hoten=?,gioitinh=?,diachi=?,malop=? WHERE id=?";
        try {
           PreparedStatement stm = cnn.prepareStatement(sql);
           stm.setString(1, sv.masv);
           stm.setString(2, sv.hoten);
           stm.setBoolean(3, sv.gioitinh);
           stm.setString(4, sv.diachi);
           stm.setInt(5,sv.malop);
           stm.setInt(6, sv.id);
           int n = stm.executeUpdate();
           return n;
       } catch (SQLException ex) {
           Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
           return -2;
       }
    }
}
