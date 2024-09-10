import java.util.Scanner;

public class bai4 
{
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println("Ex4:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str = sc.nextLine();
        // 
        System.out.println("Length of the string: " + str.length());
        //
        int count = 1;
        for (int i = 0; i < str. length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {count++; }
        } 
        System. out. println("Number of words in a string : " + count); 
        //
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        String result = str.concat(str2);
        System.out.println(result);
        //
        if( isPalindrome(str)){System.out.println("A string is palindrome");}
        else{System.out.println("A string is not palindrome");}
        sc.close();
    }
}

