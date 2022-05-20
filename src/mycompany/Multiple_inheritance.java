
package mycompany;
/*
Why multiple inheritance is not supported in java?

-->Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

-->Since compile-time errors are better than runtime errors,
Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.
*/

class X{
    

 void fun(){
     System.out.println("Good");
 }
}

class Y{
    
    void fun(){
        System.out.println("Bab");
    }
    
    
}

//class Z extends X,Y{
// if  is is possible
//
//}

public class Multiple_inheritance {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Z o1=new z();//if it is possible

//            o1.fun();-->whic fun method is run???
    }
    
}
