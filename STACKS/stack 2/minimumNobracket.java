import java.util.Scanner;
import java.util.Stack;

public class minimumNobracket {
     public static int checkBalancedBrack(String str){
        int count=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //
            if (ch=='(') {
                st.push(ch);
                count++;
            }
           else{
              if (st.size()==0)  count++;
              if(ch==')'&& st.size()!=0) {
                st.pop();
                count--;
              }

           }
        }
      return count;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bracket : ");
        String str = sc.nextLine();
        sc.close();;
        System.out.println(checkBalancedBrack(str));
    }
}
