
package mycompany;


public class Method_without_static {
    //without static---
    void func(int a,int b){
        
        int c=a+b;
        System.out.println(c);
        
    }

    public static void main(String[] args) {
        
        Method_without_static o1=new Method_without_static();
        
        o1.func(10,12);
        
        
        
    }
    
}
