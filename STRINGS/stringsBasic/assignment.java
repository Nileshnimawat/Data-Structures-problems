import java.util.*;
public class assignment {
    //check whether two strings is anagram or  not
    public static void main(String[] args) {
        String str = "care";
        String str1 = "race";
        if(str.length()!=str1.length()){
            System.out.println("not a Anagram");
        }
        else{
            char ch[] = str.toCharArray();
            char ch2[] = str1.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch2);
            //converting in string

            boolean result = Arrays.equals(ch,ch2);
            if(result){
                System.out.println("anagram");
            }
            else{
                System.out.println("not a anagram");
            }
        }
    }
}
 