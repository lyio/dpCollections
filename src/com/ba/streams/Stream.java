package com.ba.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream {

    public static void main(final String[] args) {
        final List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);

        ints.forEach(System.out::println);
    }
}
