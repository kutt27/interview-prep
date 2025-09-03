
public class LargestNumber{
    public static int findLargest(int marks[]){
        int largest = Integer.MIN_VALUE; 
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > largest){
                largest = marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int marks[] = {99, 100, 101};
        int largest = findLargest(marks);
        System.out.println("The largest number is "+ largest);
    }
}

// this code can also be extended for smallest number with 
// int smallest = Integer.MAX_VALUE;

//    Arrays   git:(main)  javac LargestNumber.java 
//    Arrays   git:(main)  java LargestNumber 
// The largest number is 101