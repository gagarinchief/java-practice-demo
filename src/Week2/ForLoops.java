package Week2;

public class ForLoops {
    public static void main(String[] args) {

        boolean additionalLogging = false;
        for (int i = 9; i >= 0; i--){
            System.out.println(i);

            if (i == 5) {
                if (additionalLogging == true); {
                    System.out.println("We found...");
                }
            }


        }
    }
}
