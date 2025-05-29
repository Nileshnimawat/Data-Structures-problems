import java.util.*;
public class toggle {
    // togle the char PHysiCs tp phYSIcS
    public static void Charactertogle(StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if (ch==' ')continue;
           //this statement used to skip the spaces
           //
        
            int ascii = (int)ch; //typecasting first to int 
            
            if (ascii<66)continue;
           else  if (ascii>130)continue;
            else if(ascii<=97){
                ascii+=32;
                char set = (char)ascii; //typecast again on char
                sb.setCharAt(i, set);
            }
            else if(ascii>=97) {
                ascii-=32;
                 char set = (char)ascii;
                 sb.setCharAt(i, set);
            
            
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strring");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sc.close();
        Charactertogle(sb);
    }
}
