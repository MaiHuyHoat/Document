/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import demo2.MyRunnable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class MyThread implements Runnable{
    String content;
    int delaytime;
    Thread thread;

    public MyThread() {
        
    }

    public MyThread(String content, int delaytime) {
        this.content = content;
        this.delaytime = delaytime;
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i +", " + content);
            try {
                Thread.sleep(delaytime);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Kết thúc tiến trình: " + content);
    }
    
}
