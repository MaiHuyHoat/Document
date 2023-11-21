
import Models.Students;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class doc_tep_Object {
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois= null;
        try {
            fis= new FileInputStream("D:\\student.dat");
            try {
                ois= new ObjectInputStream(fis);
                Students sv;
                try {
                    while((  sv=(Students)ois.readObject())!=null){
                        System.out.println(sv);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(doc_tep_Object.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(EOFException ex){
                    System.out.println("Kết thúc tệp.");
                }
                        
            } catch (IOException ex) {
                Logger.getLogger(doc_tep_Object.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(doc_tep_Object.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            if(ois!=null)try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(doc_tep_Object.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(fis!=null)try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(doc_tep_Object.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
