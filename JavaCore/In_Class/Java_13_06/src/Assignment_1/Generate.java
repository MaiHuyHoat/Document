/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public abstract class  Generate {
    String maTL,tenNXB;
    int soBanPH;
    int L;

    public Generate(String maTL, String tenNXB, int soBanPH, int L) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
        this.L = L;
    }
   
    

    public Generate() {
    }
    public  void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu: ");
        maTL=sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        tenNXB=sc.nextLine();
       
        System.out.println("Nhập số bản phát hành: ");
        soBanPH=sc.nextInt();
    };
    public abstract void add();
    public abstract void display();
}
