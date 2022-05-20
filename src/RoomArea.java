class room{
    
    int data1;
    int  data2;
    void setdata(int a,int b){
        data1=a;
        data2=b;
    }
    void getdata(){
        System.out.println(data1);
        System.out.println(data2);

    }
        
    
}
public class RoomArea {

   
    public static void main(String[] args) {
        
        room o1 = new room();
        o1.setdata(1, 2);
        o1.getdata();
        
    }
    
}
