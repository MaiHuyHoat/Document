
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
public class while2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        int i=1;
        System.out.println("Vi du vong lap while");
        while(true){
            System.out.println("lap i="+i);
            System.out.println("tiep tuc khong ? (C/K)");
            str = sc.nextLine();
            if(str.equalsIgnoreCase("k")){
                break;
            }
            i++;
        }
    }
}
