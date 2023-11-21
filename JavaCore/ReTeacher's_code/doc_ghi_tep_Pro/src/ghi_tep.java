
import Models.Students;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoatd
 */
public class ghi_tep {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("D:\\student.dat");

            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Students("SV01","Mai Huy Hoat",9.9));
              oos.writeObject(new Students("SV02","Tran The Duong",7.9));
                oos.writeObject(new Students("SV03","Do Van Thiem",8.9));
                System.out.println("Ghi Tệp thành công");
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi tạo file. Làm ơn thử lại.");
            Logger.getLogger(ghi_tep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ghi_tep.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(oos!=null)try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ghi_tep.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(fos!=null)try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(ghi_tep.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
