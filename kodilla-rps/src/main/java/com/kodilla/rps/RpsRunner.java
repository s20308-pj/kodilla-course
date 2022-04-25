package com.kodilla.rps;

import com.kodilla.rps.controller.Logic;
import com.kodilla.rps.controller.Input;
import com.kodilla.rps.model.Game;

public class RpsRunner {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        String userInput;

        Game game = logic.start();
        System.out.println("wybierz:\n1 - papier\n2 - kamień\n3 - nożyce\nn - nowa gra\nx - wyjscie");
        do {
            userInput = input.getStringFromUser();
            String userChose;
            switch (userInput) {
                case "1": {
                    game = logic.round(game, 1);
                    break;
                }
                case "2": {
                    game = logic.round(game, 2);
                    break;
                }
                case "3": {
                    game = logic.round(game, 3);
                    break;
                }
                case "n": {
                    game = logic.start();
                    break;
                }
                case "x": {
                    game.setEnd(true);
                    break;
                }
                default: {
                    System.out.println("zły wybór, 1,2,3,n lub x");
                }
            }
        } while (!game.isEnd());

    }

}
