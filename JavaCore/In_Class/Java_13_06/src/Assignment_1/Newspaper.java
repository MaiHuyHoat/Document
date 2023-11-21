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
public class Newspaper extends Generate {
    int ngayPH;

    public Newspaper() {
        L=3;
    }

    
    @Override
      public void add(){
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("Nhập ngày phát hành cho báo: ");
        this.ngayPH=sc.nextInt();
     
    }
          @Override
    public void display(){
        System.out.println("Mã tài liệu: "+maTL+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+""
                +"Ngày phát hành: "+ngayPH);
        
    }
      
}
