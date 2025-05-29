import java.util.Scanner;

public class addition_twoarray{
    //addition of two 2d array matrixes
    //step 1 declaration of 2d array
    public static void printLoop(int matrix[][]){ //creating printloop for further printing
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    //creating a matrix sum function which adds the two matrixes
    public static void matrixSum(int matrix[][],int matrix2[][]){
        int sum[][]= new int[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum[i][j] = matrix[i][j]+matrix2[i][j];
            }
            System.out.println();
        }
        printLoop(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix size : ");
        int size = sc.nextInt();
        System.out.println("enter the 1st matrix : "); //taking input of 1st matrix
        int matrix[][] = new int[size][size];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the 2nd matrix : "); // taking input of 2nd matrix
        int matrix2[][] = new int[size][size];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        matrixSum(matrix, matrix2);
        
    }
}