package com.proftelran.org.homeworkthirteen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

public class TaskTwo {
//    Есть класс клиент, со следующими полями: уникальный идентификатор, имя, возраст.
//    Дополнительно, у клиента есть поле - список телефонов.
//    Класс телефона содержит само значение и тип (стационарный или мобильный).
//    Вывести в консоль самого взрослого клиента, который использует стационарный телефон.
//    Задачу решить с использованием Stream API.

    public static void main(String[] args) {
        List<Client> clientList = Arrays.asList(
                new Client(0001, "Ivan", 30, Arrays.asList(new Phone("0974528793", PhoneType.MOBILE))),
                new Client(0004, "Igor", 42, Arrays.asList(new Phone("0974528793", PhoneType.STATIONARY))),
                new Client(1078, "Sergey", 24, Arrays.asList(new Phone("0974528793", PhoneType.MOBILE))),
                new Client(1194, "Oleg", 27, Arrays.asList(new Phone("0974528793", PhoneType.STATIONARY))),
                new Client(1245, "Alex", 54, Arrays.asList(new Phone("0974528793", PhoneType.MOBILE))),
                new Client(4358, "Max", 36, Arrays.asList(new Phone("0974528793", PhoneType.STATIONARY))),
                new Client(7583, "Dima", 19, Arrays.asList(new Phone("0974528793", PhoneType.STATIONARY)))
        );

        Optional<Client> oldClient = clientList.stream()
                .filter(client -> client.getPhones()
                        .stream().anyMatch(phone -> phone.getType() == PhoneType.STATIONARY))
                .max((c1, c2) -> Integer.compare(c1.getAge(), c2.getAge()));
        oldClient.stream().forEach(s-> System.out.println("Самый взрослый клиент со стационарным телефоном: " + s.name));
    }
}
