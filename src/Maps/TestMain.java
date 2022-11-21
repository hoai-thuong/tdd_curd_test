package Maps;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        hmap.put(10, 20);
        hmap.put(20, 30);
        hmap.put(45, 100);
        hmap.put(4, 40);
        hmap.put(5, 50);
        System.out.println(Maps.count(hmap));
        Maps.empty(hmap);
        System.out.println(hmap);

        hmap.put(10, 20);
        hmap.put(20, 30);
        hmap.put(45, 100);
        hmap.put(4, 40);
        hmap.put(5, 50);


        System.out.println(Maps.contains(hmap, 10));
        System.out.println(Maps.containsKeyValue(hmap, 10, 20));
        System.out.println(Maps.containsKeyValue(hmap, 1, 40));
        System.out.println(Maps.keySet(hmap));
        System.out.println(Maps.values(hmap));
        System.out.println(Maps.getColor(2));
    }
}