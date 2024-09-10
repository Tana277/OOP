import java.util.Scanner;
public class bai5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex5:");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        countPrime(arr);
    }
    public static void countPrime( int[] arr )
    {
        int result = 0;
        for( int i=0; i<arr.length; i++)
        {
            if( prime(arr[i])) result++;
        }
        System.out.print("Prime number in array.: " + result);
    }
    public static boolean prime( int n )
    {
        boolean result = true;
        if( n < 2) {result = false;}
        else{
            for( int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    result=false;
                }
            }
        }
        return result;
    }
}