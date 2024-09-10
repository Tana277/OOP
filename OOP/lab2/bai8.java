import java.util.Arrays;
import java.util.Scanner;
public class bai8 
{
    public static Integer find_Max( Integer [] arr)
    {
        int max = arr[0];
        for( int x:arr)
        {
            if( max<x)
                max=x;
        }
        return max;
    }
    static Integer[] converIntInteger( int[] a )
    {
        Integer[] arr=new Integer[a.length];
        for( int i=0;i<a.length;i++)
        {
            arr[i]  = a[i];
        }
        return arr;
    }
    static int[] inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String[] args) 
    {
        System.err.println("Ex 8:");
        int[] arr = inputArray();
        System.out.println(Arrays.toString(arr));
        Integer[] integer_array = converIntInteger(arr);
        System.err.println("Max: " + find_Max(integer_array));
    }
}