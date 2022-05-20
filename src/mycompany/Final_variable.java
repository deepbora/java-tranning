package mycompany;

//final key word use to restric the user
/*
 final key word stop-1.change value
                     2.method overriding
                     3.inheritance
*/

class F1{
    
    final int x=100;
}

class F2 extends F1{
    
   
    
    final int z;//directly not allow to unintialize you must declere in the constructor
    F2(){
        z=1;
    }
}



public class Final_variable {

    public static void main(String[] args) {

        final int a = 100;
//        a=200;//not allow

        int b = a;
        b = 101;
        System.out.println(b);//is allow
        
        F1 X = new F1(); 
//        X.x=200;//we can not change final variable 
      
    }

}
