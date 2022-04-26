package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println(challenge.probablyIWillThrowException(1.9, 1.5));
        } catch (Exception e) {
            System.out.println("number is wrong");
        } finally {
            System.out.println("end method");
        }
    }
}
