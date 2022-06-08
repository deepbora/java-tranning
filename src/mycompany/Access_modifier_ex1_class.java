
/*
                   Access Levels
Modifier	Class  

public             Y	  

protected	   Y		  

no modifier	   Y		  

private            Y		  
 */
package mycompany;

class A1x {

    private int a = 10;
    public int b = 20;
    int c = 30;
    protected int d = 40;
    
    static void fun(){
        
    }

    //with in the class--all accesssable inside the class
    void run() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}

public class Access_modifier_ex1_class {
    

    

   

    public static void main(String[] args) {
        
        A1x o1=new A1x();
        o1.run();
        A1x.fun();//static method directly called by class --Name--
        

    }

}
