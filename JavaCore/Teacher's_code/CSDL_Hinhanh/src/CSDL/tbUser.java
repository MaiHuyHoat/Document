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
public class tbUser {
    public boolean Kiemtra(String u, String p)
    {
        boolean ketqua = false;
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tbUser WHERE username=? and password = MD5(?)";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, u);
                stm.setString(2, p);
                ResultSet rs = stm.executeQuery();
                if(rs.next()){
                    ketqua = true;
                }
            } catch (SQLException ex) {
                ketqua = false;
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ketqua;
    }
}
