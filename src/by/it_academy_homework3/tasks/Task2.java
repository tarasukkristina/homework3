package by.it_academy_homework3.tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] originArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};
        IntStream stream = Arrays.stream(originArray);
        IntStream distinctStream = stream.distinct();
        int[] newArray = distinctStream.toArray();
        System.out.println(Arrays.toString(newArray));
    }
}
