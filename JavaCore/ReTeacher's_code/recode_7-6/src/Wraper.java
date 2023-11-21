/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Wraper {
    public static void main(String[] args) {
        // đổi int thành Integer
        int a=20;
        Integer i= Integer.valueOf(a); // đổi int thành Integer;
        Integer j=a;//autoboxing , tự động đổi int thành Integer trong nội bộ trình biên dịch
        System.out.println("int thành Integer: "+a+"\n Đổi int thành Integer: "+i+"\n Autoboxing , tự động đổi int thành Integer trong nội bộ trình biên dịch: "+j);
    }
}
