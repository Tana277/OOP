import java.util.Scanner;

public class bai8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: "); 
        int n = sc.nextInt();
        caua(n);
        caub(n);
        cauc(n);
        caud(n);
        caue(n);
        sc.close();
    }
    public static void caua( int n )
    {
        int sum=0;
        for( int i = 1; i<=n; i++)
        {
            sum +=i;
        }
        System.out.println("Cau a = " + sum );
    }
    public static void caub( int n )
    {
        int product=1;
        for( int i = 1; i<=n; i++)
        {
            product *=i;
        }
        System.out.println("Cau b = " + product );
    }
    public static void cauc( int n )
    {
        int result=0;
        for( int i = 0; i<=n; i++)
        {
            result += Math.pow(2,i);
        }
        System.out.println("Cau c = " + result );
    }
    public static void caud( int n )
    {
        float result=0;
        for( int i = 1; i<=n; i++)
        {
            result += (float)1/(2*i);
        }
        System.out.println("Cau d = " + result );
    }
    public static void caue( int n )
    {
        int result=0;
        for( int i = 1; i<=n; i++)
        {
            result += Math.pow(i,2);
        }
        System.out.println("Cau e = " + result );
    }
}