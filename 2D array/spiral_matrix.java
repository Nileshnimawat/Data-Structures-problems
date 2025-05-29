import java.util.Scanner;

public class spiral_matrix {
    public static void printLoop(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void spiralMatrix(int matrix[][]) {
        int row = 0;
        int rowend = matrix.length - 1;
        int column = 0;
        int columnend = matrix[0].length - 1;
        
        while (row <= rowend && column <= columnend) {
            // First row and the columns of the line
            for (int i = column; i <= columnend; i++) {
                System.out.print(matrix[row][i] + " ");
            }
            
            // Last row and the last column
            for (int i = row + 1; i <= rowend; i++) {
                System.out.print(matrix[i][columnend] + " ");
            }
            
            // Last row and the opposite columns
            for (int i = columnend - 1; i >= column; i--) {
                if(column==columnend) break;
                System.out.print(matrix[rowend][i] + " ");
                
            }
            
            // First row and the whole column
            for (int i = rowend - 1; i >= row + 1; i--) {
                 if(row==rowend) break;
                System.out.print(matrix[i][column] + " ");
            }
            
            row++;
            rowend--;
            column++;
            columnend--;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");

        System.out.println("Enter the matrix: "); // Taking input of the matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11 ,12}
        };

        spiralMatrix(matrix);
        
        // Close the Scanner
        sc.close();
    }
}
