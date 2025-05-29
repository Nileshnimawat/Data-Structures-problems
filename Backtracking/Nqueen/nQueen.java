package Nqueen;
public class nQueen {

    public static boolean isValid(char board[][], int row, int col){
        int n = board.length;
        //right
        for(int j=0; j < n; j++){
            if(board[row][j]=='Q') return false;
        }
        //down
        for(int i=0; i < n; i++){
            if(board[i][col]=='Q') return false;
        }
        //east north
        int i = row;
        int j = col;
          while(i>=0 && j<n){
            if(board[i--][j++]=='Q') return false;
          }

          // east south
        i = row;
         j = col;
          while(i<n && j<n){
            if(board[i++][j++]=='Q') return false;
          }

          //west-north
        i = row;
         j = col;
          while(i>=0 && j>=0){
            if(board[i--][j--]=='Q') return false;
          }
           //west-south
            i = row;
            j = col;
             while(i<n && j>=0){
               if(board[i++][j--]=='Q') return false;
             }

             return true;
    }
    
    private static void printNQueen(int row,  char[][] board) {
        if(row == board.length) {
            for(int i=0; i < board.length; i++) {
                for(int j=0; j < board.length ; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
            }
        
        for(int j=0; j < board.length; j++){
        if(isValid(board , row, j)==true) {
            board[row][j] = 'Q';
            printNQueen(row+1, board);
            board[row][j] = '.';
        }
        }
    }
    
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i < board.length; i++) {
            for(int j=0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        printNQueen(0,  board);

    }


}
