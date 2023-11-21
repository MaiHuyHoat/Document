/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsLophoc;
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
public class tbLophoc {
    public Vector<clsLophoc> LayDSLop()
    {
        Vector<clsLophoc> dslop = new Vector<clsLophoc>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tbLophoc";
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    clsLophoc lophoc = new clsLophoc();
                    lophoc.setMalop(rs.getInt("Malop"));
                    lophoc.setTenlop(rs.getString("Tenlop"));
                    dslop.add(lophoc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dslop;
    }
    public boolean ThemLophoc(String tenlop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "INSERT INTO tbLophoc VALUES(NULL,?)";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, tenlop);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public boolean XoaLophoc(int malop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "DELETE FROM tbLophoc WHERE Malop=?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setInt(1, malop);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public boolean SuaLophoc(int malop,String tenlop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = 
             "UPDATE tbLophoc SET Tenlop=? WHERE Malop=?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, tenlop);
                stm.setInt(2, malop);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public String LayTenLop(int Malop)
    {
        String Tenlop ="";
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tbLophoc WHERE Malop = " + Malop;
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                if(rs.next())
                {
                    Tenlop = rs.getString("Tenlop");
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Tenlop;
    }
}
