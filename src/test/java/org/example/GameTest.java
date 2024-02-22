package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void shouldReturnLoveLoveWhenMatchStarts() {

        final Game game = initGame(0, 0);

        final String score = game.checkScore();

        assertEquals("love-love", score);
    }

    @Test
    public void shouldReturnFifteenLoveWhenPlayerOneGetsOnePoint() {

        final Game game = initGame(1, 0);

        final String score = game.checkScore();

        assertEquals("fifteen-love", score);
    }

    @Test
    public void shouldReturnThirtyLoveWhenPlayerOneGetsTwoPoints() {

        final Game game = initGame(2, 0);

        final String score = game.checkScore();

        assertEquals("thirty-love", score);
    }

    @Test
    public void shouldReturnFortyLoveWhenPlayerOneGetsThreePoints() {

        final Game game = initGame(3, 0);

        final String score = game.checkScore();

        assertEquals("forty-love", score);
    }

    @Test
    public void shouldReturnLoveFifteenWhenPlayerTwoGetsOnePoint() {

        final Game game = initGame(0, 1);

        final String score = game.checkScore();

        assertEquals("love-fifteen", score);
    }

    @Test
    public void shouldReturnLoveThirtyWhenPlayerTwoGetsOnePoint() {

        final Game game = initGame(0, 2);

        final String score = game.checkScore();

        assertEquals("love-thirty", score);
    }

    @Test
    public void shouldReturnLoveFortyWhenPlayerTwoGetsOnePoint() {

        final Game game = initGame(0, 3);

        final String score = game.checkScore();

        assertEquals("love-forty", score);
    }

    @Test
    public void shouldReturnDeuce() {

        final Game game = initGame(3, 3);

        final String score = game.checkScore();

        assertEquals("deuce", score);
    }

    @Test
    public void shouldReturnOneAdvantage() {

        final Game game = initGame(4, 3);

        final String score = game.checkScore();

        assertEquals("one advantage", score);
    }

    @Test
    public void shouldReturnTwoAdvantage() {

        final Game game = initGame(3, 4);

        final String score = game.checkScore();

        assertEquals("two advantage", score);
    }

    @Test
    public void shouldReturnOneWins() {
        final Game game = initGame(5, 3);

        final String score = game.checkScore();

        assertEquals("one wins", score);
    }

    @Test
    public void shouldReturnTwoWins() {
        final Game game = initGame(3, 5);

        final String score = game.checkScore();

        assertEquals("two wins", score);
    }


    private Game initGame(int pointsPlayerOne, int pointsPlayerTwo) {
         final Game game = new Game();
        for (int i = 0; i < pointsPlayerOne; i++) {
            game.playerOneGetPoint();
        }
        for (int i = 0; i < pointsPlayerTwo; i++) {
            game.playerTwoGetPoint();
        }
        return game;
    }


}
