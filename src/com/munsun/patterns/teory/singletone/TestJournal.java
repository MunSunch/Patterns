package com.munsun.patterns.teory.singletone;

// Если необходим один экземпляр объекта в коде
public class TestJournal {
    public static void main(String[] args) {
        Journal j1 = Journal.getInstance();
        Journal j2 = Journal.getInstance();

        System.out.println(j1 == j2);
    }
}
