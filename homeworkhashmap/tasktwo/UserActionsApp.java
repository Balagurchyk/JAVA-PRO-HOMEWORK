package com.proftelran.org.homeworkhashmap.tasktwo;

import java.util.List;
import java.util.Scanner;

//        Система хранения запросов пользователя :
//        В системе есть несколько пользователей , они обращаются по различным адресам в интернете,
//        написать систему хранения действий пользователя, чтобы можно было по определенному пользователю получать список
//        всех его действий:
//        За хранение должен отвечать класс Storage
//        В качестве хранилища использовать Map>
//        Класс UserRequest должен хранить информацию о запросе пользователя вида :
//        String address,
//        Enum answer (APPROVED, DENIED, ERROR),
//        В качестве исходных данных, которые нужно разобрать при начале работы программы использовать примеры строк:
//        User1; "www.de.de"; APPROVED
//        User2; "www.ebay.de"; DENIED
//        User2; "www.amazon.de"; DENIED
//        User1; "www.ebay.blabla"; ERROR
//        etc.
//        Приложение должно запуститься, заполнить хранилище данных,
//        и предложить посмотреть статистику посещений по выбранному пользователю

public class UserActionsApp {

    public static void main(String[] args) {
        Storage storage = new Storage();

        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        storage.addRequest(user1, "www.de.de", Answer.APPROVED);
        storage.addRequest(user2, "www.ebay.de", Answer.DENIED);
        storage.addRequest(user2, "www.amazon.de", Answer.DENIED);
        storage.addRequest(user1, "www.ebay.blabla", Answer.ERROR);
        storage.addRequest(user3, "www.otto.de", Answer.APPROVED);
        storage.addRequest(user2, "www.netto.de", Answer.APPROVED);
        storage.addRequest(user3, "www.lotto.de", Answer.DENIED);
        storage.addRequest(user2, "www.bolt.blabla", Answer.ERROR);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя для просмотра статистики:");
        String inputUsername = scanner.nextLine();
        User inputUser = new User(inputUsername);

        List<UserRequest> userRequests = storage.getUserRequests(inputUser);
        if (!userRequests.isEmpty()) {
            System.out.println("Статистика посещений пользователя " + inputUsername + ":");
            for (UserRequest userRequest : userRequests) {
                System.out.println("Адрес: " + userRequest.getAddress() + ", Ответ: " + userRequest.getAnswer());
            }
        } else {
            System.out.println("Данных о посещениях пользователя " + inputUsername + " нет.");
        }
    }
}
