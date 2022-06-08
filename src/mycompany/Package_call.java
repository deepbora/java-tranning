package mycompany;

//import mycompany.Package_1;
import Newpackege.Package_1_new;


public class Package_call extends Package_1_new{

    public static void main(String[] args) {
//        //*****this is calll from outer package****
//        Package_1_new o1=new Package_1_new();
//        o1.display();
//        o1.run();

        //*****this is calll from outer sub class package****
        
        Package_call o1=new Package_call();
        o1.display();
        o1.run();
      

//*****this is calll same  package****
//           Package_1 o1 = new Package_1();
//           o1.display();
//           o1.run();
//        
    }

}
