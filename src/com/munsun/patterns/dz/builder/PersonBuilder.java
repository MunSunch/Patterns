package com.munsun.patterns.dz.builder;

import java.util.Optional;

public class PersonBuilder {
    private String name;
    private String surname;
    private Optional<Integer> age;
    private Optional<String> city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if(age < 0)
            throw new IllegalArgumentException("age < 0");
        this.age = Optional.of(age);
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.city = Optional.of(address);
        return this;
    }

    public Person build() {
        if(name == null)
            throw new IllegalStateException("name is empty");
        if(surname == null)
            throw new IllegalStateException("surname is empty");
        if(age.isEmpty())
            throw new IllegalStateException("age is empty");
        if(city.isEmpty())
            throw new IllegalStateException("city is empty");
        return new Person(name,surname,age,city);
    }
}
