import java.util.Scanner;
public class bai3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex3:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        sum(arr);
    }
    public static void sum( int[] arr )
    {
        int result = 0;
        for( int i=0; i<arr.length; i++)
        {
            result += arr[i];
        }
        System.out.print("Sum value of an array: " + result);
    }    
}
