package com.proftelran.org.homeworkfourteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkFourteen {

    public static void main(String[] args) {
//        Дан список  List list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//        Выполнить сортировку в прямом и  обратном алфавитном порядке и удалить дубликаты.
//        В качестве результата должно быть два списка прямой и обратный.(два стрима)

        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        list.stream().sorted().distinct().forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().distinct().sorted((s1, s2) -> s2.compareTo(s1)).forEach(x -> System.out.print(x + " "));
        System.out.println();

//        Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")

        List<String> stringList = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println("Min element: " + stringList.stream().min((a1, a2) -> a1.compareTo(a2)).get());
    }
}
