
package mycompany;

public class Method2 {

    public static void main(String[] args) {
        
        //sum of two number--
        int a,b,c;
        a=10;
        b=10;
        c=myfunc(a,b);
        System.out.println(c);
        //or
        System.out.println(myfunc(a, b));

    }
    // with argument and with returntype
    public static int myfunc(int a,int b){
        
        
        
        
        return a+b;
        
    }

}
