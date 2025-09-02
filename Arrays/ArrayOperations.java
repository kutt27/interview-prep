import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create
        int[] arr = new int[5]; // declares an integer array of size 5

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Update
        System.out.println("Enter index to update (0-4):");
        int idx = sc.nextInt();
        System.out.println("Enter new value:");
        int val = sc.nextInt();
        arr[idx] = val;

        // Output after update
        System.out.println("Updated array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

//    Arrays   git:(main)  javac ArrayOperations.java
//    Arrays   git:(main)  java ArrayOperations      
// Enter 5 integers:
// 1 2 3 4 5
// Array elements:
// arr[0] = 1
// arr[1] = 2
// arr[2] = 3
// arr[3] = 4
// arr[4] = 5
// Enter index to update (0-4):
// 2
// Enter new value:
// 25
// Updated array elements:
// arr[0] = 1
// arr[1] = 2
// arr[2] = 25
// arr[3] = 4
// arr[4] = 5