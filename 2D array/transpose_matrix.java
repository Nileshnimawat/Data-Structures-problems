import java.util.Scanner;

public class transpose_matrix{
    public static void printLoop(int matrix[][]){ //creating printloop for further printing
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void transposeMatrixNoSpaceExtra(int matrix[][],int row,int column){//the transpose function without using the extra space
        //int transpose[][] = new int[column][row];
        int temp;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
              temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
            }
        }
    }

    public static void transposeMatrix(int matrix[][],int row,int column){//the transpose function using the extra space
        int transpose[][] = new int[column][row];
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
               transpose[i][j] = matrix[j][i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix size : ");

        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("enter the 1st matrix : "); //taking input of 1st matrix
        int matrix[][] = new int[row][column];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        
    sc.close();
    transposeMatrixNoSpaceExtra(matrix, row, column);
    printLoop(matrix);
}

}