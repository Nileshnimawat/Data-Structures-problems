public class revison1 {
    public static int rateInAmaze(int maze[][], int row, int col,String str){
        int n = maze.length;
        if(row<0 || col<0 || row>n-1 || col>n-1) return 0;
       
        if(row==n-1 && col==n-1){
            System.out.println(str+" ");
            return 1;
        }
        if(maze[row][col]==0) return 0;
        if(maze[row][col]==-1) return 0;


        maze[row][col] = -1;

        //for right
        int right = rateInAmaze(maze, row, col+1, str+"R");
        //for left
        int left = rateInAmaze(maze, row, col-1, str+"L");
        //for up
        int up = rateInAmaze(maze, row-1, col, str+"U");
        //for down
        int down = rateInAmaze(maze, row+1, col, str+"D");
        maze[row][col] = 1;

        return right+left+up+down;

    }
    public static void main(String[] args) {
        int maze[][] = {{1,1,0,0},
                        {1,1,0,1},
                        {1,1,0,0},
                        {0,1,1,1}};

       int ways =  rateInAmaze(maze,0,0,"");   
       System.out.println(ways+" ");             
    }
}
