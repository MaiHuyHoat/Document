/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author hoatd
 */
public class monHoc {
    String name;
    int phiHoc;

    public monHoc() {
    }

    public monHoc(String name, int phiHoc) {
        this.name = name;
        this.phiHoc = phiHoc;
    }
    @Override
    public String toString(){
        return "Môn học: "+name +" Mức học phí: "+phiHoc ;
    }
    
}
