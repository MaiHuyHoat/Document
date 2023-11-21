/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsSinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class tbSinhvien {
    //hàm tìm sinh viên: trả về Vector<clsSinhvien> chứa danh sách sinh viên
    //tham số đầu vào là từ khóa, nếu từ khóa trống sẽ trả về toàn bộ sinh viên
    //đầu ra: trả về số int: -2 (lỗi SQL), -1 (Lỗi kết nối CSDL)
    //trả về 0: (không có dữ liệu);  1,2..(số dòng kết quả)
    public static int TimSinhvien(String tukhoa, Vector<clsSinhvien> danhsach)
    {
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        //truy vấn dữ liệu từ bảng tbSinhvien và thêm vào danhsach
        String sql = "SELECT * FROM tbSinhvien";
        if(tukhoa.equals("")==false)//nếu từ khóa khác trống thì cộng thêm mệnh đề WHERE
            sql += "  WHERE hoten LIKE'%" + tukhoa + "%'";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery(sql);//thực thi lệnh Select trả về Resulset
            //lặp các dòng từ rs và thêm vào danhsach
            while(rs.next())//lặp từng dòng của kết quả truy vấn
            {
                String masv = rs.getString("masv");
                String hoten = rs.getString("hoten");
                String dienthoai = rs.getString("dienthoai");
                clsSinhvien sv = new clsSinhvien(masv, hoten, dienthoai);
                danhsach.add(sv);
            }
            return danhsach.size();//trả về số sinh viên trong danh sách
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi sql
        }
    }
    //hàm thêm sinh viên
    public static int ThemSinhvien(clsSinhvien sv)
    {
        //kết nối đến CSDL
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        //tạo lệnh SQL
        String sql = "INSERT INTO tbSinhvien VALUES(?,?,?)";
        try {
            //đối tượng PreparedStatement để thực thi câu lệnh SQL từ CSDL cnn
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, sv.getMasv());
            stm.setString(2, sv.getHoten());
            stm.setString(3, sv.getDienthoai());
            //thực thi sql và về số dòng được thêm,sửa,xóa
            int n = stm.executeUpdate();
            return n;//trả về số dòng được thêm/sửa/xóa
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi sql
        }
    }
    //hàm sửa sinh viên
    public static int Suainhvien(String masv,clsSinhvien sv)
    {
        //kết nối đến CSDL
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        //tạo lệnh SQL
        String sql = "UPDATE tbSinhvien SET masv =?, hoten=?, dienthoai=? WHERE masv = ?";
        try {
            //đối tượng PreparedStatement để thực thi câu lệnh SQL từ CSDL cnn
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, sv.getMasv());
            stm.setString(2, sv.getHoten());
            stm.setString(3, sv.getDienthoai());
            stm.setString(4, masv);
            //thực thi sql và về số dòng được thêm,sửa,xóa
            int n = stm.executeUpdate();
            return n;//trả về số dòng được thêm/sửa/xóa
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi sql
        }
    }
    //hàm xóa sinh viên
    public static int XoaSinhvien(String masv)
    {
        //kết nối đến CSDL
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        //tạo lệnh SQL
        String sql = "DELETE FROM tbSinhvien WHERE masv = ?";
        try {
            //đối tượng PreparedStatement để thực thi câu lệnh SQL từ CSDL cnn
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, masv);
            //thực thi sql và về số dòng được thêm,sửa,xóa
            int n = stm.executeUpdate();
            return n;//trả về số dòng được thêm/sửa/xóa
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi sql
        }
    }
}
