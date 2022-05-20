package mycompany;

class student4 {

    student4(char... arr) {

        for (char element : arr) {
            System.out.println(element);
        }

    }

}

public class Oops_construct_varargs2 {

    public static void main(String[] args) {

        student4 o1 = new student4('a');
        student4 o2 = new student4('a','c');

    }

}
