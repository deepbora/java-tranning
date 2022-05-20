package mycompany;

class Ekcon {

    String color = "white";

    private int x;

    Ekcon() {

        System.out.println("Base class called");
    }

    Ekcon(int x) {//this is costructor overloading but we can not overriding
        this.x = x;
        System.out.println("This is base class called :" + x);

    }

    void getsuper() {

        System.out.println("This is call from supre key word");

    }
    
    void getthis(){
        System.out.println("This is called method from this kew word");
        
        
    }

}

class EFdo extends Ekcon {

    String color = "balck";

    EFdo() {

        System.out.println("sub class called");

    }

    EFdo(int a) {
//        super();//this is use for invoke  parent class consturctor(use 2)
        super(a);//this is called pereant callss constructor this is real use(Use 1)
        super.getsuper();//called perent calss method (use 3)
        

    }

    void printcolor() {

        System.out.println(color);
        System.out.println(super.color);//this call base class color varibale  (use 4)
        this.getthis();//this use 2

    }

}

public class This_Super_key {

    public static void main(String[] args) {

        EFdo o1 = new EFdo();
        EFdo o2 = new EFdo(10);
        System.out.println(o1.color);//this called subclass color
        o2.printcolor();

    }

}
