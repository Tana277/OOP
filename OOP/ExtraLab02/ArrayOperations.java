import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output array
        System.out.println("Input Array: " + Arrays.toString(arr));

        // List negative values
        System.out.print("Negative values in the array: ");
        listNegativeValues(arr);

        // Find max value
        int max = findMaxValue(arr);
        System.out.println("Max value in the array: " + max);

        // Find first position of negative values
        int firstNegativePos = findFirstNegativePosition(arr);
        System.out.println("First position of negative values: " + firstNegativePos);

        // Calculate sum of values
        int sum = calculateSum(arr);
        System.out.println("Sum of values in the array: " + sum);

        // Sort the array
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Add an element to the first position
        System.out.print("Enter the element to add to the first position: ");
        int x = scanner.nextInt();
        arr = addElementToFirstPosition(arr, x);
        System.out.println("Array after adding element: " + Arrays.toString(arr));

        // Delete the first greater 0 element
        arr = deleteFirstGreaterZeroElement(arr);
        System.out.println("Array after deleting first greater 0 element: " + Arrays.toString(arr));
    }

    public static void listNegativeValues(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findFirstNegativePosition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1; // If no negative values are found
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] addElementToFirstPosition(int[] arr, int x) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = x;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    }

    public static int[] deleteFirstGreaterZeroElement(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
            return newArr;
        } else {
            return arr;
        }
    }
}
