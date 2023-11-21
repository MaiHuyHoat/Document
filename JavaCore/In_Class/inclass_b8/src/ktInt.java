/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class ktInt {

  
    public static int NhapsoInt(){
        Scanner sc= new Scanner(System.in);
        int number;
        nhaplai:
        while(true){
        try{
           number=sc.nextInt();
         break;
        }
        catch(Exception e){
            System.out.println("Lỗi nhập số nguyên ");
            sc.nextLine();
        }
        }
        return number;
    }
    
}
