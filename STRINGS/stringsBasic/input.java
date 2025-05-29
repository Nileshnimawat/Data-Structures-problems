import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "nilesh";
        System.out.println(name.charAt(0)); //charAt method
        // string concatenation
        String firstname= "nilesh";
        String lastname = "nimawat";
        String fullname = firstname + " " + lastname;//string concatenation
        System.out.println(fullname);
        //input of string 
        System.out.println(fullname.indexOf('l'));//index of function i built
        //
        System.out.println(firstname.compareTo(lastname));//compare to function lexographically
        //
        System.out.println(fullname.contains("leshiya"));// comapre the function whether it is present or not.
        //\
        System.out.println(fullname.toUpperCase()); // upper the whole functiomn and similarly for lower case
        //
        System.out.println(lastname.concat(firstname)); //adds up the two strings
        //
        System.out.println(fullname.substring(0,6)); // for printing the subaaray
        //\
        System.out.println(fullname.substring(1)); //prints from the index which is mentioned
        //
        System.out.println(firstname.equals(fullname)); // == not work for string that s why we use .eqyuals
        //
        System.out.println(lastname.compareToIgnoreCase(firstname)); // same as compare to but this function ignore lower upper ascii
        String name2 = sc.nextLine();
        System.out.println(name2);
        //
        individualLETTER(name2);
        sc.close();

    }
    //creating a fdunction for string individual character or letter
    public static void individualLETTER(String letter){
        for(int i=0;i<letter.length();i++){
            System.out.print(letter.charAt(i)+" ");
        }
    }
}
