package Week1;
import java.util.ArrayList;

public class IfElseExample {
    public static void main(String[] args) {
        boolean test_passed = true;
        int a = 50;
        int b = -110;
        String c = "hui";
        char vowel = 'i';

        if (vowel == 'a'|| vowel == 'e'|| vowel == 'i' ||vowel == 'o' ||vowel == 'u'||vowel == 'y'){
            System.out.println("The character is a vowel");
        }

        if (c.length() > 20) {
            System.out.println("String is too long");
        } else {
            System.out.println("Just right");
        }

        if (b < 10) {
            System.out.println("small");
        } else if (b > 10 && b < 99) {
            System.out.println("big");
        } else {
            System.out.println("huge");
        }

        if (a < 100) {
            System.out.println("Less than 100");
        } else {
            System.out.println("100 or greater");
        }

        if (test_passed) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }
}
