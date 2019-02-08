package com.udacity;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTestDanySlava {

    @Test
    public void emptyBoard() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
        assertEquals("None", game.checkGameWinner(grid));
    }

    @Test
    public void xWins() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', '-'},
        };
        assertEquals("None", game.checkGameWinner(grid));

    }
}