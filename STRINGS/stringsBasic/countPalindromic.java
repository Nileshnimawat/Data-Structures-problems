import java.util.Scanner;
public class countPalindromic {
    //count the number of substrings in a string 
    public static Boolean palindrome(String sb){
      StringBuilder bs = new StringBuilder(sb);
        bs.reverse();
        String pp= bs+"";
        if(sb.equals(pp)){
            return true;
        }
        else return false;
}
    public static void substringPalindrome(String sb){
        int count=0;
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<=sb.length();j++){
               if(palindrome(sb.substring(i, j))==true){
                System.out.print(sb.substring(i,j)+" ");
                count++;

               }
            }
        }
        System.out.println("\n" +count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string z :  ");
        String sb = sc.nextLine();
        substringPalindrome(sb);
       sc.close();
        
    }
    }
   
