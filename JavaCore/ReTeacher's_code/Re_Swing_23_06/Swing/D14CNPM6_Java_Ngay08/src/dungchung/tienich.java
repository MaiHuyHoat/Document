/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungchung;

/**
 *
 * @author Tran Manh Truong
 */
public class tienich {
    //kiểm tra chuỗi có ở dạng số hay không?
    public static boolean isNumeric(String so){
        try{
            double d = Double.parseDouble(so);//chuyển từ String sang Double
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
