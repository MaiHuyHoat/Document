/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.demsotu_cach1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author truongtm
 */
public class demo2 {
 public static void main(String[] args) {
        ArrayList<tumoi> danhsach = new ArrayList<tumoi>();

        Scanner nhap = new Scanner(System.in);

        while(true)//nhập từng từ và thêm vào sanh sách kèm theo số lần xuất hiện
        {
            String tucanthem;
            System.out.println("Nhập một từ (nhập rỗng để kết thúc)");
            tucanthem = nhap.nextLine();
            if(tucanthem.equals(""))
            {
                break;
            }
            //tìm kiếm xem tucanthem đã tồn tại trong dách sách chưa, nếu tồn tại thi lấy vitri xuất hiện trong danhsach
            boolean timduoc = false;
            int vitri =-1;
            for(int i =0; i<danhsach.size();i++)
            {
                tumoi t = danhsach.get(i);
                if(t.noidung.equalsIgnoreCase(tucanthem)){
                    timduoc  = true;
                    vitri = i;
                    break;
                }

            }

            //đưa vào danh sách
            if(timduoc)//nếu tìm được thì lấy giá trị hiện tại, tăng 1 đơn vị và ghi đè lại vào danhsach
            {
                tumoi tn = danhsach.get(vitri);
                tn.solan = tn.solan +1;
                danhsach.set(vitri, tn);//gán đè đối tượng tn vào vị trí tìm được của mảng danhsach
            }
            else//không tìm được (từ mới chưa có trong danh sách) thì thêm vào danh sách với số lần là 1
            {
                tumoi tm = new tumoi(tucanthem,1);
                danhsach.add(tm);
            }

        }
        //hiển thị kết quả
        System.out.println("Các từ và số lần xuất hiện");
        for(tumoi tm : danhsach)
        {
            System.out.println(tm.noidung + ":" + tm.solan);
        }
    }
}
