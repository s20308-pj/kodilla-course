package com.kodilla.rps.controller;

import com.kodilla.rps.model.Game;
import com.kodilla.rps.model.Player;

import java.util.Random;

public class Logic {

    Input input = new Input();
    Random random = new Random();
    String[] value = {"PAPER", "ROCK", "SCISSOR"};

    public Game start() {
        System.out.println("Witaj\ngrasz w papier-kalmiń-nożyce\npodaj jak sie nazywasz:\n");
        String username = input.getStringFromUser();
        System.out.println("do ilu wygranych chesz grać?");
        int amountOfWinning = input.getIntFromUser();
        return new Game(new Player(username), amountOfWinning);
    }

    public Game round(Game game, int userChose) {
        game.setNumberOfRound(game.getNumberOfRound() + 1);
        int computerChose = random.nextInt(3) + 1;
        System.out.println("twój wybór: " + printValue(userChose) + "\n" + "Wybór komputera: " + printValue(computerChose));
        winCheck(game, userChose, computerChose);
        result(game);
        endCheck(game);
        return game;
    }

    private void winCheck(Game game, int userChose, int computerChose) {
        if (computerChose == userChose) {
            System.out.println("REMIS!!!");
        }
        if (userChose + 1 == computerChose || userChose - 2 == computerChose) {
            game.setAmountOfGamesWonByPlayer(game.getAmountOfGamesWonByPlayer() + 1);
            System.out.println("Wygrywasz");
        } else if (userChose - 1 == computerChose || userChose + 2 == computerChose) {
            game.setAmountOfGamesWonByComputer(game.getAmountOfGamesWonByComputer() + 1);
            System.out.println("Przegrywasz");
        }
    }

    private void endCheck(Game game) {
        if (game.getAmountOfGamesWonByComputer() >= game.getAmountOfWinning()) {
            System.out.println("Niestety "+game.getPlayer().getUsername()+" przegrywasz grę");
            game.setEnd(true);
        }
        if (game.getAmountOfGamesWonByPlayer() >= game.getAmountOfWinning()) {
            System.out.println("Brawo " + game.getPlayer().getUsername() + " wygrywasz grę");
            game.setEnd(true);
        }
    }

    private String printValue(int chose) {
        return value[chose - 1];
    }

    public void result(Game game) {
        System.out.println("runda : " + game.getNumberOfRound());
        System.out.println("ilość wygranych gracza: " + game.getAmountOfGamesWonByPlayer());
        System.out.println("ilość wygranych komputera: " + game.getAmountOfGamesWonByComputer());
    }
}
