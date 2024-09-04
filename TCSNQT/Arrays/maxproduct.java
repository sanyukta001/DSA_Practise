public class maxproduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,-1,-2,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i = 0; i < n; i++){
            prod *= arr[i];
            max = Math.max(max,prod);
        }
    }
}
