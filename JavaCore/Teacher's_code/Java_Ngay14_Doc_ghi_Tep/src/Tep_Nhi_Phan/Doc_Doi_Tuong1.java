/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tep_Nhi_Phan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Doc_Doi_Tuong1 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:\\Students.dat");
            ois = new ObjectInputStream(fis);
            Student sv1 = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
            System.out.println(sv1);
            Student sv2 = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
            System.out.println(sv2);
            Student sv3 = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
            System.out.println(sv3);
        } catch (FileNotFoundException ex) {
                System.out.println("Có lỗi mở tệp để đọc!");
                Logger.getLogger(Ghi_Doi_Tuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                ois.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
