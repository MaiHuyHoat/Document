
import Assignment_1.function_of_ass_1;
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
public class Assignment_1_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        function_of_ass_1 function= new function_of_ass_1();
        int c;
        do{
        System.out.println("MENU:\n" +
"1. Thêm mới tài liêu: Sách, tạp chí, báo.\n" +
"2. Xoá tài liệu theo mã tài liệu.\n" +
"3. Hiện thị thông tin về tài liệu.\n" +
"4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.\n" +
"5. Thoát khỏi chương trình.\n" +
"Mời chọn chức năng (1->5):");
        c=sc.nextInt();
        switch(c){
            case 1:
                function.addDocument();c=6;break;
            case 2:
                function.remove();c=6;break;
            case 3:
                   function.display();c=6;break;
            case 4:
                function.search();c=6;break;
            case 5:
                System.out.println("Xin chào và hẹn gặp lại.");
            default:
                System.out.println("Chọn sai mời chọn lại.");
        }
    }while(c!=5);
    }
}
