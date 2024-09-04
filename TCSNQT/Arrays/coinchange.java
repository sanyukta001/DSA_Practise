import java.util.Arrays;

public class coinchange {
    static int count(int[] coins, int n, int sum, int[][]dp){
        if(sum == 0) return dp[n][sum] = 1;
        if(n <= 0 || sum < 0) return 0;
        if(dp[n][sum] != -1) return dp[n][sum];
        else return dp[n][sum] = count(coins, n, sum-coins[n-1], dp) + count(coins, n-1, sum, dp);
    }
    public static void main(String[] args) {
        int[] coins = {3};
        int n = coins.length;
        int sum = 5;
        int[][] dp = new int [n+1][sum+1];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i],-1);
        int res = count(coins,n,sum,dp);
        System.out.println("The number of ways are "+res);
    }
}
