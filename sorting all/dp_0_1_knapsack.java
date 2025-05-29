import java.util.Scanner;

public class dp_0_1_knapsack {

    public static int knapSack(int wt[], int val[], int i, int W) {
        if (i < 0 || W == 0) return 0;

        int notTake = knapSack(wt, val, i - 1, W);

        int take = Integer.MIN_VALUE;
        if (wt[i] <= W) {
            take = val[i] + knapSack(wt, val, i - 1, W - wt[i]);
        }

        return Math.max(notTake, take);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        int wt[] = new int[n];
        int val[] = new int[n];
        
        System.out.println("Enter the weights of the items: ");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        
        System.out.println("Enter the values of the items: ");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        
        System.out.print("Enter the maximum weight capacity of the knapsack: ");
        int W = sc.nextInt();
        
        System.out.println("Maximum value in the knapsack: " + knapSack(wt, val, n - 1, W));
    }
}
