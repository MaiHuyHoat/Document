/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tep_Nhi_Phan2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ghi_Doi_Tuong {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student("SV01","A",8.5));
        arr.add(new Student("SV02","B",9.5));
        arr.add(new Student("SV03","C",10));
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("D:\\Students.dat");
            oos = new ObjectOutputStream(fos);
            
            oos.writeInt(arr.size());
            for(int i=0; i<arr.size();i++)
            {
                oos.writeObject(arr.get(i));
            }
            
            System.out.println("Ghi tệp thành công");
        } catch (FileNotFoundException ex) {
            System.out.println("Có lỗi mở tệp để ghi!");
            Logger.getLogger(Ghi_Doi_Tuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            System.out.println("Có lỗi!");
        }
        finally{
            try{
                fos.close();
                oos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }           
    }
}
