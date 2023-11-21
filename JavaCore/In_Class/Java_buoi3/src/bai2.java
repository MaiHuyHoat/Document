/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */


import Models.QL_SinhVien;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int c,flag=0;
       QL_SinhVien sv= new QL_SinhVien();
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("1.Nhập danh sách sinh viên \n"
                + "2.Hiển thị danh sách sinh viên \n"
                + "3.Sắp xếp theo điểm giảm dần\n"
                + "4.Thoát");
        System.out.println("Nhập chọn lựa: ");
      c=sc.nextInt();
      if(c==1){
          sv.Nhap();
          flag=1;
          System.out.println("");
          System.out.println("Đã thực hiện xong chức năng nhập danh sách sinh viên .");
          System.out.println("Đã Quay lại Menu chính . Mời nhập lựa chọn tiếp theo");
          System.out.println("");
      }
      else if(c==2){
          sv.hienThi();flag=1;
           System.out.println("");
          System.out.println("Đã thực hiện xong chức hiển thị danh sách sinh viên .");
          System.out.println("Đã Quay lại Menu chính . Mời nhập lựa chọn tiếp theo");
          System.out.println("");
      }  
      else if(c==3){
          sv.sapXep();flag=1;
           System.out.println("");
          System.out.println("Đã thực hiện xong chức năng sắp xếp danh sách sinh viên theo điểm .");
          System.out.println("Đã Quay lại Menu chính . Mời nhập lựa chọn tiếp theo");
          System.out.println("");
          
      }
        }while(flag==1&&c!=4);
        if(c==4)
            System.out.println("chuong trinh ket thuc");
    }
}
