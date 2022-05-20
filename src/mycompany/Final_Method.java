
package mycompany;

class Phone1{
    
   final void print(){
       System.out.println("THis is Final Code");//we can not ovverride
       
   }
    
}
/*
Is final method inherited?
Ans) Yes, final method is inherited but you cannot override it. For Example:
*/

class Phone2 extends Phone1{
    
//    void print(){
//        //not allow to override
//    }
    void pint(int a){
        //allow
    }
    void getprint(){
        print();//inheritted allow
        
    }
//    
    
}


public class Final_Method {

   
    public static void main(String[] args) {
        
       
        
        
    }
    
}
