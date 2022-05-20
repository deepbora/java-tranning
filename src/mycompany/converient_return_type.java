/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany;

class A1{    
A1 get(){return this;}    
}    
    
class B1 extends A1{    
 
@Override
B1 get(){return this;}    
void message(){System.out.println("welcome to covariant return type");}    


//public class converient_return_type {
    
    public static void main(String[] args) {
//        A1 o1=new A1();
//        o1.get();
    new B1().get().message();  
    }
    

}
