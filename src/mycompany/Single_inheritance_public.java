
package mycompany;


class  base{
    
    int data1;
    int data2;

    public int getData1() {
        return data1;
    }

    public void setData1(int x) {
         data1=x;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
    
    
  
}
    
class derive extends base{
    
    public int data3;

    public int getData3() {
        return data3=data1*data2;
    }

    
    
    
    
    
}
    

public class Single_inheritance_public {


    public static void main(String[] args) {
        
        
        base o1=new base();
        o1.setData1(2);
        o1.setData2(5);
        System.out.println("from base class base object data1 :"+o1.getData1()); 
        System.out.println("from base class base object data2 :"+o1.getData2());
        
        derive o2=new derive();
        
        o2.setData1(5);
        o2.setData2(5);
     


        System.out.println("From derive class object data3 :"+o2.getData3());
        
    }
    
}
