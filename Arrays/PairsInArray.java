public class PairsInArray {
    public static void printPairs(int[] arr) {
        int tp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                tp += 1;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printPairs(arr);
    }
}

// total pairs calculation: n(n-1)/2
// 10(10-1)/2 = 45

// -------
// Output
// -------

// (1, 2)(1, 3)(1, 4)(1, 5)(1, 6)(1, 7)(1, 8)(1, 9)(1, 10)
// (2, 3)(2, 4)(2, 5)(2, 6)(2, 7)(2, 8)(2, 9)(2, 10)
// (3, 4)(3, 5)(3, 6)(3, 7)(3, 8)(3, 9)(3, 10)
// (4, 5)(4, 6)(4, 7)(4, 8)(4, 9)(4, 10)
// (5, 6)(5, 7)(5, 8)(5, 9)(5, 10)
// (6, 7)(6, 8)(6, 9)(6, 10)
// (7, 8)(7, 9)(7, 10)
// (8, 9)(8, 10)
// (9, 10)

// Total Pairs: 45