import java.util.Scanner;

public class bai4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit ");
        System.out.print("Choose number: ");  int key  = sc.nextInt();
        
        if( key == 1 )
        {
            System.out.print("Enter Fahrenheit: "); 
            float temperature = sc.nextFloat();
            System.out.print("Celsius = " + FtoC(temperature));
        }
        else
        {
            System.out.print("Enter Celsius: ");
            float temperature = sc.nextFloat();
            System.out.print("Fahrenheit = " + CtoF(temperature));
        }
        sc.close();
    }
    public static float FtoC ( float temp )
    {
        return (temp-32)*5/9;
    }
    public static float CtoF ( float temp)
    {
        return temp * 9/5 + 32;
    }
}