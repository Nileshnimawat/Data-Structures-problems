import java.util.Stack;

public class problem01 {
  
    public static void main(String[] args) {
        String s = "(()()())";
            Stack<Character> st = new Stack<>();
            String str="";
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(st.size()==0) st.push(ch);
                else if(st.peek()!=ch) st.push(ch);
            }
            while(st.size()!=0){
                char v2 = st.pop();
                char v1 = st.pop();
                str = str+v1+v2;
            }
          System.out.println(str);
    
        }
    }

//output expected = ()()()
// error output = 818181