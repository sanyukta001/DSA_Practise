public class equilibrium {

    static int findEquiPos(int[] arr, int n){
        int sum = 0;
        int currSum = 0;
        for(int i = 0 ; i<n;i++)
            sum+=arr[i];
        for(int i = 0; i <n;i++){
            if(currSum == (sum-currSum-arr[i]))
                return i+1;
            currSum+=arr[i];
            if(currSum > sum-currSum)
                break;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7,2,4,9,-8,1,6};
        int n = arr.length;
        int res = findEquiPos(arr,n);
        if(res == -1)
            System.out.println("not found");
        else
            System.out.println("Equilibrium position is "+ res);
    }
}
