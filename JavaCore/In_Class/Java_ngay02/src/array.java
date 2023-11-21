/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class array {

    public static void main(String[] args) {
        // c: int arr[10]
        // java: int [] arr;
        //arr = new int [10]
        // thuong viet int [] arr= new int [10]
        //=> java: ( kieu du lieu) [] ( ten mang) = new ( kieu du lieu) [kick co mang]
        int[] a; // vien a kieu mang int
        a = new int[10];// khoi tao mang chua 10 so int gan cho a
        String[] str = new String[2];
        str[0] = "mai huy hoat";
        str[1] = "fpt-aptech";
        // for(kieu_ dulieu bien: bienmang){}
        for (String i : str) {
            System.out.println(i);
        }
        float[] diem = {5.5f, 6.7f, 8.5f};
        for (float j : diem) {
            System.out.println(j);
        }
     /* mang 2 chieu
        
        
        **/
    }

}
