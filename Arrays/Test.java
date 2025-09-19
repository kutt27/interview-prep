import java.util.*;

public class Test {
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Maximum subarray sum: " + max);
        System.out.println("Minimum subarray sum: " + min);
    }

    public static void printSubArrays(int[] arr) {
        int n = arr.length;
        int length = n * (n + 1) / 2;
        int[] sums = new int[length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                sums[index++] = sum;

                // Print subarray [i..j]
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) System.out.print(", ");
                }
                System.out.println(" )");
            }
        }

        System.out.println("All subarray sums: " + Arrays.toString(sums));
        findMaxMin(sums);
        System.out.println("Total number of subarrays: " + length);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printSubArrays(arr);
    }
}
