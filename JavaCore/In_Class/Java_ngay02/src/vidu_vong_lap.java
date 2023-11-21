/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class vidu_vong_lap {
    public static void main(String[] args) {
        System.out.println(" Vi du vong lap");
        for(int i=1;i<=5;i++){
            System.out.println("vong lap , i="+i);
        }
        System.out.println("xong vong lap1");
        // vong lap khuyet mot so phan tu
        int i=1;
        for(;;){
            if(i==6)break;
            System.out.println("vong lap , i="+i);
                   i++;
        }
        System.out.println("xong vong lap 2");
        //vong lap co nhieu phan tu co nhieu lenh
        System.out.println("vi du vong lap 3");
       
        for(int j=1, k=10;j<=k;j++,k--){
   
            System.out.printf(" \n vong lap , i=%d,k=%d",j,k); // viet giong kieu cua ngon ngu C
                
        }
        System.out.println("\n xong vong lap 3");
    }
}
