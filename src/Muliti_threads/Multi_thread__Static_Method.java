
/*
1>public String getName(): returns the name of the thread.
2>public void setName(String name): changes the name of the thread.
3>public Thread currentThread(): returns the reference of currently executing thread.
4>public int getId(): returns the id of the thread.
5>public int getPriority(): returns the priority of the thread.
6>public int setPriority(int priority): changes the priority of the thread.
7>public void suspend(): is used to suspend the thread(depricated).
8>public void resume(): is used to resume the suspended thread(depricated).
9>public void stop(): is used to stop the thread(depricated).
10>public void run(): is used to perform action for a thread.
11>public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
12>public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

 */
package Muliti_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Multi_thread__Static_Method {

    public static void main(String[] args) {

        Thread o1 = new Thread();
        //-----****NoN--Static Method****----
        o1.start();
        o1.run();
        o1.setName("deep");
        System.out.println(o1.getName());
        System.out.println(o1.getId());
        System.out.println(o1.getClass());

        System.out.println(Thread.currentThread());

//        //for set cuurent Thread name---
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println(tname);
        System.out.println(t.getName());
        t.setName("mymain");

        System.out.println(t.getName());
        System.out.println(t.getName());

       

        //-----****--Static Method****----
        try {
            Thread.sleep(1000);

//        
        } catch (Exception ex) {

        }

        System.out.println("The Thraed End");

        //for stop
//        t.stop();
//        t.destroy();
//        t.suspend();//for suspanding

    }

}
