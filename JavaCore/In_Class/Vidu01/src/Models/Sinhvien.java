/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Scanner;//khia bao duong dan toi lop Sacnner ( laf lop de nhap du lieu)
/**
 *
 * @author hoatd
 */
public class Sinhvien {
    int masv; // khai bao cac thuoc tinh
    String hoten;
    // khai bao mot so phuong thuc
    public Sinhvien(int masv, String hoten){
        this.masv = masv;
        this.hoten= hoten;
    }
    // ham nhap sinh vine
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap ma SV");
        sc.nextLine();
        masv =sc.nextInt();//nhap so nguyen
        System.out.println("nhap ho ten :");
        
    }
    public void Hienthi(){
        System.out.println("sinh vien:"+masv+"\n ho va ten "+hoten);
    }
}
