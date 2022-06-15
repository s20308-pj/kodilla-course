package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckersTestSuite {

    @Test
    void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 3, 0)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 7, 9)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 2, 0)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figureOne = checkers.getBoard().getFigure(3, 0);    // [9]
        Figure figureTwo = checkers.getBoard().getFigure(7, 9);    // [10]
        Figure figureThree = checkers.getBoard().getFigure(2, 0);  // [11]
        Figure figureFour = checkers.getBoard().getFigure(1, 1);   // [12]

        //Then
        Assertions.assertEquals(Figure.WHITE, figureOne.getColor());           // [13]
        Assertions.assertEquals(Pawn.class, figureTwo.getClass());             // [14]
        Assertions.assertEquals(Queen.class, figureThree.getClass());          // [15]
        Assertions.assertNull(figureFour);                                     // [16]
    }
}
