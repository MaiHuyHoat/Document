/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.Bai1_DemSotu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Administrator
 */
public class WordApears {
    TreeMap<String,Integer> tm;//lưu từ vào key, số lần vào value
    ArrayList<String> al;//lưu các chuỗi nhập từ bàn phím
    //cấu tử khởi tạo
    public WordApears()
    {
        tm = new TreeMap<String,Integer>();
        al = new ArrayList<String>();
    }
    //Nhập các chuỗi lưu vào mảng al đến khi gặp chuỗi rỗng thì dừng
    public void Input()
    {
        if(!al.isEmpty())//nếu danh sách khác trống
        {
            al.clear();//xóa toàn bộ nội dung của mảng
        }
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập các chuỗi (nhập Enter để thoát):");
        while(true)
        {
            String s = nhap.nextLine();
            if(s.equals(""))
                break;
            else
                al.add(s);
        }
    }
    //Duyệt từng từ trong từng chuỗi, đưa vào biến tm (chuỗi,số lần)
    public void Count()
    {
        if(!tm.isEmpty())
        {
            tm.clear();
        }
        //duyệt từng chuỗi
        for(int i=0; i<al.size(); i++)
        {
            //tách mỗi chuỗi thành từng từ lưu vào mảng arr
            String[] arr = al.get(i).split(" ");
            //duyệt từng chuỗi trong mảng arr
            for(int j=0; j<arr.length;j++)
            {
                if(!tm.containsKey(arr[j]))//nếu chuỗi thứ j chưa có trong cột key của tm
                {
                    tm.put(arr[j], 1);//đưa chuỗi mới vào tm với value là 1
                }
                else//nếu chuỗi thứ j đã tồn tại trong cột key của tm
                {
                    int n = tm.get(arr[j]).intValue();//lấy value tương ứng với chuỗi ở cột key
                    tm.put(arr[j], n+1);//đưa chuỗi lại vào tm với value tăng 1 đơn vị
                }
            }
        }

    }
    //hiển thị nội dung của tm
    public void Display()
    {
        System.out.println("Kết quả:");
        for(String k : tm.keySet())
        {
            int v = tm.get(k);
            System.out.println(k + ":" + v);
        }
    }
}
