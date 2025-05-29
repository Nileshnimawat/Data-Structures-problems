import java.util.*;
public class switchcase {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int n = args.length;
 float a = 0, max = 0, min = 0, s = 0;
 System.out.println("1- Sum");
System.out.println("2- Average");
        System.out.println("3- Maximum");
        System.out.println("4- Minimum");
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        switch (ch) {
 case 1:
 for (int i = 0; i < n; i++) {
 a += Float.parseFloat(args[i]);
                }
                System.out.println("Sum is " + a);
                break;

            case 2:
                for (int i = 0; i < n; i++) {
                    a += Float.parseFloat(args[i]);
                }
                s = a / n;
                System.out.println("Average is " + s);
                break;

            case 3:
                max=Integer.parseInt(args[0]);
                for (int i = 1; i < n; i++) {
                    int x = Integer.parseInt(args[i]);
                    if (x > max) {
                        max = x;
                    }
                }
                System.out.println("Maximum is " + max);
                break;

            case 4:
                min=Integer.parseInt(args[0]);
                for (int i = 1; i < n; i++) {
                    int x = Integer.parseInt(args[i]);
                    if (x < min) {
                        min = x;
                    }
                }
                System.out.println("Minimum is " + min);
                break;
        }
    }
}
