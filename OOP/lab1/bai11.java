import java.util.Scanner;
public class bai11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        countDigits(n);
        sc.close();
    }
    public static void countDigits( int n )
    {
        int count=0;
        while(n>0){n /=10;count++;}
        System.out.print("Number of digits = " + count);
    }
}