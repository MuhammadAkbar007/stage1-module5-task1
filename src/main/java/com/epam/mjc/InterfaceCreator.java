package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list -> {
            for (String s : list) {
                if (s == null || s.isEmpty() || !Character.isUpperCase(s.charAt(0))) {
                    return false;
                }
            }
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return list -> {
            List<Integer> evens = new ArrayList<>();
            list.forEach(value -> {
                if (value % 2 == 0) evens.add(value);
            });
            list.addAll(evens);
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> values.stream()
                .filter(s -> s.matches("^[A-Z].*")) // starts with an uppercase
                .filter(s -> s.endsWith(".")) // ends with a period
                .filter(s -> s.split("\\s+").length > 3) // contains more than 3 words
                .collect(Collectors.toList());
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> {
            Map<String, Integer> resultMap = new HashMap<>();

            list.forEach(value -> resultMap.put(value, value.length()));

            System.out.println(resultMap);
            return resultMap;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> result = new ArrayList<>();

            result.addAll(list1);
            result.addAll(list2);

            System.out.println(result);
            return result;
        };
    }
}