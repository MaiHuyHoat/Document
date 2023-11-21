
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Vidu_if_else {
    public static void main(String[] args) {
        // tim max 2 so
        int a,b,c,max;
        Scanner sc= new Scanner(System.in);
        System.out.print(" A= ");
        a = sc.nextInt();
        System.out.print("B=");
        b=sc.nextInt();
        System.out.print("C=");
        c=sc.nextInt();
       max=(a>b)?a:b;
       max=(max<c)?c:max;
        System.out.println("max="+max);
    }
}
