import java.util.*;

// Approach 1
// public class ReverseArray {
//     public static void main(String[] args) {
//         int array[] = {1,2,3,4,5,6,7,8,9,10};
//         int[] reverse = new int[array.length];
//         int j = array.length;
//         for (int i = 0; i < array.length; i++) {
//             reverse[j - 1] = array[i];
//             j = j - 1;
//         }
//         System.out.println("Original array: " + Arrays.toString(array));
//         System.out.println("Reverse array: " + Arrays.toString(reverse));
//     }
// }

// Approach 2
public class ReverseArray{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        int j = array.length - 1;
        System.out.println("Normal Array: "+ Arrays.toString(array));
        for (int i = 0; i < j; i++) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        System.out.println("Reverse Array: "+ Arrays.toString(array));
    }
}