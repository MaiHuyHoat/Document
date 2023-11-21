/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Recursive_inJava {
    int count=0;
     void p(){
        count++;
        if(count<10){
        System.out.println("Ví dụ về Đệ quy trong Java: Lần  "+count);
        p();}
    }
     int n1=0, n2=1,n3=0;
     void printFibo(int value ){
         if(value >0){
             n3=n2+n1;
             n1=n2;
             n2=n3;
             System.out.println(" "+n3);
             printFibo(value-1);
         }
     }
     public static void main(String[] args) {
        Recursive_inJava recur= new Recursive_inJava();
//        recur.p();
        recur.printFibo(13);
    }
}
