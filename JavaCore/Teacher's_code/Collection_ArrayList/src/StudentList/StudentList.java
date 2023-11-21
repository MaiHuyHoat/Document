/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class StudentList {
    
    ArrayList<Student> stArray = new ArrayList<Student>(); //mảng chứa sinh viên
    public StudentList()
    {
        
    }
    public void inputList()
    {
       Scanner nhap = new Scanner(System.in);
       String s;
       int i = 0;
       do{//nhập các sinh viên, mỗi lần nhập xong thì trả lời có tiếp hay không
            Student st = new Student();//tạo 1 sinh viên mới
            i++;
            System.out.println("Nhập sinh viên thứ " + i + ":");
            st.input();//nhập thông tin cho sinh viên từ bàn phím
            stArray.add(st);//đưa sinh viên vào mảng
            System.out.println("Tiếp tục?(c/k)");
            s = nhap.nextLine(); //nhập một chuỗi hoặc 1 ký tự
        }while(s.equalsIgnoreCase("c")); //nếu chuỗi vừa nhập bằng c hoặc C thì quay lại nhập tiếp, ngược lại thì thoát khỏi vòng lặp
       
    }
    public void displayList()
    {
       System.out.println("Danh sach sinh vien:");
       for(int i=0; i<stArray.size();i++){
           stArray.get(i).display(); //hiển thị sinh viên thứ i
       }
    }
    public void sapxepTen()
    {
        for(int i=0; i<stArray.size()-1;i++)
        {
            for(int j=i+1; j<stArray.size();j++)
            {
                Student temp;
                if(stArray.get(i).name.compareToIgnoreCase(stArray.get(j).name)>0)//nếu tên của sinh viên i lớn hơn tên của sinh viên j
                {
                    temp = stArray.get(i);
                    stArray.set(i, stArray.get(j));
                    stArray.set(j, temp);
                }
            }
        }
    }
   
}
