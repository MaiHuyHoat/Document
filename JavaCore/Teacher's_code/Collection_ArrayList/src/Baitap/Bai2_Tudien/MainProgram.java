/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.Bai2_Tudien;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class MainProgram {
    public static int Menu(){
        int chon;
        while(true){
            try{
                Scanner nhap = new Scanner(System.in);
                System.out.println("Từ điển Anh - Việt"
                    + "\n1. Thêm từ mới\n2.Hiển thị toàn bộ"
                    +"\n3.Tra từ\n4.Sửa từ\n5.Xóa từ\n6.Thoát"
                    +"\nMời bạn chọn:");
                chon = nhap.nextInt();
                return chon;
            }
            catch (java.util.InputMismatchException e){
                System.out.println("Bạn nhập sai");
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
    public static void main(String[] args) {
        int chon;
        Scanner nhap = new Scanner(System.in);
        Tudien td = new Tudien();
        String ta,tv;
        boolean b;
        do{
            chon = Menu();
            switch(chon){
                case 1:
                    System.out.println("Từ tiếng anh:");
                    ta = nhap.nextLine();
                    System.out.println("Từ tiếng việt:");
                    tv = nhap.nextLine();
                    b =td.ThemTu(ta, tv);
                    if(!b){
                        System.out.println("Lỗi thêm từ");
                    }
                    break;
                case 2:
                    System.out.println("Thông tin từ điển:");
                    td.Hienthi();
                    break;
                case 3:
                    System.out.println("Từ tiếng anh:");
                    ta = nhap.nextLine();
                    tv = td.Tratu(ta);
                    if(tv.equals("")){
                        System.out.println("Chưa có từ '" + ta + "'");
                    }
                    else{
                        System.out.println("Từ Tiếng việt là: " + tv);
                    }
                    break;
                case 4:
                    System.out.println("Từ tiếng anh:");
                    ta = nhap.nextLine();
                    System.out.println("Từ tiếng việt:");
                    tv = nhap.nextLine();
                    b = td.Sua(ta, tv);
                    if(!b){
                        System.out.println("chưa có từ: " + ta);
                    }
                    break;
                case 5:
                    System.out.println("Từ tiếng anh:");
                    ta = nhap.nextLine();
                    b = td.Xoa(ta);
                    if(!b){
                        System.out.println("chưa có từ: " + ta);
                    }
                    break;
                case 6:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        }while(chon!=6);
    }
}




