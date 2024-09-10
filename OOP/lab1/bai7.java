import java.util.Scanner;

public class bai7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: "); 
        char n = sc.next().charAt(0);
        alphanum(n);
        sc.close();
    }
    public static void alphanum( char n )
    {
        if( (n >= 48 && n <=57) || (n>=65 && n<=90) || (n>=97 && n<=122) ) {System.err.println("Alphanumeric");}
        else {System.err.println("Not alphanumeric");}
    }
}