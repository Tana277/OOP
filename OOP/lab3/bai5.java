import java.util.Scanner;
public class bai5 
{
    public static int Count(String a[])
    {
        String[] b = new String[a.length];
        int x=1;
        b[0]= String.copyValueOf(a[0].toCharArray());
        for(int i=1;i<a.length;i++){
            int dem=0;
            for(int j=0;j<x;j++){
                if(a[i].equalsIgnoreCase(b[j]))
                    dem++;
            }
            if(dem==0){
                b[x]= String.copyValueOf(a[i].toCharArray());
                x++;
            }
        }
        return x;
    }
    public static void print2D(String mat[][])
    {
        for (String[] row : mat){
            for (String x : row){
                System.out.print(x + " ");
            }
            System.out.print("\n"); 
        }
    }
    public static void frequen(String str)
    {
        String[] words = str.split("\\s");
        String[][] res = new String[Count(words)][2];
        int i, j, k=0; 
        int[] fre = new int[words.length];

        for( i=0; i<words.length; i++)
            fre[i] = -1;    
        for( i=0; i<words.length; i++)
        {
            int count = 1;
            for( j=i+1; j<words.length; j++)
            {
                if( words[i].equalsIgnoreCase(words[j]))
                {
                    count ++;
                    fre[j] = 0;
                }
            }
            if( fre[i] != 0 ){
                res[k][0] = String.copyValueOf(words[i].toCharArray());
                res[k][1] = String.copyValueOf(String.valueOf(count).toCharArray());
                k++;
            }
        }
        // for( i=k; i<words.length; i++ )
        // {
        //     res[i][0] = "\0";
        //     res[i][1] = "\0";
        // }
        print2D(res);
    }
    public static void main(String[] args) 
    {
        System.out.println("Ex5:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.replaceAll("\\p{Punct}","");
        frequen(str);
    }    
}
