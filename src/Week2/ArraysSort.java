package Week2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysSort {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 72, 5};
        Arrays.parallelSort(grades);
        System.out.println(Arrays.toString(grades));
    }
}
