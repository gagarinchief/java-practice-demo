package Week1;

public class StringExercises {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "CAT";
        String s3 = "“I am a string";

        System.out.println(s3.length());

        System.out.println(s1 + s2);
        System.out.println(s1 + 7);

        System.out.println(s1.contains(s2));

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        twoStrings("12345", "123456");
        catOrDog("cat");

    }

    public static void twoStrings (String str1, String str2 ){
        System.out.println(str1 + str2);
    }

    public static void catOrDog (String pesIKot) {
        System.out.println(pesIKot.contains("cat"));
        System.out.println(pesIKot.contains("dog"));
    }
}
