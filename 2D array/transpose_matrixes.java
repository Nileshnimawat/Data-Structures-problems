import java.util.Scanner;

public class transpose_matrixes {
    //finding transpose of matrixes
    public static void printLoop(int matrix[][]){ //creating printloop for further printing
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void transpose(int matrix[][], int row, int column){
        int temp;
         for(int i=0;i<row;i++){
             for(int j=i;j<column;j++){
               temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;     
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
    transpose(matrix, row, column);
    printLoop(matrix);

}

}
