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
    public int id;
    public String masv;
    public String hoten;
    public boolean gioitinh;
    public String diachi;
    public int malop;
    public String tenlop;
    public String hinhanh;
    public clsSinhvien()
    {
    }
    public clsSinhvien(int id, String masv, String hoten,
           boolean gioitinh, String diachi, int malop, String hinhanh)
    {
        this.id = id;
        this.masv = masv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.malop = malop;
        this.hinhanh = hinhanh;
    }
}
