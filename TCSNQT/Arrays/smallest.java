public class smallest{
    static int findSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest) smallest = arr[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,7,9,45,6,7};
        int answer = findSmallest(arr);
        System.out.println("The smallest is "+answer);
    }
}