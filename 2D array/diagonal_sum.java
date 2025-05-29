import java.util.Scanner;

public class diagonal_sum {
    //diagonal sum of matrix
    public static void diagonalSum(int matrix[][]){//time copmlexitry is nsqaure
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
             if(i==j){
                sum+=matrix[i][j];
             }
             else if(i+j==n-1){
                sum+=matrix[i][j];
             }
             
            }
        }
        System.out.println(sum);
    } public static void diagonalSum2(int matrix[][]){//time copmlexitry is nsqaure
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            
           
                sum+=matrix[i][i];
             
             if(i!=n-1-i){
                sum+=matrix[i][n-i-1];
             }
                    }
        System.out.println(sum);
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix size : ");

        int row = sc.nextInt();
        System.out.println("enter the 1st matrix : "); //taking input of 1st matrix
        int matrix[][] = new int[row][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
               matrix[i][j] = sc.nextInt();
            }
        }
    sc.close();
          diagonalSum2(matrix);
    }
}
