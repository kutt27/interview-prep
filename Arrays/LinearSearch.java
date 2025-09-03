import java.util.*;

public class LinearSearch{
    public static int searchLinear(int arr1[], int key){
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == key){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 9;
        int index = searchLinear(arr1, key);
        if(index == -1){
            System.out.println("Key not found!");
        }
        else{
            System.out.println("The key is at index " + index);
        }
    }
}

//    Arrays   git:(main)  javac LinearSearch.java
//    Arrays   git:(main)  java LinearSearch      
// The key is at index 7
//    Arrays   git:(main)  javac LinearSearch.java
//    Arrays   git:(main)  java LinearSearch      
// Key not found!