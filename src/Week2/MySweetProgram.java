package Week2;

import java.util.Scanner;

public class MySweetProgram
{
    public static void main(String[] args) {


        /* icu
        initialization
        comparison or condition
        update
         */
        System.out.println("Guess the password");
        String password = "let me in";
        Scanner scanner = new Scanner (System.in);
        String guess = scanner.nextLine();

        while (!guess.equals(password)) {

            System.out.println("Guess the password");
            guess = scanner.nextLine();
        }

        System.out.println("congrats");
        scanner.close();
    }
}
