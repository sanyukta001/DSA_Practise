public class SecondLargestSmallest {
    static int secondLargest(int[] arr){
        return arr[arr.length-2];
    }
    static int secondSmallest(int[] arr){
        return arr[1];
    }
    static void merge(int start, int mid, int end, int[] arr){
        int[] L = new int[mid-start+1];
        int[] R = new int[end - mid];
        for(int i = 0; i < L.length; i++){
            L[i] = arr[start+i];
        } 
        for (int i = 0; i < R.length; i++) {
            R[i] = arr[mid+1+i];
        }
        int i = 0, j = 0, m = L.length, n = R.length;
        int k = start;
        while(i<m && j<n){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
                k++;
            }
            else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        while (i<m) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void sort(int start, int end, int[] arr){
        if(start<end){
            int mid = (start+end)/2;
            sort(start, mid, arr);
            sort(mid+1, end, arr);
            merge(start,mid,end,arr);
        }
    }
    static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3,8,6};
        sort(0, arr.length-1, arr);
        PrintArr(arr);
        int sSmallest = secondSmallest(arr);
        int lLargest = secondLargest(arr);
        System.out.println("\nSecond Smallest "+ sSmallest);
        System.out.println("Second Largest "+lLargest);
    }
}
