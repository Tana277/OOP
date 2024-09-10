import java.util.Scanner;
public class bai2 
{
    public static void addMatix( )
    {
        System.out.println("=====Add two matrices=====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        System.out.println("Enter matrix 1: ");
        for( int i=0; i<row; i++){
            for( int j=0; j<col; j++){
                matrix1[i][j] = sc.nextInt();
            }    
        } 
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter matrix 2: ");
        for( int i=0; i<row; i++){
            for( int j=0; j<col; j++){
                matrix2[i][j] = sc.nextInt();
            }    
        }
        sc.close();
        int[][] matrix = new int[row][col];
        for( int i=0; i<row; i++){
            for( int j=0; j<col; j++){
                matrix[i][j] = matrix1[i][j]+matrix2[i][j];
            }    
        }
        System.out.println("Result:");
        print2D(matrix);
    }
    public static void mulMatrix()
    {
        System.out.println("=====Multiply a matrix with a number=====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row1 = sc.nextInt();
        System.out.print("Enter col: ");
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter matrix : ");
        for( int i=0; i<row1; i++){
            for( int j=0; j<col1; j++){
                matrix1[i][j] = sc.nextInt();
            }    
        } 
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        int[][] matrix = new int[row1][col1];
        for( int i=0; i<row1; i++){
            for( int j=0; j<col1; j++){
                matrix[i][j] = matrix1[i][j]*number;
            }    
        }
        System.out.println("Result: ");
        print2D(matrix);
    }
    public static void print2D(int mat[][])
    {
        for (int[] row : mat){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.print("\n"); 
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Ex2:");
        // addMatix();
        mulMatrix();
    }
}

