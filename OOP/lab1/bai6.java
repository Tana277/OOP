import java.util.Scanner;
public class bai6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number: "); 
        int a = sc.nextInt(), b =  sc.nextInt(), c = sc.nextInt();
        min(a,b,c);
        sc.close();
    }
    public static void min( int a, int b, int c)
    {
        int min;
        if( a < b && a < c){min=a;}
        else if( b < c){min=b;}
        else{min=c;}
        System.out.println("Min = " + min);
    }
}