package javaprojects;

import java.util.Arrays;

public class Quick_Sort {

    // Partition method
    static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap pivot with element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Recursive QuickSort method
    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println(" before sorted Array: " + Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println(" after Sorted Array: " + Arrays.toString(data));
    }
}