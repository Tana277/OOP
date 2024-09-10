import java.util.Scanner;
import java.util.Arrays;
public class bai7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex7:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        square(arr);
    }
    public static void square(int arr[])
    {
        for( int i=0; i<arr.length; i++)
            arr[i] *= arr[i]; 
        System.out.print("Array after square all elements: " + Arrays.toString(arr));
    }  
}
