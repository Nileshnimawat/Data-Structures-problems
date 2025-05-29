public class hKnightsK {
    static int number = 5;
    public static boolean isValid(char grid[][], int row, int col){
        int n = grid.length;
        int i,j;
        //2up 1right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && grid[i][j]== 'H') return false;

        //2up 1left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j]== 'H') return false;

         //2down 1right
         i = row+2;
         j = col+1;
         if(i<n && j<n && grid[i][j]== 'H') return false;
 
         //2down 1left
         i = row+2;
         j = col-1;
         if(i<n && j>=0 && grid[i][j]== 'H') return false;

           //1up 2right
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j]== 'H') return false;

        //1up 2left
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j]== 'H') return false;

          //1down 2right
          i = row+1;
          j = col+2;
          if(i<n && j<n && grid[i][j]== 'H') return false;
  
          //1down 2left
          i = row+1;
          j = col-2;
          if(i<n && j>=0 && grid[i][j]== 'H') return false;

          return true;
    }

    
    public static void printNQueen(int row , int col,  char[][] board , int num) {
        int n = board.length;
        if(row == board.length ) {
            if(num==number){
            for(int i=0; i < board.length; i++) {
                for(int j=0; j < board.length ; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
            System.out.println();
            return;
            }
        
       
        else if(isValid(board , row, col)==true) {
            board[row][col] = 'H';
           if( col!=n-1) printNQueen(row, col+1, board ,num+1);
           else printNQueen(row+1, 0, board ,num+1);
            board[row][col] = '.'; 
    }
   
        if( col!=n-1) printNQueen(row, col+1, board ,num);
        else printNQueen(row+1, 0, board ,num);
    
    
}
   public static void main(String[] args) {
    int n = 3;
    char board[][] = new char[n][n];
    for(int i=0; i < board.length; i++) {
        for(int j=0; j < board.length; j++) {
            board[i][j] = '.';
        }
    }
    printNQueen(0,0, board,0);
   }
}
