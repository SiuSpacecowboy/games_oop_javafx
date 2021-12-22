package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        boolean rsline = false;
        boolean rscolumn = false;
        int a = 0;
        int b = 0;
        for (int i = 0; i < board.length; i++) {
            if (a == 5) {
                rsline = true;
                break;
            }
            a = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    break;
                } else {
                    a++;
                }
                }
            }
        for (int i = 0; i < board.length; i++) {
            if (b == 5) {
                rscolumn = true;
                break;
            }
            b = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 0) {
                    break;
                } else {
                    b++;
                }
            }
        }
        if (rsline == true || rscolumn == true) {
            rsl = true;
        }
        return rsl;
    }
}
