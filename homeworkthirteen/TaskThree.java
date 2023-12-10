package com.proftelran.org.homeworkthirteen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskThree {

    public static void main(String[] args) {
//        Дан список автомобилей, 10 штук, класс Auto имеет поля - номер авто, цвет,
//        марка, пробег и цена (цена в диапазоне от 10 до 50 тысяч)
//        Вывести список всех автомобилей ,которые имеют черный цвет и нулевой пробег.
//        Вывести количество уникальных марок в ценовом диапазоне от 30 до 50 тысяч.
//        Задачу решить с использованием Stream API.

        List<Auto> autoList = Arrays.asList(
                new Auto("PR NB 58", "Black", "VW", 50000, 32000),
                new Auto("PR VL 32", "Green", "Audi", 40000, 12000),
                new Auto("PR GD 17", "Black", "BMW", 0, 42000),
                new Auto("PR NB 34", "Red", "VW", 95000, 38000),
                new Auto("PR GF 37", "White", "BMW", 65000, 32000),
                new Auto("PR LK 18", "Blue", "Volvo", 80000, 18000),
                new Auto("PR VB 71", "Black", "Mercedes", 0, 50000),
                new Auto("PR LJ 93", "White", "Fiat", 50000, 32000),
                new Auto("PR DF 68", "Black", "BMW", 44000, 36000),
                new Auto("PR MN 57", "Red", "Fiat", 0, 28000)
        );
        List<Auto> blackAndZeroAuto = autoList.stream()
                .filter(auto -> "Black".equalsIgnoreCase(auto.getColor()) && auto.getMileage() == 0)
                .collect(Collectors.toList());
        System.out.println("Чёрный цвет и нулевой пробег имеют: ");
                blackAndZeroAuto.stream().forEach(auto -> System.out.println(auto.model));

        Set<String> uniqueModels = autoList.stream()
                .filter(auto -> auto.getPrice()>=30000 && auto.getPrice()<=50000)
                .map(Auto::getModel)
                .collect(Collectors.toSet());
        System.out.println("Количество уникальных марок в ценовом диапазоне от 30000 до 50000: " + uniqueModels.size());
    }
}
