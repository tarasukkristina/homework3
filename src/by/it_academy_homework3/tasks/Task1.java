package by.it_academy_homework3.tasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        mergeTwoArrays(array1, array2, lengthArray1, lengthArray2);
    }
    public static void mergeTwoArrays (int[] array1, int[] array2, int lengthArray1, int lengthArray2) {
        int[] mergeArray = new int[lengthArray1 + lengthArray2];
        int indexMergeArray = 0;
        for (int i = 0; i < array1.length; i++) {
            mergeArray[i] = array1[i];
            indexMergeArray++;
        }
        for (int j = 0; j < array2.length; j++) {
            mergeArray[indexMergeArray++] = array2[j];
        }
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
    }
}

