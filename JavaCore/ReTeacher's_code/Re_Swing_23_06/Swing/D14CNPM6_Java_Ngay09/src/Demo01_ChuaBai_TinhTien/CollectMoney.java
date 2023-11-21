/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo01_ChuaBai_TinhTien;

/**
 *
 * @author Tran Manh Truong
 */
public abstract class CollectMoney {
    double ThanhTien;

    public CollectMoney() {
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    //phương thức trừu tượng để lớp con phát triển 
    public abstract double calculateMoney();
}
