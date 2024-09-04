//ascending order only

import java.util.HashSet;

public class specialPattern {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++)
            hs.add(arr[i]);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            for (int j = 0; j < i; j++) {
                if(hs.contains(x-arr[j]) && arr[j]!=x-arr[j]) count++;
            }
        }
        System.out.println("the count is: "+count/2);
    }
}
