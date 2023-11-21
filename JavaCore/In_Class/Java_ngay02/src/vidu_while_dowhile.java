/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class vidu_while_dowhile {
    public static void main(String[] args) {
        // ap dung cho so lan lap khong biet bao nhieu lan
        System.out.println(" Vi du vong lap");
        int i=0;
        //neu dieu kien sai ngay tu dau thi khong lap lan nao ca
        while(i<5){
     
                    System.out.println("vong lap 1 , i="+i);
                  i++;
        }
        // vong lap do while
        do{
            System.out.println("vong lap 2, i="+i);
                  i++;  
        }while(i<=20);
    }
}
