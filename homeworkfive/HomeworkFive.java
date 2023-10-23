package com.proftelran.org.homeworkfive;

import java.util.ArrayList;
import java.util.List;

public class HomeworkFive {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(6);
        integerList.add(10);
        integerList.add(14);
        integerList.add(21);
        integerList.add(30);

        doubleList(integerList);
        List<Integer> newIntegerList = doubleList(integerList);
        System.out.println(newIntegerList);


        List<String> stringList = new ArrayList<>();
        stringList.add("Dynamo");
        stringList.add("Barcelona");
        stringList.add("Real");
        stringList.add("Inter");

        List<Integer> lenghtList = lenghtWord(stringList);
        System.out.println(lenghtList);


        List<Integer> newIntList = new ArrayList<>();
        newIntList.add(1);
        newIntList.add(4);
        newIntList.add(6);
        newIntList.add(11);
        newIntList.add(23);
        newIntList.add(46);
        newIntList.add(87);

        returnOddInt(newIntList);
        List<Integer> oddInt = returnOddInt(newIntList);
        System.out.println(oddInt);

        List<String> withDuplicatesStringList = new ArrayList<>();
        withDuplicatesStringList.add("Berlin");
        withDuplicatesStringList.add("Madrid");
        withDuplicatesStringList.add("Paris");
        withDuplicatesStringList.add("Berlin");
        withDuplicatesStringList.add("London");
        withDuplicatesStringList.add("Amsterdam");
        withDuplicatesStringList.add("London");

        removeDuplicates(withDuplicatesStringList);
        List<String> withoutDuplicatesStringList = removeDuplicates(withDuplicatesStringList);
        System.out.println(withoutDuplicatesStringList);
    }

    private static List<String> removeDuplicates(List<String> withDuplicatesStringList) {
        for (int i = 0; i < withDuplicatesStringList.size(); i++) {
            for (int town = 0; town < withDuplicatesStringList.size(); town++) {
                if (town == i) {
                    continue;
                }
                if (withDuplicatesStringList.get(i).equalsIgnoreCase(withDuplicatesStringList.get(town))) {
                    withDuplicatesStringList.remove(town);
                }
            }
        }
        return withDuplicatesStringList;
    }

    private static List<Integer> returnOddInt(List<Integer> newIntList) {
        List<Integer> oddInt = new ArrayList<>();
        for (int x : newIntList
        ) {
            if (x % 2 != 0) {
                oddInt.add(x);
            }
        }
        return oddInt;
    }

    private static List<Integer> lenghtWord(List<String> stringList) {
        List<Integer> lenghtList = new ArrayList<>();
        for (String string : stringList) {
            lenghtList.add(string.length());
        }
        return lenghtList;
    }

    private static List<Integer> doubleList(List<Integer> integerList) {
        List<Integer> newIntegerList = new ArrayList<>();
        for (int el : integerList) {
            newIntegerList.add(el * 2);
        }
        return newIntegerList;
    }
}


