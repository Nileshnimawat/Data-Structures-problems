public class problem4 {
    static int number =5;
    public static boolean isValid(char grid[][], int row, int col){
        int n = grid.length;
        int i = row+2;
        int j = col+1;
        if(i<n && j<n && grid[i][j]=='Q') return false;
        i = row+2;
         j = col-1;
        if(i<n && j>=0 && grid[i][j]=='Q') return false;

         i = row-2;
         j = col+1;
        if(i>=0 && j<n && grid[i][j]=='Q') return false;

        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j]=='Q') return false;

         i = row+1;
         j = col+2;
        if(i<n && j<n && grid[i][j]=='Q') return false;

        i = row-1;
         j = col+2;
        if(i>=0 && j<n && grid[i][j]=='Q') return false;

         i = row+1;
         j = col-2;
        if(i<n && j>=0 && grid[i][j]=='Q') return false;

        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j]=='Q') return false;

        return true;
    }

    public static void hKnightPrint(char grid[][] ,int row, int col, int num){
        int n = grid.length;
        if(row==n){
            if(num==number){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
        }
            System.out.println();
            return;
        }


        if(isValid(grid,row,col)==true){
            grid[row][col] = 'Q';
           if(col!=n-1) hKnightPrint(grid, row, col+1, num+1);
           else hKnightPrint(grid, row+1, 0, num+1);
           grid[row][col] = '.';
        }
        
            if(col!=n-1) hKnightPrint(grid, row, col+1, num);
            else hKnightPrint(grid, row+1, 0, num);
    
        
    }
    public static void main(String[] args) {
        int n = 3;
        char grid[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = '.';
            }
        }
        
        hKnightPrint(grid,0, 0, 0);
    }
}
