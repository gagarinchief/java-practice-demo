package Week2;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        int counter = 15;
        System.out.print(a + " " + b + " ");


        for (int i = 0; i <= counter ; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
    }
}
