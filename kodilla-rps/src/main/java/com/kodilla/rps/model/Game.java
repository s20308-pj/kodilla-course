package com.kodilla.rps.model;

public class Game {
    private final Player player;
    private final int amountOfWinning;
    private boolean end;
    private int numberOfRound;
    private int amountOfGamesWonByPlayer;
    private int amountOfGamesWonByComputer;

    public Game(Player player, int amountOfWinning) {
        this.player = player;
        this.amountOfWinning = amountOfWinning;
        this.end = false;
        this.numberOfRound =0;
    }

    public Player getPlayer() {
        return player;
    }

    public int getAmountOfWinning() {
        return amountOfWinning;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public int getNumberOfRound() {
        return numberOfRound;
    }

    public void setNumberOfRound(int numberOfRound) {
        this.numberOfRound = numberOfRound;
    }

    public int getAmountOfGamesWonByPlayer() {
        return amountOfGamesWonByPlayer;
    }

    public void setAmountOfGamesWonByPlayer(int amountOfGamesWonByPlayer) {
        this.amountOfGamesWonByPlayer = amountOfGamesWonByPlayer;
    }

    public int getAmountOfGamesWonByComputer() {
        return amountOfGamesWonByComputer;
    }

    public void setAmountOfGamesWonByComputer(int amountOfGamesWonByComputer) {
        this.amountOfGamesWonByComputer = amountOfGamesWonByComputer;
    }
}
