import java.util.Scanner;
public class bai13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        palidrome(n);
        sc.close();
    }
    public static void palidrome( int n )
    {
        if(!prime(n)){System.out.print("Not prime");}
        else
        {
            int result=0, tmp=n;
            while(tmp>0){result = result*10 + tmp%10; tmp/=10;}
            if( result == n ) {System.out.print("Palindrome");}
            else{System.out.print("Not Palindrome");}
        }
    }
    public static boolean prime( int n )
    {
        boolean result = true;
        if( n < 2) {result = false;}
        else{for( int i=2; i<=Math.sqrt(n);i++){if(n%i==0){result=false;}}}
        return result;
    }
}