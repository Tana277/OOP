public class JavaBasic{
    public static int sumNegativeElements(int arr[]){
        //code here
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0 ){
                sum += arr[i];
            }
        }
        return sum;

    }

    public static String uppercaseFirstVowels(String str){
        //code here
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i==0 || !Character.isLetter(str.charAt(i-1))){
                if(ch == 'u' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i'){
                    result.append(Character.toUpperCase(ch));
                    continue;
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
	
	public static int findMinNegativeElement(int a[]){
        //code here
        int minNegative = a[0];
        int minNegativeIndex = -1;
        for(int i=0; i<a.length; i++){
            if(a[i] < 0 && a[i] < minNegative){
                minNegative = a[i];
                minNegativeIndex = i;
            }
        }
        return minNegativeIndex;
    }
	
	public static String getName(String str){
        //code here
        int colonIndex = str.indexOf(":");
        if (colonIndex == -1){
            return "";
        }
        String name = str.substring(colonIndex + 1).trim();
        return name;

    }

    public static int findFirstMod3Element(int[] a){
        //code here
        for(int i=0; i<a.length; i++){
            if(a[i] % 3 == 0){
                return i;
            }
        }
        return -1;
    }

    public static int countString(String str, String k){
        //code here
        str = str.toLowerCase();
        k = k.toLowerCase();

        int count = 0;
        String[] words = str.split(" ");
        for(String word : words){
            if(word.equals(k)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        
        int sum = sumNegativeElements(a);
        System.out.println("Sum negative elements: " + sum);

        int min = findMinNegativeElement(a);
        System.out.println("Find min negative element: " + min);

        String s = "nguyen thi uyen an";
        String result = uppercaseFirstVowels(s);
        System.out.println("Uppercase first vowels: " + result);

		String s1 = "Name: Le Thi Thu Thao";
        String name = getName(s1);
        System.out.println("Name: " + name);

        String s2 = "Nguyen Thi Oanh Oanh";
        int count = countString(s2, "Oanh");
        System.out.println("Count string: " + count);
        //Test all of methods which you implemented
    }

}