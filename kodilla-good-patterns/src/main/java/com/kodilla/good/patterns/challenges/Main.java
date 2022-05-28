package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().values().forEach(
                translation -> translation.forEach(title -> System.out.print(title + "! ")));
    }
}
