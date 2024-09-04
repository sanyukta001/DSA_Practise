public class largest {
    static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,7,9,45,6,7};
        int answer = findLargest(arr);
        System.out.println("The smallest is "+answer);
    }
}
