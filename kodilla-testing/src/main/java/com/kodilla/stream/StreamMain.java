package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaysSomething;

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
        });
    }
}

