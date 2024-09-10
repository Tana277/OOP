import java.util.Scanner;
public class bai10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex2:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        thirdLargest(arr);
    }
    public static void thirdLargest( int[] arr )
    {
        for( int i=0; i<arr.length; i++)
        {
            for( int j=arr.length - 1; j>i;j--)
            {
                if( arr[j] > arr[j-1] )
                {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        System.out.print("The third largest element in an array.: " + arr[2]);
    }    
}
