/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tep_Nhi_Phan;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Doc_Doi_Tuong2 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:\\Students.dat");
            ois = new ObjectInputStream(fis);
            Student sv ;
            while( (sv = (Student)ois.readObject())!=null)
            {
                System.out.println(sv);
            }
        } catch (FileNotFoundException ex) {
                System.out.println("Có lỗi mở tệp để đọc!");
                Logger.getLogger(Ghi_Doi_Tuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(EOFException e1)//bẫy lỗi kết thúc tệp
        {
            System.out.println("Ket thuc tep - EOF");
        }
        catch(Exception e2){
            e2.printStackTrace();
        }
        finally{
            try{
                ois.close();
                fis.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
