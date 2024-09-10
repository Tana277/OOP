import java.util.Scanner;

public class bai3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number: "); 
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Result = " + a%b);
        sc.close();
    }
    // public static int remain( int a, int b)
    // {
    //     return a%b;
    // }
}