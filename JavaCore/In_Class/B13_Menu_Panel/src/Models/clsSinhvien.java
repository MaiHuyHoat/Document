/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hoatd
 */
public class clsSinhvien {
    String masv;
    String hoten;
    String dienthoai;

    public clsSinhvien() {
    }

    public clsSinhvien(String masv, String hoten, String dienthoai) {
        this.masv = masv;
        this.hoten = hoten;
        this.dienthoai = dienthoai;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    
}
