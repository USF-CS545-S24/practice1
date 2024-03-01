package question8;

/* Write a function that takes two sorted arrays without duplicates and
prints all the elements that occur in both arrays.
For instance, if we pass the following two sorted arrays to the method:
   int[] arr1= {2, 10, 12, 34, 90};
   int[] arr2 = {4, 6, 8, 10, 11, 12, 14, 20, 26, 30, 34, 48, 50};
   then the method should print 10 12 34
   Note: your method should be general and work for any two sorted arrays of integers. It is required that it runs in linear time: Theta(n1+n2), where n1 and n2 are the sizes of the two lists and takes advantages of the fact that the input lists are sorted.

   Please submit your solution to Github.
 */
public class IntersectionOfSortedArrays {
    public static void occurInBothArrays(int[] sortedA, int[] sortedB) {
        // FILL IN CODE


    }

    public static void main(String[] args) {
        int[] a = {3, 6, 8, 10, 22};
        int[] b = {1, 2, 3, 5, 9, 10, 15, 22, 45, 80};
        occurInBothArrays(a, b); // 3, 10, 22
    }
}
