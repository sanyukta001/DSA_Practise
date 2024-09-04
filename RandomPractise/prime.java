public class prime {
    public static int getPrime(int a){
        for(int i = 2; i <= a/2; i++){
            if(a % i == 0) return 0;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            sum+=getPrime(i);
        }
        System.out.println("The total sum is "+sum);
    }
}
