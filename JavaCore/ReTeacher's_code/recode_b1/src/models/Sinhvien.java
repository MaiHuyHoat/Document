/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.Scanner;
/**
 *
 * @author hoatd
 */
public class Sinhvien {
    String hoTen;
    int MSV;
    String danhHieu;
    public Sinhvien(String hoTen, int MSV){
        this.MSV=MSV;
        this.hoTen=hoTen;
    }
    public Sinhvien(){
        
    }
    public void setDanhHieu(String danhHieu){
        this.danhHieu=danhHieu;
    }
    public void show(){
        System.out.println(" Mã sinh viên:"+MSV);
        System.out.println("\n Họ Và Tên : "+hoTen);
        System.out.println(" Danh hiệu : "+danhHieu);
    }
    public void scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên :");
        MSV =sc.nextInt();
        sc.nextLine();
        System.out.println(" Nhập Họ Và Tên :");
        hoTen=sc.nextLine();
        System.out.println("Danh hiệu của Sinh Viên :");
        danhHieu=sc.nextLine();
        }
}
