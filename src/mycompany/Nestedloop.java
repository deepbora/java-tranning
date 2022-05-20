/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany;

import static javafx.application.Platform.exit;

/**
 *
 * @author PC
 */
public class Nestedloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x=20,y=50;
        
        if(x<30 && x>10){
            if(y<60 && y>20){
                System.out.println("nested True");
            }else{
                System.out.println("nested false");
            }
        }else{
            exit();
        }
    }
    
}
