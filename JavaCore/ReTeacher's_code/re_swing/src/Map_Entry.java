
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Map_Entry {
    public static void main(String[] args) {
HashMap<Integer,String> list= new HashMap<Integer,String>();
list.put(1,"Mai Huy Hoạt");
list.put(2,"Mai Thị Nhật Hằng");
list.put(3,"Siêu boé khổng lồ");
list.put(4,"Boé");
        Set<Map.Entry<Integer,String>> setMap=list.entrySet();
       
        for(Map.Entry element: setMap){
            System.out.println(element.getKey()+" | "+element.getValue());
        }
                
        
                
    }
}
