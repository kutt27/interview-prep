public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] > maxLeft) {
                maxLeft = height[i];
            }
            left[i] = maxLeft;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (height[i] > maxRight) {
                maxRight = height[i];
            }
            right[i] = maxRight;
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
