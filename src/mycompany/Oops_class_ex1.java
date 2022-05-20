
package mycompany;

class Rectangle{
    int length;
    int width;
    
    void getdata(int x ,int y){
        
        length=x;
        width=y;
    }
    
    int rectArea(){
        
        int area=length*width;
        return area;
        
    }
    
}


public class Oops_class_ex1 {

    public static void main(String[] args) {
        
        Rectangle o1=new Rectangle();
        o1.getdata(10, 20);
        int a=o1.rectArea();
        System.out.println("area:"+a);
        
        
        
    }
    
}
