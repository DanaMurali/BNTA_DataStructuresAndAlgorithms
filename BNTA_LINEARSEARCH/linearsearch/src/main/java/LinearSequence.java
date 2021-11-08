import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LinearSequence {


    public static void main(String[] args) {
        int[] result = GenerateArray(10);
//        int questionTwo = GenerateKey(5);
//        int secondResult = LinearSearch(result, 3);
        //System.out.println("index: " + secondResult);
        System.out.println(Arrays.toString(result));
    }

    //Part 1 - given a number, N, make a function that will generate an array of numbers 1 to N.
    public static int[] GenerateArray( int N) {
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }
        return numbers;

    }

    //We only have one input - O(N) - transversing through array to print each element. Here, we need to access all the elements one by one, so the calculation time increases at the same pace as the input.

    //Part 2 - Given the same range of numbers, 1 to N, write a function to generate a key which will be the number in our generated array that our search algorithm should find.

    public static int GenerateKey( int key) {
        Random random = new Random();
         int number = random.nextInt(1, key + 1);
         return number;
    }


    //Part 3 -Given an array and key, implement the linear search algorithm to search through the array until it finds the key. When it does this, return the number of steps taken to find the key.

    public static int LinearSearch(int[] result, int key) {

        for (int i = 0; i < result.length; i++) {
            if (result[i] == key){
                return i;
            }
        }
        return -1;
    }

//Ross's Solution
    //Part 1:
    //Watch out for pre-packaged functions like rangeClosed()
    //O(N)
    public static int [] generateArray(int rangeOfNumbers) {
        int[] arr = java.util.stream.IntStream.range((1, rangeOfNumbers).toArray();
        System.out.println("Generated array: " + java.util.Arrays.toString(arr));
        return arr;
    }

    //Python defined array
    //array = [(1,2,3,4,5,6,7,8,9,10)...5000]
    //In python since it is dynamic it gives you a max amount of space to store in your array.
    //if you go beyond the max space then python allocates more space e.g. 10000.

    //Part 2
    //O(1) - Remains constant
    public static int generateKey (int rangeOfNumbers) {
        int key = (int) (Math.random() * rangeOfNumbers) + 1;
        System.out.println("Generated key: " + key);
        return key;
    }
    //arr = [1,2,3,4,5,6,7,8,9]
    //x = arr[2] + 1; --> O(1)

    //Part 3
    public static int linearSearch(int[] arr, int key){
        int noOfSteps = 0;

        for (int number: arr) {
            if (number ==key) {
                return noOfSteps;
            }
            noOfSteps++;
        }
        System.out.println("No. of operations: " + noOfSteps);
        return noOfSteps;
    }

    //recursive function
    private static int BinarySearch(int[] arr, int first, int last, int key) {
        int noOfOperations = 0;

        int mid = (first + last) / 2;
        while(first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
            noOfOperations++;
        }
        return noOfOperations;
    }

}
