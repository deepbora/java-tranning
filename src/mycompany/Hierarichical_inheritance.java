package mycompany;

class One {

    int a = 20;

    One() {

//        this(10);//called same class constructor
        System.out.println("THE ONE IS CALLED");

    }
//    One(int a){
//        
//        System.out.println(a);
//        
//        
//    }

}

class Two extends One {

    Two() {

        System.out.println("THE TWO IS CALLED");

    }
    int b = 30;

}

class Three extends One {

    void Three() {

        System.out.println("THE THEE IS CALLED");

    }
    int c = 10;

}

public class Hierarichical_inheritance {

    public static void main(String[] args) {

//        One o1 = new One();
//        Two o2 = new Two();
//        System.out.println(o2.b);//is allow
        Three o3 = new Three();
        System.out.println(o3.a);//allow
//      System.out.println(o3.b);//not allow(beasuse o3 is not inherit TWO)
        System.out.println(o3.c);//allow

    }

}
