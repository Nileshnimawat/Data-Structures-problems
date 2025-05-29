import java.util.Scanner;

public class spiral_matrix2 {
    //printing spiral matrix of the 1234 counting by intaking the number and n then sqaure it .
    public static void printLoop(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] spiralMatrix(int n) {
        int matrix[][] = new int[n][n];
        int count = 1;
        int firstRow = 0;
        int lastColumn = matrix[0].length - 1;
        int firstColumn = 0;
        int lastRow = matrix.length - 1;
        while (count <= n * n) {
            // First row and the column in the first line
            for (int i = firstColumn; i <= lastColumn && count <= n * n; i++) {
                matrix[firstRow][i] = count++;
            }
            firstRow++;
    
            // Last column and the rows in the last line
            for (int i = firstRow; i <= lastRow && count <= n * n; i++) {
                matrix[i][lastColumn] = count++;
            }
            lastColumn--;
    
            // Last row and the opposite columns
            for (int i = lastColumn; i >= firstColumn && count <= n * n; i--) {
                matrix[lastRow][i] = count++;
            }
            lastRow--;
    
            // First column and the rows in the first line
            for (int i = lastRow; i >= firstRow && count <= n * n; i--) {
                matrix[i][firstColumn] = count++;
            }
            firstColumn++;
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
        int row = sc.nextInt();
        //System.out.println("Enter the matrix elements: ");
        

        sc.close();

        int matrix2[][]=spiralMatrix(row);
        printLoop(matrix2);
    }
}
