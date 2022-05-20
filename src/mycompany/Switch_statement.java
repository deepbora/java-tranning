
package mycompany;

import java.util.Scanner;


public class Switch_statement {

    public static void main(String[] args) {
        
        
              int x;
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        x =sc.nextInt();
        
        switch(x){
            case 1: System.out.println("RED");
            break;
            case 2 : System.out.println("GREEN");
            break;
            case 3 : System.out.println("BLUE");
            break;
            default : System.out.println("EXIT");
            break;
        }
            
    }
    
}
