import java.util.*;
public class infixToprefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57){
                String s = ""+ch;
                val.push(s);
            }
            else if (op.size()==0 || op.peek()=='('|| ch=='(') op.push(ch);
            else if (ch==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                   // op.pop();
                }
                op.pop();

            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                    op.push(ch);
                }
                else  if(ch=='*' || ch=='/'){
                    if(op.peek()=='*'|| op.peek()=='/'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                    op.push(ch);
                    }
                    else op.push(ch);
                }
                
            }
        }
        while(val.size()!=1){
             String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                   
        }
        System.out.println(val.peek());
    }
}
