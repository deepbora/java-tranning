
package Muliti_threads;

//Multithread using Runnable interface

class ThreadRunable1 implements Runnable{
    
 @Override
 public  void run(){
        for(int i=0;i<4000;i++){
        System.out.println("Gun1 is Fier!!!! GO GO Go");
        
        }
    }
 
 
    
    
}

class ThreadRunable2 implements Runnable{
    
 @Override
 public  void run(){
        for(int i=0;i<4000;i++){
        System.out.println("Gun2 is Fier!!!! GO GO Go");
        }
    }
 
 
    
    
}
public class Multi_Thread_Runnable {

   
    public static void main(String[] args) {
        
        ThreadRunable1 Bullet1 =new ThreadRunable1();
        ThreadRunable2 Bullet2 =new ThreadRunable2();
        
        //we can to directly access run method so--
         Thread gun1= new Thread(Bullet1);
         Thread gun2 =new Thread(Bullet2);
         
         gun1.start();
         gun2.start();
        
        
    }
    
}
