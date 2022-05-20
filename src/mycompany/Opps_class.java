
package mycompany;

class rectangle{
  
    private
            int a;
    
    public//by default
    int length;//declaration variables
    int width;
    void setdata(int x){//defination method
        a=x;
        
    }
    void getdata(){
        System.out.println(a);
        
    }
    
}

public class Opps_class {

  
    public static void main(String[] args) {
        
        rectangle o1;//object decteration
        o1=new rectangle();//instantiat the object
        o1.length=10;
        System.out.println(o1.length);
        rectangle o2;
        o2=new rectangle();
        
        o2.setdata(100);
        o2.getdata();
        
        
        
    }
    
}
