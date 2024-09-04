import java.util.HashSet;

public class removeduplicate {
    static int method1(int[] arr, int n, int[] result){
        int prev = arr[0];
        result[0] = arr[0];
        int k = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != prev){
                result[k++] = arr[i];
                prev = arr[i];
            }
        }
        return k;
    }
    static int method2(int[] arr, int n, int[] result) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(set.contains(arr[i])==false) result[k++] = arr[i];
            set.add(arr[i]);
        }
        return k;
    }
    static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,5,6};
        int n = arr.length;
        int[] result = new int[n];
        int k = method2(arr,n,result);
        printArray(result, k);
    }
}
