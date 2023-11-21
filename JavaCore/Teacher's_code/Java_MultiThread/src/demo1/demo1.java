/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

/**
 *
 * @author Tran Manh Truong
 */
public class demo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Luồng 1", 2500);
        MyThread t2 = new MyThread("Luồng 2", 3500);
        t1.start();//khởi động luồng t1 => phương thức run() sẽ được thực thi
        t2.start();
        System.out.println("Kết thúc hàm main");
    }
    
}
