import java.util.*;
public class specialfibonacci {
    static int findFibo(int[] dp, int n){
        if(n<=1) return dp[n]=1;
        else if(dp[n] != -1) return dp[n];
        else{
            int a = findFibo(dp, n-1);
            int b = findFibo(dp, n-2);
            return dp[n] = ((a*a)+(b*b));
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        dp[1] = 1;
        int result = findFibo(dp,n);
        System.out.println("The term is "+result);
    }
}
