package Week2;

public class SearchArrayForLoop {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 72, 5};

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 72) {
                System.out.println("Found! Found at index " + i);
            }
        }

    }
}
