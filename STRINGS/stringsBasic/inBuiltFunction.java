public class inBuiltFunction {
    public static void main(String[] args) {
        String firstname= "nilesh";
        String lastname = "nimawat"; 
        String fullname = firstname+" "+lastname;
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
    }
}
