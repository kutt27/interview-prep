public class BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
    }
}
