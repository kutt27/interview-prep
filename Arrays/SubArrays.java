import java.util.*;
public class SubArrays {
    public static void findMaxMin(int[] arr1){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
            if(arr1[i] < min){
                min = arr1[i];
            }
        }
        System.out.println("Maximum sum: " + max);
        System.out.println("Minimum sum: " + min);
        
    }
    public static void printSubArrays(int[] arr){
        int tp = 0;
        int sum = 0;
        int arrlength = arr.length;
        int length = arrlength*(arrlength+1)/2;
        int arr1[] = new int[length];
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("( ");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + ",");
                    number = arr[k];
                }
                sum += number;
                arr1[tp] = sum;
                tp += 1;
                System.out.print(")");
                System.out.println();
            }
            sum = 0;
        }
        System.out.println(Arrays.toString(arr1));
        findMaxMin(arr1);
        System.out.println("Total number of pairs: " + tp);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printSubArrays(arr);
    }
}

// Calculation = n(n+1)/2
// 10(10+1)/2 = 55

// -------
// output
// -------

// ( 1,)
// ( 1,2,)
// ( 1,2,3,)
// ( 1,2,3,4,)
// ( 1,2,3,4,5,)
// ( 1,2,3,4,5,6,)
// ( 1,2,3,4,5,6,7,)
// ( 1,2,3,4,5,6,7,8,)
// ( 1,2,3,4,5,6,7,8,9,)
// ( 1,2,3,4,5,6,7,8,9,10,)
// ( 2,)
// ( 2,3,)
// ( 2,3,4,)
// ( 2,3,4,5,)
// ( 2,3,4,5,6,)
// ( 2,3,4,5,6,7,)
// ( 2,3,4,5,6,7,8,)
// ( 2,3,4,5,6,7,8,9,)
// ( 2,3,4,5,6,7,8,9,10,)
// ( 3,)
// ( 3,4,)
// ( 3,4,5,)
// ( 3,4,5,6,)
// ( 3,4,5,6,7,)
// ( 3,4,5,6,7,8,)
// ( 3,4,5,6,7,8,9,)
// ( 3,4,5,6,7,8,9,10,)
// ( 4,)
// ( 4,5,)
// ( 4,5,6,)
// ( 4,5,6,7,)
// ( 4,5,6,7,8,)
// ( 4,5,6,7,8,9,)
// ( 4,5,6,7,8,9,10,)
// ( 5,)
// ( 5,6,)
// ( 5,6,7,)
// ( 5,6,7,8,)
// ( 5,6,7,8,9,)
// ( 5,6,7,8,9,10,)
// ( 6,)
// ( 6,7,)
// ( 6,7,8,)
// ( 6,7,8,9,)
// ( 6,7,8,9,10,)
// ( 7,)
// ( 7,8,)
// ( 7,8,9,)
// ( 7,8,9,10,)
// ( 8,)
// ( 8,9,)
// ( 8,9,10,)
// ( 9,)
// ( 9,10,)
// ( 10,)
// [1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 2, 5, 9, 14, 20, 27, 35, 44, 54, 3, 7, 12, 18, 25, 33, 42, 52, 4, 9, 15, 22, 30, 39, 49, 5, 11, 18, 26, 35, 45, 6, 13, 21, 30, 40, 7, 15, 24, 34, 8, 17, 27, 9, 19, 10]
// Maximum sum: 55
// Minimum sum: 1
// Total number of pairs: 55