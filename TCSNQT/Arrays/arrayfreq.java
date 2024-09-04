import java.util.HashMap;
import java.util.Map;

public class arrayfreq {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,5,3,2};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i], 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
