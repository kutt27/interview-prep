
public class BinarySearch{
    public static int search(int arr1[], int key){
        int start = 0, end = arr1.length;
        
        while (end >= start){
            int mid = (start + end) / 2;

            if(arr1[mid] == key){
                return mid;
            }

            if(arr1[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // sorted array
        int key = 8;
        System.out.println("The key is found at index: " + search(arr1, key)); // assume the key is always present case
    }
}