package mycompany;

public class Array {

    public static void main(String[] args) {

        int  arr[] = {1, 2, 3, 4, 5};
                int name = arr[4];
        
                System.out.println(name);
        System.out.println(arr[4]);
                System.out.println(arr[3]);
                
                
                //array lenght property
//                System.out.println(arr.lenght);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        
//        reverse order

        for(int i=arr.length-1;i>=0;i--){
                        System.out.print(arr[i]);

            
        }
        
//for object through
//int a[]---array decleration
//new int[10]----memorry allocation
        int a[] = new int[10];

        a[4] = 10;//initialize

        System.out.println(a[4]);
        
        
        String  ch[]={"deep","rasj"};
       
        System.out.println(ch[1]);
        for(int j=0;j<ch.length;j++){
            
            System.out.println(ch[j]);
            
        }
    }

}
