/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoNgauNhien;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Tran Manh Truong
 */
public class clsSoNgauNhien implements Runnable{
    JLabel lblSo;//label trên form để hiển thị số ngẫu nhiên
    JLabel lblTrangthai;//label trên form để hiển thị trạng thái (đang chạy, dừng)
    int delayTime;
    Thread thread;
    public clsSoNgauNhien(JLabel labelSo, JLabel labelTrangThai, int time){
        lblSo = labelSo;
        lblTrangthai = labelTrangThai;
        delayTime = time;
        thread = new Thread(this);
        thread.start();//gọi hàm run() thực hiện
    }
    @Override
    public void run(){
        lblTrangthai.setText("Đang chạy....");
        for(int i=1;i<=100;i++)//lặp 100 lần mỗi lần sinh 1 số ngẫu nhiên
        {
            Random rd = new Random();
            int n = rd.nextInt(9);//sinh số ngẫu nhiên dạng int từ 0-9
            String SoNgauNhien = String.valueOf(n);
            lblSo.setText(SoNgauNhien);
            try {
                thread.sleep(delayTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(clsSoNgauNhien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lblTrangthai.setText("Kết thúc!");
    }
}
