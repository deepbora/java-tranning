package mycompany;

class student1 {

    int a;
    int b;

    student1(int x) {

        System.out.println(x);//this is constructor---

    }

    student1(int a, int b) {

        System.out.println(a);//this is constructor overloading---
        System.out.println(b);

    }

}

public class Opps_costruc_overloading {

    public static void main(String[] args) {

        student1 o1 = new student1(1);
        student1 o2 = new student1(1,87);

    }

}
