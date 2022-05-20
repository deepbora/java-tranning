
package mycompany;

public class Method_call_obj {

     void func(int a){
        
        System.out.println(a);
        
    }
    public static void main(String[] args) {
     
        
        Method_call_obj o1=new Method_call_obj();//without static we can not call directly function from main method so we can create object
        o1.func(1);
    }
    
}
