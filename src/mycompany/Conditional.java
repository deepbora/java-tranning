
package mycompany;

import java.util.Scanner;

public class Conditional {

   
    public static void main(String[] args) {
        
        
        /*
        1. if-else--
        types--
        simple if
        if-else
        nested if-else
        else-if --ladder
        2. switch
        */
        
        int x;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
         x = sc.nextInt();
        
        
        if(x==0){
            
            System.out.println("this statement is true");
    }else{
            System.out.println("this statment is false");
        }
    
    }
}
