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
public class Book extends Generate {
    String tacGia;
    int soTrang;

    public Book() {
        L=1;
    }
    @Override
    public void add(){
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("Nhập tác giả cho sách: ");
        this.tacGia=sc.nextLine();
   
        
        System.out.println("Nhập số trang của sách: ");
        this.soTrang=sc.nextInt();
    }
    @Override
    public void display(){
        System.out.println("Mã tài liệu: "+maTL+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+" Tên nhà xuất bản: "+tenNXB+" Số bản phát hành: "+soBanPH+""
                + " Tên tác giả: "+tacGia+" Số Trang: "+soTrang);
        
    }
  
}
