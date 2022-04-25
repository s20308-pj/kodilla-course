package com.kodilla.rps.controller;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String getStringFromUser() {
        return scanner.nextLine().toLowerCase();
    }

    public int getIntFromUser() {
        String temp = scanner.nextLine();
        while (!isNumeric(temp)) {
            System.out.println("Podaj liczbę");
            temp = scanner.nextLine();
        }
        return Integer.parseInt(temp);
    }

    boolean isNumeric(String testedString) {
        return testedString != null && testedString.matches("[0-9.]+");
    }
}

