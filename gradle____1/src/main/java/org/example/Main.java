package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String name = "Artem";
        String lastName = "Ostapchuk";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}

class Person {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}