package org.example;

import java.util.Map;

public class Game {

    private int pointsOfPlayerOne;
    private int pointsOfPlayerTwo;

    private Map<Integer, String> playerScores = Map.of(
            0, "love",
            1, "fifteen",
            2, "thirty",
            3, "forty"
    );

    public String checkScore() {

        if (isThereWinnerPlayer()) {
            return playerAhead() + " wins";
        }

        if (isAdvantage()) {
            return playerAhead() + " advantage";
        }

        if (isDeuce()) {
            return "deuce";
        }

        return playerScores.get(pointsOfPlayerOne) + "-" + playerScores.get(pointsOfPlayerTwo);
    }

    private Boolean isThereWinnerPlayer() {
        if (pointsOfPlayerOne > 4 && pointsOfPlayerOne - pointsOfPlayerTwo >= 2) {
            return true;
        }
        return pointsOfPlayerTwo > 4 && pointsOfPlayerTwo - pointsOfPlayerOne >= 2;
    }

    private String playerAhead() {
        if (pointsOfPlayerOne > pointsOfPlayerTwo) {
            return "one";
        }
        return "two";
    }

    private Boolean isAdvantage() {
        if (pointsOfPlayerOne >= 4 && pointsOfPlayerOne - pointsOfPlayerTwo == 1) {
            return true;
        }
        return pointsOfPlayerTwo >= 4 && pointsOfPlayerTwo - pointsOfPlayerOne == 1;
    }

    private Boolean isDeuce() {
        return pointsOfPlayerOne == pointsOfPlayerTwo && pointsOfPlayerOne >= 3;
    }

    public void playerOneGetPoint() {
        pointsOfPlayerOne++;
    }

    public void playerTwoGetPoint() {
        pointsOfPlayerTwo++;
    }
}
