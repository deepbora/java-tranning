package mycompany;

public class neasted_loop {

    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println("*");

            }
            System.out.println(" ");

        }

    }

}