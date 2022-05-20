package mycompany;

import java.util.Scanner;

public class Strings {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//this is charecter with array
//      char a='a';
//        System.out.println(a);
        char[] ch = new char[5];
        ch[0] = 'a';
        ch[1] = 'a';

        ch[2] = 'a';

        ch[3] = 'a';

        ch[4] = 'a';
        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
            System.out.println(ch[i]);

        }

        char c[] = {'a', 'b', 'c'};
        for (int i = 0; i < c.length; i++) {
//            System.out.println(ch[i]);
            System.out.println(c[i]);

        }

        //strings --
        //method 1--
        String var = new String("deep");
        System.out.println(var);
        //method 2--
        String var2 = "raaaj";
        System.out.println(var2);
        System.out.printf("my name is %s", var2);
        int a = 10;
        float b = 10.2377f;
        System.out.printf("the int is %d and foat is  %f", a, b);
        //or
        System.out.format("the int is %d and foat is  %.2f", a, b);

//        string scanner class
//        Scanner sc = new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.println(str.length());
//strints array--
        String arr[] = {"deep", "raaj"};
        
        for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);

            
        }

    }

}
