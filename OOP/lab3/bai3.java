import java.util.Scanner;
public class bai3 
{
    public static void firstLastName(String name)
    {
        String[] words = name.split("\\s");
        System.err.println("First last name: " + words[0] + " " + words[words.length-1]);
    }
    public static void middleName(String name)
    {
        String[] words = name.split("\\s");
        System.out.print("Middle name: ");
        for( int i=1; i<words.length-1; i++)
            System.out.print( words[i] );
        System.out.print("\n");
    }
    public static void capitalName(String name)
    {
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        name = String.valueOf(charArray);
        System.out.println("Capitalize the full name: " + name);
    }
    public static boolean checkVowels(char ch)
    {
        boolean isVowel = true;
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : {isVowel = true; break;}
            default: {isVowel = false; break;}
        }
        return isVowel;
    }
    public static void vowels( String name )
    {
        char[] charArray = name.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if( checkVowels(charArray[i]) ){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            else{
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        name = String.valueOf(charArray);
        System.out.print("Uppercase all vowels and lowercase all consonants: "+name);
    }
    public static void main(String[] args) 
    {
        System.out.println("Ex3:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        firstLastName(name);
        middleName(name);
        capitalName(name);
        vowels(name);
    }    
}

