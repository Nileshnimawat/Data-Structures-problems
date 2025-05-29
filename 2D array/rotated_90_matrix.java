import java.util.Scanner;

public class rotated_90_matrix {
    public static void printLoop(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
    public static void transposeMatrixExtra(int matrix[][]){//the transpose function using the extra space
        int transpose[][] = new int[matrix.length][matrix.length];
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose.length;j++){
               transpose[i][j] = matrix[j][i];
            }
        }
        
        
    }

    public static void transposeMatrix(int matrix[][]) {

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix(int matrix[][]) {
        transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
        int row = sc.nextInt();
        System.out.println("Enter the matrix elements: ");

        int matrix[][] = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        rotateMatrix(matrix);
        printLoop(matrix);
    }
}
