package mycompany;

class student3 {

    student3(String... arr) {

        for (String element : arr) {

            System.out.println(element);//this is vararg---techniqu---
//            System.out.printf("%d",element);

        }

    }

}

public class Oops_construc_varargs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        student3 o3 = new student3("deep");
        student3 o4 = new student3("deep", "raaj");
        

    }

}
