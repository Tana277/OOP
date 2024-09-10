import java.util.Scanner;

public class bai10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        sumFirstLast(n);
        sc.close();
    }
    public static void sumFirstLast( int n )
    {
        int lastNumber = n % 10;
        int firstNumber = 0;

        while(n != 0){ 
            firstNumber = n;
            n = n/10;
        }
        System.out.println("Tong so dau tien va cuoi cung = "+ (firstNumber + lastNumber)); 
    }
}