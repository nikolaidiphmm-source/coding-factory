package gr.aueb.cf.cf9.ch6;

/**
 * arrays and methods
 * demo of how we pass an array as a formal parameter
 * and also how we return an array from a method
 */
public class ArraysAndMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        printArray(arr, 0, arr.length);
    }

    /**
     * prints the contents of the array
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    /**
     * prints the contents of the array
     * @param arr
     * @param low
     * @param high
     */
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length) {
            return;
        }

        if (low > high) {
            return;
        }

        for (int i = low; i < high; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    /**
     * returns a new array size of 5
     * @return
     */
    public static int[] getArray5() {
        return new int[5];
    }
}
