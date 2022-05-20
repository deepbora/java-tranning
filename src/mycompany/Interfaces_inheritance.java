package mycompany;

/*we cant extend numltiple abstract class but we can implement multiple interfaces at a timd*/
interface X1 {

    int a = 10;//must be declear the value because it is finale varible

//    void run(){
//        not allow
//    }
    void run(int a);//all method are abstract must be implement in sub class

}
//to implement interface--

class Newx1 implements X1 {

    @Override
    public void run(int a) {
        if (a <= 50 && a>=0) {
            System.out.println("Good Mornning");

        }
    }

}

public class Interfaces_inheritance {

    public static void main(String[] args) {

//        X1 a=new X1();//not allow
        Newx1 o1 = new Newx1();
        o1.run(10);
        
//        o1.a=200;//is not allow becoz interface varible are finale
        System.out.println(o1.a);

    }

}
