
package mycompany;



class A{
    
    public void meth1(){
        System.out.println("This is Method 1 From Class A");
    }
    
}
   
class B extends A{
  int a;
    

    
    @Override
    public void meth1(){
        System.out.println("This is Method 1 From Class B and This Is Method Overriding");
    }
    
    
}
        
    
    
public class Method_Overriding {

    
    public static void main(String[] args) {
      
        A o1 =new A();
        o1.meth1();
        
        B o2 =new B();
        o2.meth1();
        
       
    }
    
}
