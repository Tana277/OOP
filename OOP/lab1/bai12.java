import java.util.Scanner;
public class bai12
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        reverse(n);
        sc.close();
    }
    public static void reverse( int n )
    {
        int result=0;
        while(n>0){result = result*10 + n%10; n/=10;}
        System.out.print("Reverse = " + result);
    }
}