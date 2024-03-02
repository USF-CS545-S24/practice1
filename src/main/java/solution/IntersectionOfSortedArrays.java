package solution;

public class IntersectionOfSortedArrays {

    /**
     * Takes two sorted arrays without duplicates and prints all the elements
     * that occur in both arrays.
     *
     * Note: your method should be general and work for any two sorted arrays of integers.
     * It is required that it runs in linear time: Theta(n1+n2), where n1 and n2 are the sizes of the two lists and takes advantages of the fact that the input lists are sorted.
     * @param sortedA sorted array A
     * @param sortedB sorted array B
     */
    public static void occurInBothArrays(int[] sortedA, int[] sortedB) {
        int i = 0, j = 0;
        while (i < sortedA.length && j < sortedB.length) {
            if (sortedA[i] == sortedB[j]) {
                System.out.println(sortedA[i]);
                i++;
                j++;
            }
            else
            if (sortedA[i] < sortedB[j])
                i++;
            else
                j++;
        }

    }

    public static void main(String[] args) {
        int[] arr1= {2, 10, 12, 34, 90};
        int[] arr2 = {4, 6, 8, 10, 11, 12, 14, 20, 26, 30, 34, 48, 50};
        occurInBothArrays(arr1, arr2);
        // Should print 10, 12, 34
    }
}