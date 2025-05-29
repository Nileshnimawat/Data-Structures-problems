import java.util.*;
public class basics {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("nilesh", 1);
        map.put("hitesh", 2);
        map.put("shreya", 3);
        map.put("yana", 4);

        System.out.println(map.values());
        System.out.println(map.keySet());

        //get element
        System.out.println(map.get("nilesh"));

        //containsKey
        System.out.println(map.containsKey("yana"));
        map.re

        for (String str : map.keySet()) {
            System.out.println(str + " "+ map.get(str));
        }

        //entrySet
        for (Map.Entry <String , Integer> str : map.entrySet()) {  // var e 
            System.out.println(str.getValue()+ " "+ str.getKey());
        }
    }
}
