package com.ba.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(final String[] args) {
        final List<Integer> demoValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //limit the input -> [1, 2, 3, 4]
        System.out.println(demoValues
                .stream()
                .limit(4)
                .collect(Collectors.toList()));

        //limit the result -> [5, 6, 7, 8]
        System.out.println(demoValues
                .stream()
                .filter((v) -> v > 4)
                .limit(4)
                .collect(Collectors.toList()));
    }
}
