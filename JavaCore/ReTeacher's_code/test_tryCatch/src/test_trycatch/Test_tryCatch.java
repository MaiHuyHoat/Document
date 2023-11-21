/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_trycatch;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class Test_tryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double a;
        while(true){
        try{
            System.out.println("Nhập vào một số nguyên :");
            a=sc.nextDouble();
            break;
        }
        catch(Exception b){
            System.out.println("Lỗi nhập liệu: Bạn đang nhập chuỗi. Mời nhập lại là một số nguyên:");
            System.out.println(b);
            sc.nextLine();
        }
    }
        System.out.println("Nhập số nguyên thành công . Số bạn vừa nhập là: "+a);
    
    }    
}
