/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class daHinh_con extends daHinh_Parrent {
    String name="Mai Thi Nhat Hang";

    public daHinh_con() {
    }
    public static void main(String[] args) {
        daHinh_Parrent cha;
        cha= new daHinh_con();
        System.out.println(cha.name);// da hinh luc runtime voi thanh vien du lieu
    }
}
