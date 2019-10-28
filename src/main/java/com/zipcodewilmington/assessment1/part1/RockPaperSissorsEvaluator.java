package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String rock = "rock";
        String paper = "paper";
        String sci = "scissor";

        if (handSign.equalsIgnoreCase(rock)) {
            return paper;
        }
        if (handSign.equalsIgnoreCase(paper)) {
            return sci;
        }
        if (handSign.equalsIgnoreCase(sci)) {
            return rock;
        }
        else{
            return null;
        }
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String rock = "rock";
        String paper = "paper";
        String sci = "scissor";

        if (handSign.equalsIgnoreCase(rock)) {
            return sci;
        }
        if (handSign.equalsIgnoreCase(paper)) {
            return rock;
        }
        if (handSign.equalsIgnoreCase(sci)) {
            return paper;
        }
        else{
            return null;
        }

    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String rock = "rock";
        String paper = "paper";
        String sci = "scissor";

        if (handSignOfPlayer1.equalsIgnoreCase(rock) & handSignOfPlayer2.equalsIgnoreCase(rock)) {
            return sci;
        }
        if (handSignOfPlayer1.equalsIgnoreCase(paper)) {
            return rock;
        }
        if (handSignOfPlayer1.equalsIgnoreCase(sci)) {
            return paper;
        }
        else{
            return null;
        }

    }

    }

