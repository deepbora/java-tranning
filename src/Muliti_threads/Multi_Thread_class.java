package Muliti_threads;

//multi threading uning Thread class

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread1 extends Thread {

//both method are run concurrently---

    @Override
    public void run() {
        int i=0;
        while (i<40) {

            System.out.println("I am coocking");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
//                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    void get(){
        
    }

}

class MyThread2 extends Thread {


    
    @Override
    public void run() {
        int i=0;
        while (i<4000) {

            System.out.println("I am dancing");
            i++;
        }

    }

}

public class Multi_Thread_class {

    public static void main(String[] args) {
        MyThread1 o1 = new MyThread1();
        MyThread2 o2 = new MyThread2();

        new MyThread1().start();//--->without create object
//        //or
//        //o1.start();
        new MyThread2().start();
//                //o2.start();
//////without Thread
//        o1.run();
//        o2.run();

  new MyThread1().get();

    }

}
