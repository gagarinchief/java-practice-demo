package Week2;

public class Chetverti {
    public static void main(String[] args) {
        double sum = 1;
        int counter = 6;

        for (int i = 1; i <= counter ; i++) {
            sum += 1.0/i;
        }
        System.out.println("sum: " + sum);
    }
}
