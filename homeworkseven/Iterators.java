package com.proftelran.org.homeworkseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        //1.

        long startOne = System.currentTimeMillis();
        for (Integer i : list
        ) {
            int temp = i;
            System.out.print(" " + temp);
        }
        System.out.println();
        long endOne = System.currentTimeMillis();
        System.out.println("Время обработки методом for-each loop: " + (endOne - startOne) + " мс");

        //2.
        long startTwo = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            System.out.print(" " + temp);
        }
        System.out.println();
        long endTwo = System.currentTimeMillis();
        System.out.println("Время обработки методом for и вызовом list.size(): " + (endTwo - startTwo) + " мс");

        //3.
        int size = list.size();
        long startThree = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            int temp = list.get(i);
            System.out.print(" " + temp);
        }
        System.out.println();
        long endThree = System.currentTimeMillis();
        System.out.println("Время обработки методом for с list.size(), как переменной: " + (endThree - startThree) + " мс");

        //4.
        int sizeTwo = list.size();
        long startFour =System.currentTimeMillis();
        for(int i = sizeTwo - 1; i >= 0; i--){
            int temp = list.get(i);
            System.out.print(" " + temp);
        }
        System.out.println();
        long endFour = System.currentTimeMillis();
        System.out.println("Время обработки методом for с list.size(), как переменной и перебором с конца: " + (endFour - startFour) + " мс");

        //5.
        long startFive = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int temp = iterator.next();
            System.out.print(" " + temp);
        }
        System.out.println();
        long endFive = System.currentTimeMillis();
        System.out.println("Время обработки используя Iterator: " + (endFive - startFive) + " мс");

        long startSix = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            int temp = listIterator.next();
            System.out.print(" " + temp);
        }
        System.out.println();
        long endSix = System.currentTimeMillis();
        System.out.println("Время обработки используя ListIterator: " + (endSix - startSix) + " мс");
    }
}
