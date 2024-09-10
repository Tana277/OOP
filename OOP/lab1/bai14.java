import java.util.Scanner;
public class bai14
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("-----Menu-----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.print("Please enter the number: ");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                {
                    System.out.print("The price of Coca is: 2$, please enter the amount of money: ");
                    int money = sc.nextInt();
                    if( money > 2)
                    {
                        System.out.println("Your change is " + (money-2) +".");
                    }
                    else
                    {   
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("The price of Pepsi is: 2$, please enter the amount of money: ");
                    int money = sc.nextInt();
                    if( money > 2)
                    {
                        System.out.println("Your change is " + (money-2) +".");
                    }
                    else
                    {   
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                }
                case 3:
                {
                    System.out.print("The price of Sprite is: 3$, please enter the amount of money: ");
                    int money = sc.nextInt();
                    if( money > 2)
                    {
                        System.out.println("Your change is " + (money-3) +".");
                    }
                    else
                    {   
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                }
                case 4:
                {
                    System.out.print("The price of Snack is: 1$, please enter the amount of money: ");
                    int money = sc.nextInt();
                    if( money > 2)
                    {
                        System.out.println("Your change is " + (money-1) +".");
                    }
                    else
                    {   
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Machine is shutting down");
                    System.exit(0);
                    sc.close();
                    break;
                }
                default:
                {
                    System.out.println("Please enter the valid number.");
                    break;
                }
            }
        }
    }
}