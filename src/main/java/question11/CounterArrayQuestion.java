package question11;

public class CounterArrayQuestion {
    /**Assume the range of values in the array of integers arr is from 1 to m,
     and that you have a modified counter array counter from counting sort
     computed by first incrementing counter[arr[i]] for each element of arr[i] and
     then setting each element of counter for i from 1 to m to:
     counter[i] = counter[i] + counter[i-1].
     Write a function numBetween(int counter[], int m, int low, int high) that takes
     as input this counter array, m, and two values low and high,
     and returns the number of elements in the original list arr
     whose values are between low and high, inclusive.
     Array arr may contain duplicates, and you should be able to handle this.
     Running time of your function should be constant, Θ(1).
     */
    public static int numBetween(int[] counter, int m, int low, int high) {
        // FILL IN CODE

        return 0; // change
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 4, 2, 10, 20, 8, 0}; // the range is from 0 to 20
        int[] counter = new int[21];
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            counter[elem]++;
        }
        for (int k = 1; k < counter.length; k++) {
            counter[k] = counter[k] + counter[k-1];
        }
        // System.out.println(Arrays.toString(counter));
        System.out.println(numBetween(counter, 20, 4,10));
    }

}