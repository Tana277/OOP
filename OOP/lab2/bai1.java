import java.util.Scanner;
public class bai1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex1:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // sc.close();
        max(arr);
        min(arr);
        sc.close();
    }
    public static void max( int[] arr )
    {
        int result = arr[0];
        for( int i=0; i<arr.length; i++)
        {
            if( arr[i] > result)
                result = arr[i];
        }
        System.out.println("Maximum value of an array: " + result);
    }
    public static void min( int[] arr )
    {
        int result = arr[0];
        for( int i=0; i<arr.length; i++)
        {
            if( arr[i] < result)
                result = arr[i];
        }
        System.out.println("Minimum value of an array: " + result);
    }
}
