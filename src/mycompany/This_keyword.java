
package mycompany;


class thiskey{
    
    public thiskey() {
        
//        this(10);//use 4
        
        System.out.println("this is default costuctor");
    }

    public thiskey(int x) {
        
        this();//called default constructor of same class--(use 2)
        
        System.out.println(x);
      
    }
    
    
    
    
    
    
    int a;
    
           void set(int a){
               
               
               this.a=a;//this is inctance varible(Use 1) this is real use
           }
    
    void get(){
        
        System.out.println("This is base class method called from this keyword");
        
        
    }
    
}

class child extends thiskey{
    
    
   
    void getdata(){
        
        this.get();//called method(use 3)
//        super.get();//or

        
        
    }
    
}


public class This_keyword {

    public static void main(String[] args) {
        
        thiskey o2 =new thiskey(10);
        
        child o1=new child();
        
        o1.getdata();
        
        
        
    }
    
}
