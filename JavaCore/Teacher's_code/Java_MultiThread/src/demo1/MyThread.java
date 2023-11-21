/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class MyThread extends Thread{
    String content;
    int delaytime;

    public MyThread(String content, int delaytime) {
        this.content = content;
        this.delaytime = delaytime;
    }

    public MyThread() {
    }
    @Override
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println(i + ", " + content);
            try {
                Thread.sleep(delaytime);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Kết thúc luồng: " + content);
     }
}
