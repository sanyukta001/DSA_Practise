import java.util.Map;
import java.util.TreeMap;

public class sortString {
    public static void main(String[] args) {
        String str = "tree";
        TreeMap<Character,Integer> map = new TreeMap<>();
        // Map<key,Value> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        StringBuilder s = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char a = entry.getKey();
            int b = entry.getValue();
            while(b-- > 0) s.append(a);
        }
        String answer = s.toString();
        System.out.println("The answer is "+answer);
    }
}
