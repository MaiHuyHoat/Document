/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class Ghi_tep_Vanban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tentep;
        System.out.println("Mời nhập đường dẫn tên tệp mới:");
        tentep = sc.nextLine();
        //Tạo vào ghi tệp văn bản
        FileOutputStream fo = null;
        PrintWriter pw =  null;
        try {
            fo =  new FileOutputStream(tentep, true);
            pw = new PrintWriter(fo);
            String str;
            while(true)
            {
                System.out.println("Nhập một chuỗi (ENTER ĐỂ KẾT THÚC):");
                str = sc.nextLine();
                if(str.equals(""))
                    break;
                else
                    pw.println(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Không tạo được tệp: " + tentep);
            Logger.getLogger(Ghi_tep_Vanban.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                if(pw!=null)
                    pw.close();
                if(fo!=null)
                    fo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ghi_tep_Vanban.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
