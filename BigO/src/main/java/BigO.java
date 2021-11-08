import java.util.Arrays;
import java.util.stream.IntStream;

public class BigO {

    public static void main(String[] args) {
        int[] arr = generateArray(3);

        long startTime = System.nanoTime();
        subtractTwo(arr);
        long stopTime = System.nanoTime();
        System.out.println("SubtractTwo algorithm: " + (stopTime - startTime)/1 + " nanoseconds");

        startTime = System.nanoTime();
        printPairs(arr);
        stopTime = System.nanoTime();
        System.out.println("printPairs algorithm: " + (stopTime - startTime)/1 + " nanoseconds");

        startTime = System.nanoTime();
        sumArray(arr);
        stopTime = System.nanoTime();
        System.out.println("sumArray algorithm: " + (stopTime - startTime)/1 + " nanoseconds");
    }


    //Part 1 - Initialise array function - Linear O(N)
    public static int[] generateArray(int rangeOfNumbers) {
        int[] arr = IntStream.rangeClosed(1, rangeOfNumbers).toArray();
//         System.out.println(Arrays.toString(arr));
        return arr;

        //or

        /*int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i+1;
        } return array;*/

        //array list dynamically assigns a size to our array which we don't necessarily need.
        // As this will take up more space complexity.

    }

    //Part 2a - Constant O(1) Taking specific index of array, so it will remember

    public static int subtractTwo(int[] arr) {
        int unused_var = arr[1] - 2;
//        System.out.println("unused var:" + unused_var);
        return unused_var;
    }

    // Part 2b - Exponential O(N^2)

    static void printPairs(int arr[]) {

        // Nested loop for all possible pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                System.out.println("(" +  arr[i]+ ", "
//                        + arr[j]+ ")"
//                        + ", ");
            }
        }
    }



    // part 2C - Linear O(N)
    public static int sumArray(int[] arr) {

        //int sum = IntStream.of(arr).sum();
       // System.out.println("The sum is " + sum);
       // return sum;

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }



}
