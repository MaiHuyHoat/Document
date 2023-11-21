/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class Doc_tep_Vanban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tentep;
        System.out.println("Mời nhập đường dẫn tên tệp mới:");
        tentep = sc.nextLine();
        //Bước 1:khái báo đối tượng đọc tệp
        //khai báo đối tượng FileReader để mở file và đọc ở chế độ văn bản
        FileReader fr = null;
        //khai báo thêm đối tượng BufferedReader để hỗ trợ đọc file văn bản thuận tiện hơn
        BufferedReader br =null;
        try {
            fr = new FileReader(tentep);
            br = new BufferedReader(fr);
            String str;
                System.out.println("Nội dung tệp:");
                while( (str = br.readLine())!=null )
                {
                    System.out.println(str);
                }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Doc_tep_Vanban.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Doc_tep_Vanban.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                if(br!=null)
                    br.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Doc_tep_Vanban.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
