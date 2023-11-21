/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.Bai2_Tudien;

import java.util.TreeMap;

/**
 *
 * @author Tran Manh Truong
 */
public class Tudien {
    TreeMap<String,String> td ;//key lưu tiếng Anh, value lưu tiếng Việt
    public Tudien(){
        td = new TreeMap<String,String>();
    }
    public boolean ThemTu(String ta, String tv){
        if(ta.equals("") || tv.equals("")){
            return false;
        }
        if(td.containsKey(ta)){//nếu từ tiếng anh đã có
            return false;
        }
        td.put(ta, tv);
        return true;
    }
    public void Hienthi(){
        for(String ta:td.keySet())
        {
            String tv = td.get(ta);
            System.out.println(ta + ":" + tv);
        }
    }
    public String Tratu(String ta){//trả về từ tiếng Việt nếu có, không thì trả về rỗng
        if(td.containsKey(ta)==false || td.isEmpty())
        {
            return "";
        }
        return td.get(ta);
    }
    public boolean Sua(String ta, String tv){
        if(td.containsKey(ta)){//Nếu từ tiếng Anh đã tồn tại
            td.put(ta, tv);//thêm ta vào cột key trùng với key đã có thì value sẽ được ghi đè (tiếng Việt)
            return true;
        }
        return false;
    }
    public boolean Xoa(String ta){
        if(td.containsKey(ta)){
            td.remove(ta);
            return true;
        }
        return false;
    }
}





