import java.util.Scanner;
import java.util.Stack;

public class leetcode20 {
  
        public static boolean isValid(String s) {
             Stack<Character> st = new Stack<>();
             for(int i=0; i<s.length();i++){
                 char ch = s.charAt(i);
                 if(ch =='('||ch=='{'||ch=='[') st.push(ch);
                  else {
                     if(st.size()==0) return false;
                     if(ch==')'&& st.peek()=='('||ch== '}'&& st.peek()=='{'||ch==']'&& st.peek()=='[') st.pop();
                     else return false;
                 }
                
             }
             if(st.size()==0) return true;
             else return false;
         }
     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the bracket : ");
        String str = sc.nextLine();
        sc.close();;
        System.out.println(isValid(str));
    }
}
