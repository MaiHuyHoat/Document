/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author hoatd
 */
public class clsSoNgauNhien implements Runnable {// kế thừa  interface Runnable
    JLabel lblSo;
    JLabel lblTrangthai;
    int delay;
    Thread thread;// khai báo đối tượng thread

    public clsSoNgauNhien(JLabel lblSo, JLabel lblTrangthai, int delay) {
        this.lblSo = lblSo;
        this.lblTrangthai = lblTrangthai;
        this.delay = delay;
        thread = new Thread( this);// tự động tạo luồng thread luôn khi khởi tạo
        thread.start();// gọi hàm run để chạy
    }
    @Override
    public void run(){
        lblTrangthai.setText("Đang chạy");
        for(int i=0;i<100;i++){// thực hiện 100 lần random
            
            Random rd= new Random();// tạo đối tượng thực hiện random
            
            int n=rd.nextInt(9);// random từ 1-9
            String soNgauNhien=String.valueOf(n);
            lblSo.setText(soNgauNhien);
            try {
                thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(clsSoNgauNhien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        lblTrangthai.setText("Kết thúc.");
    }
       
}
