
package Muliti_threads;


class MyThread extends Thread
{
    
    int[] a={10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000};
 int b=10;
 
    public void run(){
        
        for(int i=0;i<19;i++){
             a[i]=a[i]*2;
                     System.out.println(a[i]);

            
        }
        
    
}
}

public class Multi_threads_1 {

    public static void main(String[] args) {
        
//        MyThread o1 =new MyThread();
//        o1.run();
          new MyThread().start();
          
//          System.out.println(b);
        
    }
    
}
