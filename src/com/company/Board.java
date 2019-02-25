package com.company;

public class Board
{

    String[][] board;

    public Board(String[][]board)
    {
        this.board = board;
    }

    public String toString()
    {
        String pic = "";
        for (int x = 0; x < board.length; x++)
        {
            for (int y = 0; y < board[x].length; y++)
            {
                pic = pic + board[x][y];
            }
            pic = pic + "\n";
        }
        return pic;
    }
}
