package com.proftelran.org.homeworkthirteen;

import java.util.List;

public class Client {
    double ID;
    String name;
    int age;
    List<Phone> phones;

    public double getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Client(double ID, String name, int age, List<Phone> phones) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.phones = phones;

    }
}

