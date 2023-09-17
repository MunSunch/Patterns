package com.munsun.patterns.dz.builder;

import java.util.Optional;

public class Person {
    private String name;
    private String surname;
    private Optional<Integer> age;
    private Optional<String> city;

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city.get())
                .setAge(0);
    }

    public Person(String name, String surname, Optional<Integer> age, Optional<String> city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age.isPresent();
    }

    public void happyBirthday() {
        if(hasAge())
            this.age = Optional.of(age.get() + 1);
    }

    public boolean hasAddress() {
        return city.isPresent();
    }

    public void setCity(String city) {
        this.city = Optional.of(city);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public Optional<String> getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
