//longest common sequence

public class subset {

    static int findCommon(int[] arr1, int n1, int[] arr2, int n2){
        if(n1 == 0 || n2 == 0) return 0;
        else if(arr1[n1-1] == arr2[n2-1]) return 1+findCommon(arr1, n1-1, arr2, n2-1);
        else return Math.max(findCommon(arr1, n1-1, arr2, n2),findCommon(arr1, n1, arr2, n2-1));
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int n1 = arr1.length;
        int[] arr2 = {3,4,5};
        int n2 = arr2.length;
        int x = findCommon(arr1,n1,arr2,n2);
        System.out.println("the number of common elements are "+x);
    }
}
