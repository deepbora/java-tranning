
package Muliti_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class A implements Runnable{
    
    @Override
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("This is sleep Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
//                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
}
public class Multi_Treading_sleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A o1=new A();
        Thread o2=new Thread(o1);
        //this is another class 
        MyThread1 a=new MyThread1();
        o2.start();
        a.start();
    }
    
}
