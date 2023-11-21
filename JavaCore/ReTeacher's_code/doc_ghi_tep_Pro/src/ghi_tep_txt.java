
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
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
public class ghi_tep_txt {
    public static boolean isEmptyString(String str){
        return str==null || str.trim().length()==0;// xoá bỏ khoảng trống đầu và cuối là trim() nếu độ dài chuỗi bằng 0 thì  và giá trị chuỗi là null thì trả về giá trị true.
    }
    public static void main(String[] args) {
        String url="F:\\FPT_APTECH\\Ki_2\\Java\\ReTeacher's_code\\doc_ghi_tep_Pro\\ghi_tep.txt";
        Scanner sc= new Scanner(System.in);
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try {
             fw= new FileWriter(url,true);
             pw= new PrintWriter(fw);
            String write=null;
            System.out.println("Nhập dữ liệu bên dưới ( Nhập khoảng trống để kết thúc việc nhập liệu): ");
            do{
                write=sc.nextLine();
                pw.println(write);
            
            }while(isEmptyString(write)==false);
                pw.flush();
            System.out.println("Nhập liệu xong");
        } catch (IOException ex) {
            Logger.getLogger(ghi_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(pw!=null)pw.close();
            if(fw!=null)try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(ghi_tep_txt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
