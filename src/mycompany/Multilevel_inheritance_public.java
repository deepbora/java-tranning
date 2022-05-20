package mycompany;

class student5 {

    int roll;

    void getroll() {
        System.out.println("The roll number is:" + roll);
    }

    void setroll(int a) {
        roll = a;
    }

}

class exm extends student5{

    int math;
    int science;

    void setmarks(int a, int b) {
        math = a;
        science = b;
    }

    void getmarks() {
        System.out.println("math marks is:" + math);
        System.out.println("science marks is:" + science);

    }
}

class result extends exm{
    
    int result;
    
    void setresult(){
        result=math+science/2;
}
    void getresult(){
        System.out.println("the result is :"+result+"%");
        
    }
}

public class Multilevel_inheritance_public {

    public static void main(String[] args) {
        result o1=new result();
        o1.setroll(1);
        o1.setmarks(20, 30);
        o1.setresult();
        o1.getroll();
        o1.getmarks();
        o1.getresult();
        
//        exm o2=new exm();
//        student5 o3 =new student5();
    }

}
