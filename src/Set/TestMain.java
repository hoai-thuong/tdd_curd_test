package Set;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(List.of(4,5,6,7,9,9));
        Set<Integer> second = new HashSet<>(List.of(10,1,2,4,5));
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.unionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.union(first, second));
        List<Integer> list = Sets.toList(first);
        System.out.println(list);
        System.out.println(Sets.removeDuplicate(list));
        System.out.println(Sets.removeDuplicateManual(list));
        String k = "sdjskdjskjdsij";
        System.out.println(Sets.firstRecurringCharacter(k));
        System.out.println(Sets.allRecurringChars(k));
        System.out.println(Sets.toArray(second));
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println(treeSet);
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet, 1));

    }
}