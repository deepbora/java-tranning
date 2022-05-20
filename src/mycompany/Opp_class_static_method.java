package mycompany;

//import static mycompany.simple.count;
 class simple {
    

    static int count = 0;

    static int display() {
        count++;
        System.out.println("static Memebre Fuction is called");
        return count;

    }

}

public class Opp_class_static_method {

    public static void main(String[] args) {
        int ch;

        System.out.println(simple.count);
        System.out.println(simple.display());
        System.out.println(simple.display());
        System.out.println(simple.display());
     
       
        

    }

}
