import java.util.Scanner;

public class bai9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Hailstone(n);
        sc.close();    
    }
    public static void Hailstone( int n )
    {
        while( n != 1)
        {
            if(n%2!=0) { System.out.println(n+" is odd, so we take 3*n+1: "+ (n=3*n+1));}
            else { System.out.println(n+" is even, so we take n/2: "+ (n/=2));}
        }
    }
}