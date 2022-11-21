package Set;

import java.util.*;
import java.util.jar.JarEntry;
import java.util.stream.Collectors;


public class Sets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(3);
        first.add(4);
        first.add(1);
        Set<Integer> second = new HashSet<>();
        second.add(4);
        second.add(5);
        second.add(2);
        second.add(2);
        System.out.println(intersectionManual(first, second));
        System.out.println(unionManual(first, second));
        System.out.println(union(first, second));
        System.out.println(intersection(first, second));
        List<Integer> source = new ArrayList<>();
        source.add(4);
        source.add(5);
        source.add(2);
        source.add(2);
        System.out.println(source);
//        System.out.println(removeDuplicate(source));
//        System.out.println(removeDuplicateManual(source));
        System.out.println(first);
        System.out.println(toList(first));
        System.out.println(firstRecurringCharacter("mfjkadakj"));
        System.out.println(allRecurringChars("mfjkadakj"));
        System.out.println(Arrays.toString(toArray(first)));
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println(treeSet);
        System.out.println(getFirst(treeSet));
        System.out.println(getLast(treeSet));
        System.out.println(getGreater(treeSet, 3));



    }
///try search get element by index first[i]

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> interList = new HashSet<>();
        if (first.size() < second.size()) {
            for (int element : second) {
                if (first.contains(element)) {
                    interList.add(element);
                }
            }
        } else {
            for (int element : first) {
                if (second.contains(element)) {
                    interList.add(element);
                }
            }
        }
        return interList;
    }

    //union not using library
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> interList = new HashSet<>();
        for (int element : first) {
            interList.add(element);
        }
        for (int element : second) {
            if (!first.contains(element)) {
                interList.add(element);
            }
        }
        return interList;

    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> interList = new HashSet<>(first);
        interList.retainAll(second);
        return interList;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> uniList = new HashSet<>();
        uniList.addAll(first);
        uniList.addAll(second);
        return uniList;
    }
    //set to list
    public static List<Integer> toList (Set<Integer> source) {
        List<Integer> list = new ArrayList<>(source);

        return list;
    }

    //duplicate using library
    public static List<Integer> removeDuplicate(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>();
        // Add the elements to set
        set.addAll(source);
        // Clear the list
        source.clear();
        // add the elements of set
        // with no duplicates to the list
        source.addAll(set);
        return source;

    }

    //duplicate without using library
    public static List<Integer> removeDuplicateManual(List<Integer> source) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        // Traverse through the first list
        for (Integer element : source) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        if ( s == null || s.length() == 0 ) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0 ; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i) + "";  //convert char to string
            }
            set.add(s.charAt(i));
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s ) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for(int i = 0; i < s.length();i ++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                result.add(c);
            } else {
                set.add(c);
            }
        }
        return result;
    }
//set into array
    public static Integer[] toArray(Set<Integer> source) {
        return (source.toArray(new Integer[0]));
    }
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}
