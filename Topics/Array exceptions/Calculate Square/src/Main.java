import java.util.Scanner;

class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if(array == null) {
            System.out.println("Exception!");
        }
        else if( index > 0 && index < array.length) {
            System.out.println(array[index-1] * array[index-1]);
        }
        else {
            System.out.println("Exception!");
        }

    }
}