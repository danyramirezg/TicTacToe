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
                {'x', 'x', 'x'},
                {'-', '-', '-'},
        };
        assertEquals("X wins", game.checkGameWinner(grid));

    }

    @Test
    public void None() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', '-'},
                {'o', 'x', 'x'},
                {'-', '-', '-'},
        };
        assertEquals("None", game.checkGameWinner(grid));
    }

    @Test
    public void xWinsCase2(){
        Game game = new Game();
        char[][] grid ={
                {'x', 'x', 'x'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
        assertEquals("X wins", game.checkGameWinner(grid));

    }

    @Test
    public void xWinsCase3(){
        Game game = new Game ();
        char [][] grid ={
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'x', 'x', 'x'},

        };
        assertEquals("X wins", game.checkGameWinner(grid));

    }

    @Test
    public void xWinsCase4() {
        Game game = new Game();
        char[][] grid = {
                {'x', '-', '-'},
                {'x', '-', '-'},
                {'x', '-', '-'},
        };
        assertEquals("X wins", game.checkGameWinner(grid));
    }

    @Test
    public void noneCase2() {
        Game game = new Game();
        char[][] grid = {
                {'o', '-', '-'},
                {'x', '-', '-'},
                {'x', '-', '-'},
        };
        assertEquals("None", game.checkGameWinner(grid));
    }

    @Test
    public void xWinsCase5(){
        Game game = new Game();
        char [][] grid ={
                {'-', 'x', '-'},
                {'-', 'x', '-'},
                {'-', 'x', '-'},

        };
        assertEquals("X wins", game.checkGameWinner(grid));
    }

    @Test
    public void xWinsCase6(){
        Game game = new Game();
        char [][] grid = {
                {'-', '-', 'x'},
                {'-', '-', 'x'},
                {'-', '-', 'x'},

        };
        assertEquals("X wins", game.checkGameWinner(grid));
    }

    @Test
    public void xWinsCase7(){
        Game game = new Game ();
        char [][] grid = {
                {'x', '-', '-'},
                {'-', 'x', '-'},
                {'-', '-', 'x'},
        };
        assertEquals("X wins", game.checkGameWinner(grid));
    }

    @Test
    public void xWinsCase8() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', 'x'},
                {'-', 'x', '-'},
                {'x', '-', '-'},

        };
        assertEquals("X wins", game.checkGameWinner(grid));

    }

    @Test
    public void oWins() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', '-'},
                {'o', 'o', 'o'},
                {'-', '-', '-'},
        };
        assertEquals("O wins", game.checkGameWinner(grid));

    }

    @Test
    public void oWinsCase2(){
        Game game = new Game();
        char[][] grid ={
                {'o', 'o', 'o'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
        assertEquals("O wins", game.checkGameWinner(grid));

    }

    @Test
    public void oWinsCase3(){
        Game game = new Game ();
        char [][] grid ={
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'o', 'o', 'o'},

        };
        assertEquals("O wins", game.checkGameWinner(grid));

    }

    @Test
    public void oWinsCase4() {
        Game game = new Game();
        char[][] grid = {
                {'o', '-', '-'},
                {'o', '-', '-'},
                {'o', '-', '-'},
        };
        assertEquals("O wins", game.checkGameWinner(grid));
    }

    @Test
    public void oWinsCase5(){
        Game game = new Game();
        char [][] grid ={
                {'-', 'o', '-'},
                {'-', 'o', '-'},
                {'-', 'o', '-'},

        };
        assertEquals("O wins", game.checkGameWinner(grid));
    }

    @Test
    public void oWinsCase6(){
        Game game = new Game();
        char [][] grid = {
                {'-', '-', 'o'},
                {'-', '-', 'o'},
                {'-', '-', 'o'},

        };
        assertEquals("O wins", game.checkGameWinner(grid));
    }

    @Test
    public void oWinsCase7(){
        Game game = new Game ();
        char [][] grid = {
                {'o', '-', '-'},
                {'-', 'o', '-'},
                {'-', '-', 'o'},
        };
        assertEquals("O wins", game.checkGameWinner(grid));

    }

    @Test
    public void oWinsCase8() {
        Game game = new Game();
        char[][] grid = {
                {'-', '-', 'o'},
                {'-', 'o', '-'},
                {'o', '-', '-'},

        };
        assertEquals("O wins", game.checkGameWinner(grid));


    }

    @Test
    public void tie() {
        Game game = new Game();
        char[][] grid = {
                {'o', 'x', 'x'},
                {'x', 'o', 'o'},
                {'o', 'o', 'x'},

        };
        assertEquals("Tie", game.checkGameWinner(grid));


    }
}