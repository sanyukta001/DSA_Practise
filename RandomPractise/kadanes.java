public class kadanes {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] arr = {1,2,3,4,5};
        // int[] arr = {-6,-3,-1,-9,-5,-2};
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if(sum < 0) sum = 0;
        }
        System.out.println("The maximum sum of longest subarray is "+max);
    }
}
