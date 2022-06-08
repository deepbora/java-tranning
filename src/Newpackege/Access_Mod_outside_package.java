/*
                   Access Levels
Modifier	outof package_sub_Class  

public             Y	  

protected	   N		  

no modifier	   N		  

private            N		  
 */
package Newpackege;

import mycompany.Access_Mod_outside_package_subclass;

public class Access_Mod_outside_package {

    
    public static void main(String[] args) {
        
           Access_Mod_outside_package_subclass o1 = new Access_Mod_outside_package_subclass();
//////        System.out.println(o1.a);-->private not allow
        System.out.println(o1.b);
//////        System.out.println(o1.c);---->default not allow
////        System.out.println(o1.d);--->protected not allow
                
//            o1.run();--->not allow beacoz it is protected


    }
    
}
