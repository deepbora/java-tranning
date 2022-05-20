package mycompany;

import java.util.Scanner;

public class Robust1{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the Second number");
        int y=sc.nextInt();
        
        System.out.println("sum of two number");
        System.out.println(x+y);
         System.out.println("abtrac of two number");
        System.out.println(x-y);
        
      
        
        //robust 
        try{
         System.out.println("divoded of two number");
        System.out.println(x/y);
        }
        catch(Exception e){
            System.out.println("You cannot divided by Zero!!");
            
        }
        
         System.out.println("into of two number");
        System.out.println(x*y);
         System.out.println("Robust is done now");
        
        
        
        
        
    }
    
}