
import java.util.*;
public class StringCost {
    static int findCost(String s1, String s2){
        Map<Character,Integer> maps1 = new HashMap<>();
        Map<Character,Integer> maps2 = new HashMap<>();
        int cost = 0;
        for(int i = 0; i <s1.length(); i++){
            if(maps1.containsKey(s1.charAt(i))) maps1.put(s1.charAt(i),maps1.get(s1.charAt(i))+1);
            else maps1.put(s1.charAt(i),1);
        }
        for(int i = 0; i <s2.length(); i++){
            if(maps2.containsKey(s2.charAt(i))) maps2.put(s2.charAt(i),maps2.get(s2.charAt(i))+1);
            else maps2.put(s2.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> it : maps2.entrySet()){
            char a = it.getKey();
            int b = it.getValue();
            if(maps1.containsKey(a)){
                if(maps1.get(a) < b) cost += b-maps1.get(a); 
            }
            else cost += b;
        }
        return cost;
    }
    public static void main(String[] args) {
        String s1 = "ABD";
        String s2 = "AABCCAD";
        int res = findCost(s1,s2);
        System.out.println("The cost is : "+ res);
    }
}
