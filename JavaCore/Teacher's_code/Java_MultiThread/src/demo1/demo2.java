/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class demo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Luồng 1", 2500);
        MyThread t2 = new MyThread("Luồng 2", 3500);
        t1.start();//khởi động luồng t1 => phương thức run() sẽ được thực thi
        t2.start();
        try {
            t1.join();// hàm main đợi hai luông chạy xong rồi mới chạy câu lệnh tuối cùng.
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(demo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Kết thúc hàm main");
    }
}
