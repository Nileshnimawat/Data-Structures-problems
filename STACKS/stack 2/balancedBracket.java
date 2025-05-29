import java.util.*;
public class balancedBracket {
    public static boolean checkBalancedBrack(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //
            if (ch=='(') st.push(ch);
            else if (st.size()==0) return false;
            else if(ch==')') st.pop();
        }
        if(st.size()==0) return true;
        else return false;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bracket : ");
        String str = sc.nextLine();
        sc.close();;
        System.out.println(checkBalancedBrack(str));
    }
}
