package mycompany;

public class Operator {

    public static void main(String[] args) {

        //operator---8
        /*
        1.arithmetic(-,+,%,*,/)
        2.Reational(<,>,<=,=>,==,!=)
        3.Logiacal(&&,||,!)
        4.Assignment(+=,-=,*=,/=)
        5.Increment and decrement(++,--)
        6.Conditional(&,!,^,<<,>>,>>>)
        7.Bitwise Operator(instanceof,.)
        8.Spacial
        
         */
        int a, b, c;

        a = 10;
        b = 10;
        c = a + b;
        System.out.println("the sum of a and b is :" + c);

        if (a == b) {
            System.out.println("true");

        }   //relationcal and conditional    

        if (a == b && c > b) {
            System.out.println("this is also true");
        }//logical 

        int var = 10;
        var += 10;
        System.out.println("assignment operator:" + var);//assignment
        int var1 = 10;
        //postincrement
        var1++;//first assign then icrement
        //preincrement--
        ++var1;//first increment then assign
        System.out.println("postincrement:" + var1);
        System.out.println("preincrement:" + var1);
        
        

    }
}
