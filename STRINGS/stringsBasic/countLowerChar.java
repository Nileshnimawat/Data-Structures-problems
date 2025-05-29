import java.util.*;
public class countLowerChar {
    //count how ,,any lower vowels occured in a string entered by the user .
    public static void lowerCount(String str){
       // StringBuilder sb = new StringBuilder("");
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            //System.out.print(str+" ");
            if(ascii<97){
                count++;
               // System.out.print(str+" ");
            }
        }
        System.out.println(str+" ");
       
        System.out.println("the number of lower occurence = "+ count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        sc.close();
        lowerCount(str);
    }
}
