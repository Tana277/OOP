import java.util.Scanner;
import java.util.Arrays;
public class bai9 
{
    public static int[] divisibleNumbers(int arr[], int k)
    {
        int count=0, number=0;
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i]%k == 0)
                {count++;}
        }
        int arr2[] = new int[count];
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i]%k == 0)
            {arr2[number]=arr[i];number++;}
        }
        return arr2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex9:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the dividend: ");
        int k = sc.nextInt();
        sc.close();
        System.out.print("The divisible numbers: " + Arrays.toString(divisibleNumbers(arr,k)));
    }
}
