
package mycompany;

/*
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
We can create refference abstract class into a sub class----
*/

abstract class Abs{
    
    
    Abs(){
        //allow
        //not allow to abstrect becouse it is not class memeber only invok from subclass
        System.out.println("This ia super class Constructor");
    }
    
    static int num(){
        return 0;//allow
        
    }
    int num2(){
        return 1;
    }
    
    abstract void greet();//abstract class method can not have a body we munst ovveride this method in sub class
        abstract void greet2();//abstract class method can not have a body we munst ovveride this method in sub class

    
    
}


class Abs2 extends Abs{
    
    Abs2(){
        super();// cosutructor invok from subclass
        
    }
   
    void greet(int a){
        //allow
        
    }
    
    @Override
    void greet(){
        System.out.println("Hello the greet is done");
        
    }
    @Override
    void greet2(){
        
        System.out.println("Greet2 is done");
         
    }
        
}
//hierarichal inheritance--
 class Abs3 extends Abs{
     
 int z;
     @Override
     void greet(){
         
         System.out.println("This is Abs3 greet");
         
         
     }
     @Override
     void greet2(){
         System.out.println("Gree2 Abs3 run");
         
     }
     

}

//for dyanamic Method dispatch

class Abs4 extends Abs3{
    
    @Override
    void greet(){
        
        System.out.println("This is greet methode call Abs4");
        
    }
    
    
}

public class Abstract_class_method {


    public static void main(String[] args) {
        
        int a=Abs.num();//allow
        System.out.println(a);//allow
        
//        Abs o1=new Abs();//can not instantiate

            Abs2 o1= new Abs2();
            o1.greet();
            
            
            //dynamic method dispach(to implement runtime plymorphism)
            
            Abs3 o3=new Abs4();
            
            o3.greet();//run subclass greet  method
            o3.greet2();
            System.out.println(o3.num2());
            
            
//            We can create refference abstract class into a sub class----using dynamic method

             Abs X =new Abs2();
             
             X.greet();//allow
             X.greet2();//allow
             X.num2();//allow
                }
}
