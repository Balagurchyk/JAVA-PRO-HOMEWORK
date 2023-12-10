package com.proftelran.org.homeworkthirteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOne {

    public static void main(String[] args) {
//        Задан список фамилий сотрудников.
//        Разработать программу, которая отображает все фамилии, начинающиеся на букву «K».
//        Задачу решить с использованием Stream API.

        List<String> surnameList = Arrays.asList("Ivanov", "Smirnov", "Kulik", "Stepanov", "Krotov", "Sidorov", "Kolobkov");
        List<String> result = surnameList.stream()
                .filter(s -> s.startsWith("K"))
                .collect(Collectors.toList());
        System.out.println(result);

//        Задан массив строк. Используя средства Stream API отсортировать строки в лексикографическом порядке.

        String[] surnames = {"Ivanov", "Smirnov", "Kulik", "Stepanov", "Krotov", "Sidorov", "Kolobkov"};
        Stream<String> sortedSurnames = Arrays.stream(surnames).sorted();
        sortedSurnames.forEach(s -> System.out.println(s));
    }
}
