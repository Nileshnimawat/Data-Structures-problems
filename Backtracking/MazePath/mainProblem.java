package MazePath;
public class mainProblem {
    
        public static void mazePath(int sr, int sc, int er, int ec, boolean isValid[][], String s , int[][] maze) {
            // Base cases
            if (sr > er || sc > ec) return ;
            if (sr < 0 || sc < 0) return ;
            if(maze[sr][sc]==-1 )return;
            if (sr == er && sc == ec) {
                System.out.println(s);
                return ;
            }
            if(maze[sr][sc]==0)return;
        
            maze[sr][sc]=-1;
           
            mazePath(sr, sc + 1, er, ec, isValid, s+"R", maze); // right
             //
            mazePath(sr, sc - 1, er, ec, isValid, s+"L" , maze); // left

            mazePath(sr - 1, sc, er, ec, isValid, s+"U", maze); // upp

            mazePath(sr + 1, sc, er, ec, isValid, s+"D", maze);  // down
    
            maze[sr][sc]=1;
    
            
        }
    
        public static void main(String[] args) {
            int row = 4;
            int col = 4;
            boolean isValid[][] = new boolean[row][col];
            int maze[][] = {{1,0,0,0},
                            {1,1,0,1},
                            {1,1,0,0},
                            {0,1,1,1}};
             mazePath(0, 0, row - 1, col - 1, isValid,"",maze);
            
        }
    }


