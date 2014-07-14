package com.ba.streams;

import java.util.Random;

public class Stream {

    public static void main(final String[] args) {
        java.util.stream.Stream.generate(() -> new Random().nextInt(100))
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
