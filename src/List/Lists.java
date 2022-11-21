package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.DoubleStream;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(666);
        insertFirst(myNumbers, 4);
        System.out.println(myNumbers);
        insertLast(myNumbers, 6);
        System.out.println(myNumbers);
        replace(myNumbers, 40);
        System.out.println(myNumbers);
        removeThird(myNumbers);
        System.out.println(myNumbers);
        removeEvil(myNumbers);
        System.out.println(myNumbers);
        System.out.println(generateSquare());
        System.out.println(contain(myNumbers, 909090));
//        System.out.println(isTargetNull(myNumbers));
        ArrayList<Integer> target = new ArrayList<Integer>();
        copy(myNumbers, target);
        System.out.println(myNumbers);
        System.out.println(target);
        reverse(myNumbers); //have void
        System.out.println(myNumbers);
        reverseManual(myNumbers);
        System.out.println(myNumbers);
        reverseManual(myNumbers);
        LinkedList<Integer> list = new LinkedList<Integer>();
        insertBegginingEnd(list, 7);


    }

    //add first
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    //add last
    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    //replace the third value
    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
//        list.set(2, value);
    }

    //remove third
    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    //remove '666'
    public static void removeEvil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
    }

    //generate 10 first square number
    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> listSquare = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            listSquare.add(i * i);
        }
        return listSquare;
    }

    //is contain a value
    public static boolean contain(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    //    public static boolean isTargetNull (ArrayList<Integer> target ) {
//        for ( int i = 0 ; i < target.size(); i++) {
//            if (target.size() != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    //copy list to another list
    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
//        if (isTargetNull(target)) {
////            for (int i = 0 ; i < source.size(); i++) {
//                target.add(source.get(i));
//            }
//        } else {
//            System.out.println("target is not null");
//        }
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }

    }

    ///use library to reverse
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    //reverse without using library
    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> reList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reList.add(list.get(i));
        }
        System.out.println(reList);
    }

    //using linklist to add first and add end
    public static void insertBegginingEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
        System.out.println(list);
    }
}



