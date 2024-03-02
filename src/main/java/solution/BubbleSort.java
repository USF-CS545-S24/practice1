package solution;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Fill in the missing code of the bubble sort so that it sorts
     * the subarray from index low to index arr.length-1 in descending order.
     * For instance, if the array is {4,19, 0, 3, 6, 2, 8} and low = 2,
     * the result should be: 4, 19, 8, 6, 3, 2, 0.
     * @param arr input array
     * @param low index where to start sorting
     */
    public static void bubbleSortSubarrayDescending(int[] arr, int low) {
        for (int pos = low; pos < arr.length - 1; pos++) { // pos starts with low
            for (int  j = arr.length - 1; j > pos; j--) {
                if (arr[j]  > arr[j-1]) { // if we want a descending order, we will be swapping if arr[j] > arr[j-1]
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }

    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {4, 9, 1, 3, 0, 2, 10, 5};
        bubbleSortSubarrayDescending(a, 2);
        System.out.println(Arrays.toString(a));
        // Should print 4, 9, 10, 5, 3, 2, 1, 0
        // Sorted the chunk of the array from index 2 onwards, in descending (decreasing) order
    }
}
