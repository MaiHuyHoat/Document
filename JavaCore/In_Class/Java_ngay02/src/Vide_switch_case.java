/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Vide_switch_case {

    enum xepLoai {
        truot, trungbinh, kha, gioi
    }
    String arg;
    public static void main(String[] args) {
        xepLoai xl = xepLoai.truot;
        xl  = xepLoai.kha;
        System.out.println("xep loai:" + xl);
        switch (xl) {
            case truot:
                System.out.println("Truot");
                break;
            case trungbinh:
                System.out.println("trung binh");
                break;
            case kha:
                System.out.println("kha");
                break;
            default:
                System.out.println("gioi");
        }
    }
}
