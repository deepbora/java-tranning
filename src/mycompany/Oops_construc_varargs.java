package mycompany;

class student2 {

    student2(int... arr) {

        for (int element : arr) {

            System.out.println(element);//this is vararg---techniqu---
//            System.out.printf("%d",element);

        }

    }

};

public class Oops_construc_varargs {

    public static void main(String[] args) {
//
        student2 o1 = new student2(1, 2);
        student2 o2 = new student2(4, 5);
        student2 o3 = new student2(5, 6);

    }

}
