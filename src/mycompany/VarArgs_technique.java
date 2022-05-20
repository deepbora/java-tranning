package mycompany;

public class VarArgs_technique {
    //var arg is use for due to function overloading---

    static int sum(int ...arr) {
        int result = 0;

        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("sum of two :" + sum(2, 3));
        System.out.println("sum of three :" + sum(2, 3, 3));
        System.out.println("sum of four :" + sum(1, 2, 3, 3));
        System.out.println("sum of nothing :" + sum());

    }

}
