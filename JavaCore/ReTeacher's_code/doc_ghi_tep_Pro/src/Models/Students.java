/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author hoatd
 */
public class Students implements Serializable {
    String masv,hoten;
    double diem;

    public Students() {
    }

    public Students(String masv, String hoten, double diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    @Override
    public String toString(){
        return masv+" "+hoten+" "+diem;
    }
}
