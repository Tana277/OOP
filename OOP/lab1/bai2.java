import java.util.Scanner;
public class bai2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat(), base = sc.nextFloat();
        System.out.println("Area = " + ((float)1/2*base*height));
        sc.close();
    }
}