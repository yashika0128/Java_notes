package HashMap;
import java.util.*;
import java.util.Map;

public class Intro {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",180);
        System.out.println(map);
        map.put("China",180);

        if(map.containsKey("China")) System.out.println("Key is present");
        else System.out.println("Key not present");

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        for(Map.Entry<String ,Integer>e: map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }
}
