/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Scanner;
import Models.SinhVien;

/**
 *
 * @author hoatd
 */
public class QL_SinhVien {

    SinhVien[] arr = new SinhVien[30];
    int n;

    public QL_SinhVien() {

    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so Sinh Vien can tao: ");
            this.n = sc.nextInt();
        } while (n < 0 || n > 30);

        for (int i = 0; i < n; i++) {
            arr[i] = new SinhVien();
            System.out.println("Nhap vao sinh vien thu :" + (i+1));
            arr[i].nhap();
        }
    }

    public void hienThi() {
        System.out.println("Danh Sach sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("MSV: " + arr[i].MSV + "\t Ho va Ten : " + arr[i].hoTen + "\t Diem:" + arr[i].diem);
        }
    }

    public void sapXep() {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (this.arr[j].diem > this.arr[j + 1].diem) {
                    SinhVien temp = new SinhVien();
                    temp = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                }
            }
        }
        System.out.println("danh sahc sau khi sap xep diem:");
        for(int i=0;i<n;i++){
               System.out.println("MSV: " + arr[i].MSV + "\t Ho va Ten : " + arr[i].hoTen + "\t Diem:" + arr[i].diem);
        }
    }
}
