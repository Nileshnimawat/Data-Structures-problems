public class revision2 {
    public static boolean isValid(char board[][], int row, int col){
        int n = board.length;
        for(int i =0; i < n; i++){ //up to bottom
            if(board[i][col]=='Q') return false;
        }
        for(int i =0; i < n; i++){ //left to right
            if(board[row][i]=='Q') return false;
        }
        int i = row;
        int j = col; //east-north
        while(i>=0 && j<n){
            if(board[i--][j++]=='Q') return false;
        }

        i = row;
        j = col; //east south
        while(i<n && j<n){
            if(board[i++][j++]=='Q') return false;
        }
         i = row;
         j = col; //west-north
        while(i>=0 && j>=0){
            if(board[i--][j--]=='Q') return false;
        }

        i = row;
        j = col; //west- south
        while(i<n && j>=0){
            if(board[i++][j--]=='Q') return false;
        }

        return true;
    }

    public static void nQueenTour(char board[][], int row, int col){
        int n = board.length;
        if(row==n){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board.length; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int j=0; j < n; j++){
        if(isValid(board,row,j)==true){
                board[row][j] = 'Q';
                nQueenTour(board, row+1, col);
                board[row][j] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        System.out.println("done");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '.';
            }
        }

        nQueenTour(board,0,0);
    }
}
