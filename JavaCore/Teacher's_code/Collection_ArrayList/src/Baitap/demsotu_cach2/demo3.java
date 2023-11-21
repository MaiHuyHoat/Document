/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.demsotu_cach2;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author truongtm
 */
public class demo3 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();//khai báo TreeMap để lưu từ cần thêm và số lần xuất hiện
        Scanner nhap = new Scanner(System.in);
        while(true)//nhập từng từ và thêm vào treemap với số lần xuất hiện tương ứng
        {
            String tucanthem;
            System.out.println("Nhập một từ (nhập rỗng để kết thúc)");
            tucanthem = nhap.nextLine();
            if(tucanthem.equals(""))
            {
                break;
            }
            //nếu từ cần thêm chưa có xuất hiện thì thêm vào treemap với số lần là 1
            //nếu từ cần thêm đã có thì lấy số lần xuất hiện tăng 1 đơn vị và gán đè lại vào số cũ
            
            if(tm.containsKey(tucanthem))//nếu từ cần thêm đã có
            {
                int n = tm.get(tucanthem);
                n = n+1;
                tm.put(tucanthem, n);
            }
            else //từ cần thêm chưa có trong cột key
            {
                tm.put(tucanthem, 1);//thêm vào treemap với số lần là 1
            }
        }

        //hiển thị kết quả
        System.out.println("Các từ và số lần xuất hiện");
        for(String tukhoa : tm.keySet())
        {
            int solan = tm.get(tukhoa);
            System.out.println(tukhoa + ":" + solan);
        }
    }
}
