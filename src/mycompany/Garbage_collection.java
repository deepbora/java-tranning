/*
*****Java Garbage Collection***
Garbage Collection is process of erase  unused memory automatically. In other words, it is a way to destroy the unused objects.
In java, garbage means unreferenced objects.


*****Advantage of Garbage Collection***
1>It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
2>It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

***IT IS EXMPLE OF DAEMON THREAD****

How can an object be unreferenced?

1>By nulling the reference

Employee e=new Employee();  
e=null;  
2>By assigning a reference to another
Employee e1=new Employee();  
Employee e2=new Employee();  
e1=e2;//now the first object referred by e1 is available for garbage collection  
3>By anonymous object etc.
new Employee();  
 */
package mycompany;

class Account {
//
//    Account(String name) {
//
//        System.out.println(name);
//    }
}

public class Garbage_collection {

    public static void main(String[] args) {

        Account o1 = new Account();//---->1
        Account o2 = new Account();//--->2
        
        o1=new Account();//--->erase 1 now 3
        
        o2=o1;//--->now all 3
        
        o1=null;
        o2=null;
        
                System.gc();

        
        

    }

}
