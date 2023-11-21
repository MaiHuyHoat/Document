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
public class Magazine extends Generate {
    int soPH,thangPH;
    



    public Magazine() {
        L=2;
    }
    @Override
    public void add(){
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("Nhập số phát hành cho tạp chí: ");
        this.soPH=sc.nextInt();
      
        sc.nextLine();
        System.out.println("Nhập tháng phát hành của tạp chí: ");
        this.thangPH=sc.nextInt();
    }
    @Override
    public void display(){
        System.out.println("Mã tài liệu: "+maTL+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+""
                + " Số phát hành của tạp chí: "+soPH+"Tháng phát hành tạp chí: "+thangPH);
        
    }
}
