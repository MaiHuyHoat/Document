/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author truongtm
 */
public class demo_ArrayList {
    public static void main(String[] args) {
        Collection c;
        
        List l;
        
        LinkedList ll;
        

        ArrayList list1 = new ArrayList();//mảng mỗi phần tử có thể có kiểu khác nhau
        ArrayList<String> list2 = new ArrayList<String>();//mảng mà mỗi phần tử phải là String
        ArrayList<Student> list3 = new ArrayList<Student>();//mảng mà mỗi phần tử là Student

        Student sv1 = new Student();
        Student sv2 = new Student("SV02", "Hoa",20, 90);

        String s1 = "abc";
        String s2 = "def";

        //mảng list1 có thể thêm bất kỳ phần tử có kiểu dữ liệu khác nhau
        list1.add(s1);
        list1.add(sv1);

        //mảng list2 mỗi phần tử phải là kiểu String
        list2.add(s1);
        //list2.add(sv1);
        //mảng list3 mỗi phần tử phải là kiểu Student
        list3.add(sv1);
        list3.add(sv2);

        System.out.println("Số phần tử của list1 là:" + list1.size());

        //lấy ra phần tử ở vị trí i nào đó
        String s3;
        s3  = (String)list1.get(0);//lấy phần tử ở vị trí 0, phải ép kiểu ví nó trả về kiểu Object chung chung
        Student sv3 = (Student)list1.get(1);//lấy phần tử ở vị trí 1, phải ép kiểu ví nó trả về kiểu Object chung chung

        String s4 = list2.get(0);//không cần ép kiểu vì đã khai báo từ đầu mỗi phần tử là 1 String
        Student sv4 = list3.get(0);//không cần ép kiểu vì đã khai báo từ đầu mỗi phần tử là 1 Student

        
    }
}
