/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import CSDL.tbLophoc;
import Models.clsLophoc;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Tran Manh Truong
 */
public class clsTienich {
    public static void ComboBoxLophoc(JComboBox cbb, int chonmalop)
    {
        //tạo mảng chứa các lớp học
        tbLophoc bangLophoc = new tbLophoc();
        Vector<clsLophoc> dsLophoc = bangLophoc.LayDSLop();
       
        //chèn các lớp học vào cbbLophoc
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(dsLophoc);
        
        cbb.setModel(cbm);
        cbm.insertElementAt("Chọn lớp học", 0);
        cbb.setSelectedIndex(0);
    }
    public static void HienthiAnh_Label(File ImageFile, JLabel lblHinhanh)
    {
        try {
                Image img1 = ImageIO.read(ImageFile);// đọc file image đầu vào
                Image img2 = img1.getScaledInstance(lblHinhanh.getWidth(), 
                                             lblHinhanh.getHeight(), Image.SCALE_SMOOTH);// resize image 
                ImageIcon icon = new ImageIcon(img2);// trình triển khai của icon interface để vẽ các icon từ các image.
                lblHinhanh.setIcon(icon);
            } catch (IOException ex) {
                Logger.getLogger(frmThemSV.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    //tạo chuỗi ngẫu nhiên với độ dài là len
    public static String randomString(int len) {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
    //Lấy phần mở rộng đuôi tệp
    public static String TypeFile(String fileName) {
        String extension = "";
        int i = fileName.lastIndexOf('.');
        if (i >= 0) {
            extension = fileName.substring(i + 1);
        }
        return extension;
    }
}
