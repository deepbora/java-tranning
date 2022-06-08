/*
                   Access Levels
Modifier	Class  

public             Y	  

protected	   Y		  

no modifier	   Y		  

private            N		  
 */
package mycompany;

class B1x {

    //with in the package--
    private int a = 10;
    public int b = 20;
    int c = 30;
    protected int d = 40;
}

public class Access_modifier_ex1_package {

    public static void main(String[] args) {

        B1x o1 = new B1x();

//        System.out.println(o1.a);-->not allow
        System.out.println(o1.b);
        System.out.println(o1.c);
        System.out.println(o1.d);

    }

}
