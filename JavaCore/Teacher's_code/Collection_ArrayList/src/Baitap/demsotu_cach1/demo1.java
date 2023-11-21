/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.demsotu_cach1;

import java.util.ArrayList;

/**
 *
 * @author truongtm
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<tumoi> danhsach = new ArrayList<tumoi>();
        //demsolan t1 =new demsolan();
        //t1.tu = "learn"; t1.solan =1;

        //String str = "learn java by example guide to advanced java";
        tumoi t1 =new tumoi("learn",1);
        danhsach.add(t1);

        tumoi t2 =new tumoi("java");
        danhsach.add(t2);

        ///.... cac tu

        //từ mới tồn tại rồi thì không thêm vào danh sách mà tăng số lần lên 1 đơn vị
        ///demsolan tn =new demsolan("java",2);
        //danhsach.add(tn);

        //String tucanthem = "advanced";
        String tucanthem = "java";//chạy 1 trong 2 giá trị để xem kết quả của thuật toán dươi
        
        //tìm kiếm xem tucanthem đã tồn tại trong dách sách chưa, nếu tồn tại thi lấy vitri xuất hiện trong danhsach
        boolean timduoc = false;
        int vitri =-1;
        for(int i =0; i<danhsach.size();i++)
        {
            tumoi t = danhsach.get(i);
            if(t.noidung.equals(tucanthem)){
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

        //hiển thị kết quả
        System.out.println("Các từ và số lần xuất hiện");
        for(tumoi tm : danhsach)
        {
            System.out.println(tm.noidung + ":" + tm.solan);
        }
    }
}
