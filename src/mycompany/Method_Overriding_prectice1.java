
package mycompany;

class Super{
    
    public int a;
     Super(int x){
        a=x;
//                 System.out.println("Super class :"+a);

    }
     void dis(){
         System.out.println("Super class :"+a);
     }
    
}
//
class Sub extends Super{
    int b;
    
     Sub(int x,int y) {
        super(x);
        b=y;
        
    }
    @Override
    void dis(){
        
        System.out.println("Overriding Super class a:"+a);      
        System.out.println("Overriding Super class b:"+b);

        
    
    
}
}

public class Method_Overriding_prectice1 {
    
   
    
  


    public static void main(String[] args) {
        
        Super o1 =new Super(100);
//        o1.dis();
        Sub o2 = new Sub(12,10);
        o2.dis();
        
        
        
        
    }
        
    
    }
    

