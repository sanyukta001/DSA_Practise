import java.util.Arrays;
public class medianarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Arrays.sort(arr);
        int n = arr.length;
        int med = 0;
        if(n % 2 != 0) med = arr[(n/2)];
        else med = (arr[(n/2)-1]+arr[n/2])/2;
        System.out.println("Median is "+med);
    }
}
