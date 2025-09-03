import java.util.*;

public class LinearSearchS{
    public static int searchLinear(String arr1[], String key){
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == key){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String arr1[] = {"dosa", "appam", "idli", "idiyappam"};
        String key = "appam";
        int index = searchLinear(arr1, key);
        if(index == -1){
            System.out.println("Key not found!");
        }
        else{
            System.out.println("The key is at index " + index);
        }
    }
}