
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class MyThread implements Runnable {
    public String content;// nội dung cần hiển thị
    public int delaytime; // thời gian tạm dụng sua mỗi lần hiển thị
    public Thread th;// biến để tạo và khởi động luônnf mới.

    public MyThread(String content, int delaytime) {
        this.content = content;
        this.delaytime = delaytime;
        th= new Thread(this);// tạo luông mới và cung cấp runnable  cho nó.
        
        th.start();// khởi động luồng => hàm run() sẽ được chay
    }

    @Override
    public void run() {
       for(int i=0;i<5;i++){
                 System.out.println(i+ "- "+ content);
           try {
         
               Thread.sleep(delaytime);
           } catch (InterruptedException ex) {
               Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
          System.out.println("Kết thúc luồng."+th.getName());     
    }
    
}

