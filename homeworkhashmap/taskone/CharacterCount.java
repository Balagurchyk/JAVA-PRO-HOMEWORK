package com.proftelran.org.homeworkhashmap.taskone;

import java.util.HashMap;
import java.util.Map;

//        Подсчет количества вхождений каждого символа из строки.
//        Написать метод на вход которого будет передаваться Map и строка текста,
//        метод должен подсчитать количество вхождений каждого символа в строке.
//        Вывести результат в виде таблицы в консоль.
public class CharacterCount {

    public static void main(String[] args) {
        String s = "Hello, World!";
        Map<Character, Integer> charCountMap = new HashMap<>();

        countCharacters(charCountMap, s);
        displayCharacterCountTable(charCountMap, s);
    }

    public static void countCharacters(Map<Character, Integer> charCountMap, String s) {
        for (char character : s.toCharArray()) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }
    }

    public static void displayCharacterCountTable(Map<Character, Integer> charCountMap, String s) {
        System.out.println("Результат:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Символ " + entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
        }
    }
}
