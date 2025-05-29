import java.util.*;
public class multiplication_matrix {
    //creating a multiplication of matrix
    public static void printLoop(int matrix[][]){ //creating printloop for further printing
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
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
        System.out.println("enter the matrix size : ");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();
        System.out.println("enter the 2nd matrix : "); // taking input of 2nd matrix
        int matrix2[][] = new int[row2][column2];
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
               matrix2[i][j] = sc.nextInt();
            }
            
    }
    sc.close();
            multiplicationMatrix(matrix, matrix2, row, column, row2, column2);
    }
    public static void multiplicationMatrix(int matrix[][],int matrix2[][],int row,int column,int row2,int column2){
        int multiplication[][] = new int[row][column2]; 
        for(int i=0;i<row;i++){
            for(int j=0;j<column2;j++){
                for(int k=0;k<column;k++){
                     multiplication[i][j] += matrix[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("the multiplication of matrix :  ");
        printLoop(multiplication);
    }
}