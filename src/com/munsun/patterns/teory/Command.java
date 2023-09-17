package com.munsun.patterns.teory;

import java.util.ArrayList;
import java.util.List;

// Когда нужно обращаться функциями как с объектами
public class Command {
    public static void main(String[] args) {
        String message = "message";
        List<Exec> execList = new ArrayList<>();
        execList.add(System.out::println);
        execList.add(str -> System.out.println(str.length()));
        execList.add(str -> System.out.println(calc(str, 's')));
        execList.add(str -> System.out.println(calc(str, 'e')));
        execList.add(str -> System.out.println(calc(str, 'm')));

        execList.forEach(x -> x.doSomething(message));
    }

    public static int calc(String str, char c) {
        int counter=0;
        for(char cur: str.toCharArray()) {
            if(cur == c)
                counter++;
        }
        return counter;
    }
}

interface Exec{
    void doSomething(String message);
}