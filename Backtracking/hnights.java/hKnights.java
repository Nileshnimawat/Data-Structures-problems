class hKinghts {

    public static boolean hKnightTour(int grid[][], int row, int col, int num){
        int n = grid.length;
        if(grid[row][col]==n*n-1){
            return true;
        }

        int i = row+2;
        int j = col+1;
        if(i<n && j<n && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

        i = row+2;
         j = col-1;
        if(i<n && j>=0 && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

         i = row-2;
         j = col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

         i = row+1;
         j = col+2;
        if(i<n && j<n && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

        i = row-1;
         j = col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

         i = row+1;
         j = col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return hKnightTour(grid, i, j, num+1);

        return false;
    }

    public static boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0)
            return false;
        return hKnightTour(grid, 0, 0, 0);
    }
    public static void main(String[] args) {
      
    }
}