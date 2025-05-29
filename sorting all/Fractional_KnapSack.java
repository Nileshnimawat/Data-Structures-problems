import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Fractional_KnapSack {

    public static class Item {
        int weight;
        int value;
        Item(int w, int v) {
            this.value = v;
            this.weight = w;
        }
    }

    public static class itemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / (double) a.weight;
            double r2 = (double) b.value / (double) b.weight;
            return Double.compare(r2, r1); // Descending order
        }
    }

    public static double knapSack(ArrayList<Item> list, int W) {
        Collections.sort(list, new itemComparator());
        int currentWeight = 0;
        double totalValue = 0.0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).weight + currentWeight <= W) {
                currentWeight += list.get(i).weight;
                totalValue += list.get(i).value;
            } else {
                int rem = W - currentWeight;
                double fractionValue = ((double) list.get(i).value / (double) list.get(i).weight) * rem;
                totalValue += fractionValue;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the weight and value: ");
            int w = sc.nextInt();
            int v = sc.nextInt();
            list.add(new Item(w, v));
        }

        System.out.print("Enter the maximum weight capacity of the knapsack: ");
        int W = sc.nextInt();

        double maxValue = knapSack(list, W);
        System.out.println("\nMaximum value in the knapsack: " + maxValue);
    }
}
