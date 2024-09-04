public class mergeSortedArrays {
    static void printArray(int[] arr){
        System.out.println("The array is: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    static void merge(int[] arr1,int[] arr2,int n1, int n2,int[] res){
        int i = 0, j = 0,k = 0;
        while (i<n1&&j<n2) {
            if(arr1[i] <= arr2[j]){
                res[k] = arr1[i];
                i++;
            }
            else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j<n2) {
            res[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,9};
        int[] arr2 = {1,2,4,5,7};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] res = new int[n1+n2];
        merge(arr1, arr2, n1, n2, res);
        printArray(res);
    }
}