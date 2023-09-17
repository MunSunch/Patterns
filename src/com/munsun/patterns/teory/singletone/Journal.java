package com.munsun.patterns.teory.singletone;

// Непотокобезопасная реализация
public class Journal {
    private static Journal instance = null; // Ленивая загрузка
//    private static Journal instance = new Jpurnal(); // Ранняя загрузка

    private Journal(){}

    public static Journal getInstance() {
        if(instance == null) {
            instance = new Journal();
        }
        return instance;
    }
}
