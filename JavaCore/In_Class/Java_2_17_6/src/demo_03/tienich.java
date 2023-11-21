/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_03;

/**
 *
 * @author hoatd
 */
public class tienich {
    public static boolean isNumeric(String so){
        try{
            double d=Double.parseDouble(so);
            return true;
        }catch(Exception e){
            
            return false;
        }
    }
}
