/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class SinhVien {
    String MSV,hoTen;
    double diem;
    public SinhVien(){
       
    }
    public SinhVien( String MSV, String hoTen,double diem){
        this.MSV=MSV;
        this.hoTen=hoTen;
        this.diem=diem;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi Nhap MSV:");
        MSV=sc.nextLine();
        System.out.println("Nhap Ho va Ten cua sinh vien: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap Diem cua sinh vien :");
        diem=sc.nextDouble();
    }
    public void hienThi(){
            System.out.println("MSV: "+MSV+"\t Ho va Ten : "+hoTen+"\t Diem:"+diem);
    }
}
