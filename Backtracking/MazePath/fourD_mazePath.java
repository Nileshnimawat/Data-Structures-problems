package MazePath;
public class fourD_mazePath {
    public static int mazePath(int sr, int sc, int er, int ec, boolean isValid[][]) {
        // Base cases
        if (sr > er || sc > ec) return 0;
        if (sr < 0 || sc < 0) return 0;
        if (isValid[sr][sc]==true) return 0;
        if (sr == er && sc == ec) return 1;

        // Mark the current cell as visited
        isValid[sr][sc] = true;

        // Explore all possible directions
        int right = mazePath(sr, sc + 1, er, ec, isValid);
        int left = mazePath(sr, sc - 1, er, ec, isValid);
        int up = mazePath(sr - 1, sc, er, ec, isValid);
        int down = mazePath(sr + 1, sc, er, ec, isValid);

        // Backtrack: Mark the current cell as unvisited
        isValid[sr][sc] = false;

        return right + left + up + down;
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        boolean isValid[][] = new boolean[row][col];
        int count = mazePath(0, 0, row - 1, col - 1, isValid);
        System.out.println(count);
    }
}
