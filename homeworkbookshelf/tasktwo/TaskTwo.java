package com.proftelran.org.homeworkbookshelf.tasktwo;

import java.util.Arrays;
import java.util.Comparator;

public class TaskTwo {
    //    Дан массив пар, состоящий из двух строк с именами и фамилиями,
//    отсортировать массив в возрастающем лексикографическом порядке имени, и если две строки одинаковы, отсортируйте их по фамилии.
//            (Можно заполнить массив своими данными)
//    Input:  { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} }
//    Output:  { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng", "note"} }

    public static void main(String[] args) {
        String[][] inputArray = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};
        System.out.println("До сортировки:");
        for (String[] o : inputArray){
            System.out.println(Arrays.toString(o));
        }
        System.out.println("После сортировки:");
        Arrays.sort(inputArray, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int nameComparison = o1[0].compareTo(o2[0]);
                if (nameComparison == 0) {
                    return o1[1].compareTo(o2[1]);
                }
                return nameComparison;
            }
        });
        for (String[] o:inputArray
             ) {
            System.out.println(Arrays.toString(o));
        }
    }
}
