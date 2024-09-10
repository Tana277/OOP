public class baitonghop {
    public static void max( int[] arr )
    {
        int result = arr[0];
        for( int i=0; i<arr.length; i++)
        {
            if( arr[i] > result)
                result = arr[i];
        }
        System.out.println("Maximum value of an array: " + result);
    }
    public static void min( int[] arr )
    {
        int result = arr[0];
        for( int i=0; i<arr.length; i++)
        {
            if( arr[i] < result)
                result = arr[i];
        }
        System.out.println("Minimum value of an array: " + result);
    }
    public static void sumEven (int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                sum += a[i];
            }
        }
        System.out.println("Sum all even numbers in array: " + sum);
    }
    public static int countArray (int[] a){
        return a.length;
    }
    public static void primeNum (int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i]<2){}
        }
    }

    public static void main(String[] args) 
    {
        int[] a = {1, 4 , 5, 12 ,-9, -11, 7, -2};
        max(a);
        min(a);
        sumEven(a);
        int count = countArray(a);
        System.out.println("specific elements are in an array: " + count);
        
    }
}