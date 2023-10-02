package com.telran.org.homeworkone;

public class HomeworkOne {
    public static void main(String[] args) {
        Person personone = new Person();
        personone.setName("Andrey");
        personone.setFullName("Andrey Shevchenko");
        personone.setAge(45);
        personone.move();

        Person persontwo = new Person("Sergey", "Sergey Rebrov", 47 );
        persontwo.talk();


        Phone phoneone = new Phone(12345678, "iPhone 15", 250);
        Phone phonetwo = new Phone(456123789, "Samsung A72", 380);
        Phone phonethree = new Phone(789123456, "Meizu U20", 300);

        System.out.println("Номер телефона: " + phoneone.getNumber());
        System.out.println("Модель телефона: " + phoneone.getModel());
        System.out.println("Вес телефона: " + phoneone.getWeight() + " грамм");
        phoneone.receiveCall(personone.getName());

        System.out.println("Номер телефона: " + phonetwo.getNumber());
        System.out.println("Модель телефона: " + phonetwo.getModel());
        System.out.println("Вес телефона: " + phonetwo.getWeight() + " грамм");
        phoneone.receiveCall(persontwo.getName());

        System.out.println("Номер телефона: " + phonethree.getNumber());
        System.out.println("Модель телефона: " + phonethree.getModel());
        System.out.println("Вес телефона: " + phonethree.getWeight() + " грамм");
        phoneone.receiveCall(personone.getName());


    }
}
