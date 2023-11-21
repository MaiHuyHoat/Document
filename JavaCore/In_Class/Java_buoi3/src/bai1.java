/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
import Models.SinhVien;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner (System.in);
        do{
        System.out.println("Nhap do dai cua mang sinh vien : ");
        n=sc.nextInt();
        }while(n>30||n<0);
        SinhVien [] arr= new SinhVien[n];
        for(int i=0;i<n;i++){
            arr[i]=new SinhVien();
            arr[i].nhap();
        }
        System.out.println("Danh Sach Sinh vien da duoc nhap: ");
        for(int i=0;i<n;i++){
            arr[i].hienThi();
        }
    }
}
