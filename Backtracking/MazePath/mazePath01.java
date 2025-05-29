package MazePath;
public class mazePath01 {
    public static void mazepath(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec) return ;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
         mazepath(sr, sc+1, er, ec,s+"R");
        mazepath(sr+1, sc, er, ec,s+"D");
       
    }
    public static void main(String[] args) {
        int row =3;
        int col = 3;
        String s="";
        mazepath(1,1,row,col,s);
       
    }
}
