/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author Tran Manh Truong
 */
public class demo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("thread 1", 2500));
        MyRunnable r2 = new MyRunnable("thread 2",3500);
        Thread  t2 = new Thread(r2);
        t1.start();
        t2.start();
        System.out.println("Kết thúc hàm main");
    }
}
