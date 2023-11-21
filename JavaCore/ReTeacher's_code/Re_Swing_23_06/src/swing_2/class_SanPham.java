/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_2;

/**
 *
 * @author hoatd
 */
public class class_SanPham {
    String tenSP,maSP,xuatXu;
    double gia;

    public class_SanPham(String tenSP, String maSP, String xuatXu, double gia) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.xuatXu = xuatXu;
        this.gia = gia;
    }
    public String toString(){
        return "Tên Sản phẩm: "+tenSP + "Mã Sản phẩm: "+maSP+" Xuất xứ: "+xuatXu+" Giá: "+gia;
    }
    
}
