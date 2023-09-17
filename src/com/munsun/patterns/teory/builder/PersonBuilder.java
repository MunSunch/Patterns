package com.munsun.patterns.teory.builder;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;

    public PersonBuilder name(String str) {
        this.name = str;
        return this;
    }

    public PersonBuilder surname(String str) {
        this.surname = str;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(name,surname,age);
    }
}
