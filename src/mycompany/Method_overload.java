package mycompany;

public class Method_overload {

    public static void main(String[] args) {

        myfunc(10, 20);
        myfunc(100);

    }
    //method overloading--

    public static void myfunc(int a, int b) {
        fun();//neasted function
        System.out.println(a);
        System.out.println(b);

    }

    public static void myfunc(int a) {
        System.out.println(a);

    }
    
    public static void fun(){
        
        System.out.println("this nested loop start");
        
    }

}
