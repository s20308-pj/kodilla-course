package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumberGenerator;


import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        String text = "Ala ma kota";
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(text, (t) -> System.out.println(t.toUpperCase()));
        poemBeautifier.beautify(text, (t) -> System.out.println(t.toLowerCase()));
        poemBeautifier.beautify(text, (t) -> System.out.println(t + " ABC"));
        poemBeautifier.beautify(text, (t) -> {
            for (int i = 0; i < t.length(); i++) {
                if (i % 2 != 0) {
                    System.out.print(t.toLowerCase(Locale.ROOT).charAt(i) + " ");
                } else {
                    System.out.print(t.toUpperCase(Locale.ROOT).charAt(i) + " ");
                }
            }
            System.out.println();
        });

        NumberGenerator.generateEven(20);
    }
}

