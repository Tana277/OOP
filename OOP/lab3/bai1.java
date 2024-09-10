import java.util.Arrays;
import java.util.Scanner;
// import java.util.Arrays;
public class bai1 
{
    static int delete(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Khong tim thay phan tu can xoa");
            return n;
        }
        else{
            for (int i = pos; i < n-1; i++) {
                arr[i] = arr[i + 1];
                // System.out.println(Arrays.toString(arr));
            }
            return n-1;
        }
    }
    public static int[] reSize(int[] a, int size){
        int[] temp = new int [size];
        System.arraycopy(a, 0, temp, 0, (a.length < size) ? a.length : size);
        return temp;
    }
    static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static int[] insertX(int n, int arr[],int x, int pos)
    {
        int i;
        int newarr[] = new int[n];
        for (i = 0; i < n ; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
    public static void dublicate (int[] array){
        System.out.print("Duplicate Element : ");
        for (int i = 0; i <array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                if ((array[i] == array[j]) && (i != j)){
                    System.out.print(array[j] + " ");
                }
            }
        }
        System.out.println(" ");
    }
    public static void del_duplicate( int a[], int n)
    {
        int i, j;
        for( i = 0; i < n-1; i++)
        {
            for( j = i+1; j < n-1; j++)
            {
                if( a[i] == a[j])
                {
                    int k;
                    for( k = j; k < n-1; k++)
                    {
                        a[k] = a[k+1];
                    }
                    n -= 1;
                    j--;
                }        
            }
        }
        System.out.print("Remove the duplicate values: ");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for( int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = n;
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter specific element: ");
        int index = sc.nextInt();
        k = delete(arr,k,index);
        arr = reSize(arr,k);
        System.out.println(Arrays.toString(arr));
        //
        // System.out.print("Enter specific element: ");
        // int x = sc.nextInt();
        // System.out.print("Enter specific position: ");
        // int pos = sc.nextInt();
        // arr = insertX(k, arr, x, pos);
        // System.out.println("Array with " + x + " inserted at position "+ pos + ":\n" + Arrays.toString(arr));
        // //
        // dublicate(arr);
        // //
        // del_duplicate(arr, k);
        sc.close();
    }    
}

