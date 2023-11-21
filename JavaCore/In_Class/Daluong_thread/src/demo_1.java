
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
public class demo_1 {
    public static void main(String[] args) {
        MyThread thread1= new MyThread("Nội dung 1",2500);
                MyThread thread2= new MyThread("Nội dung 2",1500);
        try {
            thread1.th.join();
            thread2.th.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(demo_1.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("Kết thúc hàm main");
    }
}
