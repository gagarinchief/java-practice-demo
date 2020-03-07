package Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args) {

        String [] grades = new String[5];
//        int [] grades2 = grades1;

        Arrays.fill(grades,"");
        System.out.println(Arrays.toString(grades));

        List<String> testing = Arrays.asList(grades);

//        if (grades1 == grades2) {
//            System.out.println("equal");
//        }
//        if (grades1.equals(grades2)) {
//            System.out.println("equals");
//        }
//        System.out.println(grades1 + " " + grades2);
//
//        if (Week2.Arrays.equals(grades1, grades2)) {
//            System.out.println("equals finally");
//        }

    }
}
