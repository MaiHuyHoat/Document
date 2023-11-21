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
public class monHoc {
    String maMonHoc, tenMon;

    public monHoc(String maMonHoc, String tenMon) {
        this.maMonHoc = maMonHoc;
        this.tenMon = tenMon;
    }
    @Override
    public String toString(){
        return "Mã môn học: "+maMonHoc+" - Tên môn học: "+tenMon;
        
    }
            
}
