import java.util.Scanner;
//print out the sum of the numbers in the second row of the nums arry.
public class print_sum{
    public static int printSeconfRowSum(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[1].length;j++){
                sum+=matrix[i][j];
            }
            if(key==i){
                return sum;
            }
           
        }
        return -1;
    }
    public static void prefixSum(int matrix[][]){
         for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
    }
    }
    public static void rowSum(int matrix[][],int targetrow){
        targetrow=targetrow-1;
        prefixSum(matrix);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and the column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("enter the "+row*column + "elements of matrix : ");
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
    }
    System.out.println("enter the targeted sum of row : ");
    int targetedRow = sc.nextInt();
    sc.close();
   int sum = printSeconfRowSum(matrix, targetedRow-1);
   System.out.println(sum);

}
}