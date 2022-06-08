/*
                   Access Levels
Modifier	outof package_sub_Class  

public             Y	  

protected	   Y		  

no modifier	   N		  

private            N		  
 */

package Newpackege;

import mycompany.Access_Mod_outside_package_subclass;

public class Access_Mod_outside_package_sub extends Access_Mod_outside_package_subclass {

    public static void main(String[] args) {

        Access_Mod_outside_package_sub o1 = new Access_Mod_outside_package_sub();
//        System.out.println(o1.a);-->private not allow
        System.out.println(o1.b);
//        System.out.println(o1.c);---->default not allow
        System.out.println(o1.d);
        o1.run();

    }

}
