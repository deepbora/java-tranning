
package mycompany;

//abstraction ---display esential things and and hiding the details--
/* abstraction ocure two types--
1.abstrac by through class--
2.abstrac by thourgh headerfile---*/

//by class--
class simple5{//this is called encapsulation
    private
    int a;
    int b;
    public
    void setdata(int a,int b){
        this.a=10;
        this.b=20;
    }
    void getdata(){
        System.out.println("the vaule of a:"+a);
        System.out.println("the vaule of b:"+b);
        

    }
};

abstract class Holi{
    int a=10;
    void run(){
        System.out.println("Run Ok");
        
    }
}

class Newholi extends Holi{
    
    
}
public class Abtraction_1 {

    
    public static void main(String[] args) {
        
        simple5 o1=new simple5();
        o1.setdata(0,0);//the obeject can not directly accses or modify the private data member that call absttraction
        o1.getdata();
        
        System.out.println(Math.pow(2,2));//this is called abstrction we can don't know what inside the Math.pow() function
        
        Holi n = new Newholi();
        n.a=199;//is allow becoze we can not decleare a as a final--
        
        
        
    }
    
}
