
package mycompany;

public class Jump_loop {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //jump in loop--
        /*
        1.break
        2.continue
        */
        
        System.out.println("this is break");
        for(int i=0;i<10;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
                System.out.println("this is continue");

        
          for(int j=0;j<10;j++){
            if(j<=3){
                continue;//skipt the true conditions
            }
            System.out.println(j);
        }
        
        
    }
    
}
