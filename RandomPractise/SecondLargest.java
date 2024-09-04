public class SecondLargest {
    static int process1(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
        }
        return secmax;
    }
    static void merge(int[] arr, int l , int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i<n1; i++){
            L[i] = arr[l+i];
        }
        for(int i = 0; i<n2; i++){
            R[i] = arr[i+m+1];
        }
        int i = 0, j = 0,k=l;
        while(i < n1 && j < n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = R[j];
            k++;
            j++;
        }
        
    }
    static void sort(int[] arr,int l, int r){
        if(l < r){
            int mid = (l+r)/2;
            sort(arr, l, mid);
            sort(arr,mid+1,r);
            merge(arr, l, mid, r);
        }
    }
    static int process2(int[] arr, int n){
        if(n<2) return Integer.MIN_VALUE;
        sort(arr,0,n-1);
        return arr[n-2];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,8,19};
        int n = arr.length;
        // int res1 = process1(arr,n);
        // if(res1 == Integer.MIN_VALUE) System.out.println("no such element present");
        // else System.out.println("Second Largest Element is " + res1);
        int res2 = process2(arr,n);
        if(res2 == Integer.MIN_VALUE) System.out.println("no such element present");
        else System.out.println("Second Largest Element is " + res2);
    }
}
