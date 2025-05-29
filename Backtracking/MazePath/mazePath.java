package MazePath;
public class mazePath {
    public static int mazepath(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int right = mazepath(sr, sc+1, er, ec);
        int downwards = mazepath(sr+1, sc, er, ec);
        int totalways = right+downwards;
        return totalways;
    }
    public static void main(String[] args) {
        int row =3;
        int col = 3;
        int count = mazepath(1,1,row,col);
        System.out.println(count);
    }

}
