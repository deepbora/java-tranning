package mycompany;

/*
We can declare a class static by using the static keyword. A class can be declared static only if it is a nested class. It does not require any reference of the outer class.
The property of the static class is that it does not allows us to access the non-static members of the outer class.

To understand the concept of static class first we need to understand the concept of inner, outer, and nested class.


Inner class
The classes that are non-static or atatic and nested are called inner classes.

Outer Class
The class in which nested class is defined is called outer class.

Nested Class
Java allows us to define a class within a class that is known as a nested class.

1>All static classes are nested classes but vice-versa is not true.
2>It can access only static members of the outer class.


Why satatic class use?
--->An inner class can also be static, which means that you can access it without creating an object of the outer class:

 */
class OuterClass {

     static class InnerClass {
        
        
        void getInner(){
        System.out.println("Inner class called");
                
                }

    }

}

public class Static_class {

    public static void main(String[] args) {
        
        OuterClass.InnerClass o1=new OuterClass.InnerClass();//without static we can n ot innvok this
        
        o1.getInner();
        
        //with out static --
//          OuterClass myOuter = new OuterClass();
//    OuterClass.InnerClass myInner = myOuter.new InnerClass();
//    
//    myInner.getInner();
    
    

    }
    

}
