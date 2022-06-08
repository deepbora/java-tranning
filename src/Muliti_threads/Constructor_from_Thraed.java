//Tread(String name)
package Muliti_threads;


class Mythread extends Thread{
    
    Mythread(String name){
       super(name);
       System.out.println(name);
   
        
    }
}
public class Constructor_from_Thraed {

    public static void main(String[] args) {
        Mythread o1=new Mythread("deep");
//        o1.start();
        System.out.println(o1.getId());
                System.out.println(o1.getName());

       
    }
    
}
