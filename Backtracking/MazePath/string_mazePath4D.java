package MazePath;
public class string_mazePath4D {
    public static int mazePath(int sr, int sc, int er, int ec, boolean isValid[][], String s) {
        // Base cases
        if (sr > er || sc > ec) return 0;
        if (sr < 0 || sc < 0) return 0;
        if (isValid[sr][sc]==true) return 0;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return 1;
        }
    
        isValid[sr][sc] = true;

       
        int right = mazePath(sr, sc + 1, er, ec, isValid, s+"R");
        int left = mazePath(sr, sc - 1, er, ec, isValid, s+"L");
        int up = mazePath(sr - 1, sc, er, ec, isValid, s+"U");
        int down = mazePath(sr + 1, sc, er, ec, isValid, s+"D");

        isValid[sr][sc] = false;

        return right + left + up + down;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean isValid[][] = new boolean[row][col];
        int count = mazePath(0, 0, row - 1, col - 1, isValid,"");
        System.out.println("ways :  "+count);
    }
}
