/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
import Annonymous.Hinh;
import java.util.Scanner;
public class Annonymous {
    public static void main(String[] args) {
            Hinh h = new Hinh(){
        public double Bankinh;
        @Override
        public void hienThi(){
            System.out.println("Hình Tròn");
            System.out.println("Bán Kính: "+Bankinh);
        }
        @Override
        public void setData(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhập vào bán kính của hình tròn: ");
            this.Bankinh=sc.nextDouble();
        }
    };
    h.setData();
    h.hienThi();
    }
}
