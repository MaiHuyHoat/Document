/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Tran Manh Truong
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

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    
}
