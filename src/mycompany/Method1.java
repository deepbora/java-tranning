package mycompany;

import java.util.Scanner;

public class Method1 {

    public static void main(String[] args) {

        //method or function----
//        if(4 % 2==0){
//            
//            System.out.println("even");
//            
//        }else{
//            System.out.println("odd");
//            
//        }
        isEven(10);
        isEven(11);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        isEven(a);

    }
//no perameter with argument;

    public static void isEven(int num) {

        if (num % 2 == 0) {
            System.out.println("even");

        } else {

            System.out.println("Odd");
        }

    }

}
