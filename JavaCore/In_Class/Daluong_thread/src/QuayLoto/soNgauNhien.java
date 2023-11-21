/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLoto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author hoatd
 */
public class soNgauNhien implements Runnable{
    public  JLabel blbso;

    public int delayTime;
    public Thread thread;

    public soNgauNhien(JLabel blbso,int delayTime) {
        this.blbso = blbso;

        this.delayTime= delayTime;
        thread= new Thread(this);
        thread.start();
                
    }

    @Override
    public void run() {
    
      for(int i=0;i<100;i++){
          Random rd= new Random();
          int n= rd.nextInt(9);// random ngau nhien tu 1 -9
          this.blbso.setText(String.valueOf(n));
          try {
              thread.sleep(delayTime);
          } catch (InterruptedException ex) {
              Logger.getLogger(soNgauNhien.class.getName()).log(Level.SEVERE, null, ex);
          }
      }

    }
    
    
}
