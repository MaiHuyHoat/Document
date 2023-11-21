/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recode_b1;
import models.Sinhvien;
/**
 *
 * @author hoatd
 */
public class Recode_b1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sinhvien sv1 = new Sinhvien("Mai Huy Hoạt",1);
        sv1.setDanhHieu("Chiến thần code");
        sv1.show();
        Sinhvien inputSv1= new Sinhvien();
        inputSv1.scan();
        inputSv1.show();
    }
    
}
