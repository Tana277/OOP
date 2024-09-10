import java.util.Scanner;
public class bai6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex6:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Find the index of an element: ");
        int k = sc.nextInt();
        sc.close();

        System.out.print("the element index is: " + find(arr,k));
    }
    public static int find(int arr[], int k)
    {
        for( int i=0; i<arr.length; i++)
        {
            if( k == arr[i])
                return i;
        }
        return-1;
    }    
}
