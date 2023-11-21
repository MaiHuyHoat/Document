/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tep_Van_Ban;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Doc_Tep_Van_Ban {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:\\Vanban.txt");//mở tệp ở chế độ đọc văn bản
            br = new BufferedReader(fr);
            String str;
            while( (str=br.readLine()) != null)//vòng lặp đọc từng dòng lưu vào str cho đến khi kết thúc
            {
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy tệp");
            Logger.getLogger(Doc_Tep_Van_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            System.out.println("Lỗi trong quá trình đọc tệp");
            Logger.getLogger(Doc_Tep_Van_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(br!=null)
                    br.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Doc_Tep_Van_Ban.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
