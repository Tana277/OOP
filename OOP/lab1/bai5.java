import java.util.Scanner;

public class bai5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: "); 
        int year = sc.nextInt();
        checkyear(year);
        sc.close();
    }
    public static void checkyear( int year)
    {
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {System.err.println("A leap year");}
        else {System.err.println("Not a leap year");}
    }
}