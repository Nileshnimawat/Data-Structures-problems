import java.util.*;

public class lcs {

    public static int longestCommonSubsequence(String text1, String text2, int i, int j, int dp[][]) {
        if (i == 0 || j == 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            dp[i][j] = 1 + longestCommonSubsequence(text1, text2, i - 1, j - 1, dp);
        } else {
            int exclude1 = longestCommonSubsequence(text1, text2, i - 1, j, dp);
            int exclude2 = longestCommonSubsequence(text1, text2, i, j - 1, dp);
            dp[i][j] = Math.max(exclude1, exclude2);
        }
        return dp[i][j];
    }

    public static String printSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int exclude1 = dp[i - 1][j];
                    int exclude2 = dp[i][j - 1];
                    dp[i][j] = Math.max(exclude1, exclude2);
                }
            }
        }

        int i = n;
        int j = m;
        StringBuilder sb = new StringBuilder("");

        while(i > 0 && j > 0){
            if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                sb.append(text1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String 1 : ");
        String s1 = sc.nextLine();
        System.out.println("enter the String 2 :");
        String s2 = sc.nextLine();
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        int i = s1.length();
        int j = s2.length();
        int lcs = longestCommonSubsequence(s1, s2, i, j, dp);
        System.out.println("the longest common subsquence of string s1 and s2 is : " + lcs);
        System.out.println("the longest common string is : "+ printSubsequence(s1, s2));
    }
}
