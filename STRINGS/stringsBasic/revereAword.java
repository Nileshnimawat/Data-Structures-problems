public class revereAword {
    //writei  a program to reverse each word in string
    //input : i am an educator
    public static void reverseWORD(String str){
        String ans ="";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
              //  ans=sb+ans;
                sb.reverse();
                 ans+=sb;
                 ans+=" ";
            
                sb.delete(0, str.length()-1 );

            }
            
           
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str = "i am an educator";
        reverseWORD(str);
    }
}
