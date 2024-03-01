package question5;

import java.util.Arrays;

/**
 * Fill in the missing code of the bubble sort so that it sorts the subarray from index low to index arr.length-1 in descending order.
 * For instance, if the array is {4, 19, 0, 3, 6, 2, 8} and low = 2, the result should be: 4, 19, 8, 6, 3, 2, 0.
 *
 * Submit your solution to Github (so that you know how to do it during the actual exam).
 * For coding questions, only Github solutions are accepted. Must use IntelliJ to work on coding problems.
 */
public class BubbleSort {
    public static void bubbleSortSubarrayDescending(int[] arr, int low) {
           // FILL IN CODE:


    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 9, 1, 45};
        bubbleSortSubarrayDescending(arr, 2);
        System.out.println(Arrays.toString(arr)); // 5, 8, 45, 9, 3, 2, 1
    }
}
