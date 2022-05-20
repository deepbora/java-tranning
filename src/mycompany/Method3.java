
package mycompany;

public class Method3 {

  
    public static void main(String[] args) {
        
        int c;
        c=myfunc();
        System.out.println(c);
//        or
System.out.println(myfunc());
        
    }
    
    //without argument with returntype
    
    public static int myfunc(){
        int a=10;
        int b=11;
        
        return a+b;
        
        
    }
    
}
