class net{
    net(){
        System.out.println("constructor is called");
    }
}
public class baseclass {
    public static void main(String[] args) {
        net n = new net();
    }
}
