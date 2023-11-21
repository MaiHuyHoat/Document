/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;


/**
 *
 * @author Tran Manh Truong
 */
public class demo3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Luồng 1 ", 2500);
        MyThread t2 = new MyThread("Luồng 2", 3500);
        System.out.println("Kết thúc hàm main");
    }
}
