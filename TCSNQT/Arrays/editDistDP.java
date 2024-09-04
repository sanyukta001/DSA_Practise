import java.util.Arrays;

public class editDistDP {

    static int findCost(String a, String b, int m, int n, int[][]dp){
        if(m==0) return n;
        if(n==0) return m;
        if(dp[m][n] != -1) return dp[m][n];
        if(a.charAt(m-1)==b.charAt(n-1)) dp[m][n] = findCost(a, b, m-1, n-1, dp);
        else{
            int insert = findCost(a, b, m, n-1, dp);
            int remove = findCost(a, b, m-1, n, dp);
            int replace = findCost(a, b, m-1, n-1, dp);
            dp[m][n]=1+ Math.min(Math.min(insert,remove), replace);
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String a = "Sanyukta";
        String b = "Sanjuktaa";
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i],-1);
        int cost = findCost(a,b,m,n,dp);
        System.out.println("The number of moves are "+cost);
    }
}
