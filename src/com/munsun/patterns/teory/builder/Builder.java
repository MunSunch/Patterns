package com.munsun.patterns.teory.builder;

// Когда нужен гигантский конструктор, причем инициализировать нужно только некоторые поля
public class Builder {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Munir")
                .surname("Sunchalyaev")
                .age(25)
                .build();
        System.out.println(person);
    }
}
