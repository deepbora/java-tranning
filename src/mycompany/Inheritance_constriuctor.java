package mycompany;

class base1 {

    //constructor---
    base1() {
////        
        System.out.println("Default constructor is called");
////        

    }
//    int x;
    base1(int x) {
//        this.x=x;


        System.out.println("i am a base class overloaded contructor call by super key" + x);
    }
    
   

}

class derive1 extends base1 {
    


    derive1() {
        

        System.out.println("The derive default constructor is called");

    }

    derive1(int x,int y) {
        super(x);
//        System.out.println("i am a overloaded contructor call by super key" + x);
                System.out.println("i am a derive1 overloaded contructor call by super key" + y);


    }

}

class derive2 extends derive1{
    derive2(){
        System.out.println("the derive2 constructor is called");
    }
    
      derive2(int x ,int y,int z) {
        super(x,y);
//        System.out.println("i am a overloaded contructor call by super key" + x);
        System.out.println("i am a derive 2 overloaded contructor call by super key" + z);


    }
    
    
}

public class Inheritance_constriuctor {

    private static derive1 o2;//method to create object---

    public static void main(String[] args) {

//        base1 o1 = new base1(500);
        //new method---
//        o2 = new derive1(100);
        
//        base1 o1=new base1(10);
//        derive1 o4=new derive1(20,30);
//        
        
        derive2 o3=new derive2(200,300,400);

    }

}
