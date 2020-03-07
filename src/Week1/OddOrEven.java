package Week1;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrNot(5);
        oddOrNot(20);
        oddOrNot(225);
        largestOne(3, 5, 10);

        int x = 25;
        if (x != 3) {
            System.out.println(x + 1);
        }
        System.out.println("End of program");
    }


    public static void oddOrNot(int i) {
        if (i % 2 == 0) {
            System.out.println(i + " Even - чётный");
        } else {
            System.out.println(i + " Odd - нечётный");
        }
    }

    public static int largestOne(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else if ((b > a) && (b > c)) {
            return b;
        } else if ((c > a) && (c > b)) {
            return c;
        }
        return a;
    }
}
