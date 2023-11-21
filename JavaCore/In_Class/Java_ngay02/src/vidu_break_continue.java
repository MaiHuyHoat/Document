/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class vidu_break_continue {
     public static void main(String[] args) {
        System.out.println(" Vi du vong lap");
        for(int i=1;i<=5;i++){
            if(i==4)break;
            else if(i==2)continue;
                    System.out.println("vong lap , i="+i);
        }
        
    }
}
