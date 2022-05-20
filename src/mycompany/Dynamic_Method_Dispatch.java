package mycompany;

class Phone {

    int a = 10;

    void math1() {

        System.out.println("Mathod 1 is called");

    }

    void math2() {

        System.out.println("This is OLd phone called");
    }
}

class SmartPhone extends Phone {

    int b = 12;

    @Override
    void math2() {

        System.out.println("This is Smart phone calling");

    }

    void math3() {
        System.out.println("this Smartphone mathod 3 calling");

    }

}

public class Dynamic_Method_Dispatch {

    public static void main(String[] args) {
//
////        Phone o1=new Phone();
//        SmartPhone o2 = new SmartPhone();
//        o2.math2();//----run time
////        System.out.println(o2.a);

        Phone o1 = new SmartPhone();//allowd
        //reffernce==object()

        o1.math1();//allow
        o1.math2();//run Subclass mtheode
        System.out.println(o1.a);//varible hole super class ok koribo aru sub class or varible not allow 

//        o1.math3;//not allow        
    }

}
