package mycompany;

class Area {

    int a;
    int b;

    public Area(int x, int y) {

        a = x;
        b = y;

    }
    int getdata(){
        int data=a+b;
        return data;
    }
    //default constructor---

    public Area() {
        
        a=0;
        b=0;
    }
    
    
    
    
        

}

public class Oops_default_constructor {

    public static void main(String[] args) {
        
        Area o1=new Area( 11,20);
       int var= o1.getdata();
        System.out.println(var);
        
        Area o2=new Area();
        System.out.println("Area 2 :"+o2.getdata());
    }

}
