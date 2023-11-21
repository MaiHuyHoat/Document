
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class doc_tep_txt {
    public static void main(String[] args) {
        FileReader fr= null;
        BufferedReader br=null;
        String url="F:\\FPT_APTECH\\Ki_2\\Java\\ReTeacher's_code\\doc_ghi_tep_Pro\\ghi_tep.txt";
        System.out.println("Nội dung tệp");
        try {
            fr= new FileReader(url);
            br= new BufferedReader(fr);
            String str;
            while(( str=(String)br.readLine())!=null){
                System.out.println(str);
            }
            System.out.println("Đã đọc tệp xong");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(doc_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(doc_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(br!=null)try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(doc_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fr!=null)try {
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(doc_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
