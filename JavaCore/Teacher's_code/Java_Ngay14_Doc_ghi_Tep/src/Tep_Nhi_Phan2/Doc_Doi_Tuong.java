/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tep_Nhi_Phan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Doc_Doi_Tuong {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:\\Students.dat");
            ois = new ObjectInputStream(fis);
            int n = ois.readInt();//đọc số nguyên là số đối tượng đã ghi
            for(int i=0; i<n;i++)
            {
                Student sv = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
                arr.add(sv);
            }
            System.out.println("Hiển thị sinh viên:" + n);
            for(Student sv : arr)
            {
                System.out.println(sv);
            }
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
