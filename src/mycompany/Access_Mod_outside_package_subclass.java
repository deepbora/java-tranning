

/*
                   Access Levels
Modifier	Class  

public             Y	  

protected	   Y		  

no modifier	   N		  

private            N		  
 */
package mycompany;


public class Access_Mod_outside_package_subclass {

  //outside-- package--
    private int a = 10;
    public int b = 20;
    int c = 30;
    protected int d = 40;
    
    //method -
    protected void run(){
        System.out.println("Connected Access modifier outside package");
    }
}
