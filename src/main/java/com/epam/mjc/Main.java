package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testIntegers = new ArrayList<>(List.of(48, 13, 100, 5, 222, 3));
        InterfaceCreator creator = new InterfaceCreator();
        creator.addEvenValuesAtTheEnd().accept(testIntegers);
        System.out.println(testIntegers);

        List<String> input = List.of("hello world in Java.", "MJC is a great school.");
        System.out.println(creator.filterCollection(input).get());

        List<String> strForMap = List.of("Hello", "MJC");
        creator.stringSize().apply(strForMap);

        List<Integer> list1 = List.of(2, 4, 5, 10);
        List<Integer> list2 = List.of(3, 1, 10, 5);

        creator.concatList().apply(list1, list2);
    }
}
