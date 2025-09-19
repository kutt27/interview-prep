public class KadanesAlgo{
    // public static int kadanesAlgo(int[] arr) {
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         cs += arr[i];
    //         if (cs < 0) {
    //             cs = 0;
    //         }
    //         ms = Math.max(ms, cs);
    //     }
    //     return ms;
    // }

    public static int kadanesAlgo(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }
        
        return ms;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = kadanesAlgo(arr);
        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}