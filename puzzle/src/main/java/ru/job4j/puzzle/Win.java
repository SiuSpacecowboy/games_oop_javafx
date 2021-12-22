package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int a = 0;
        int b = 0;
        for (int i = 0; i < board.length; i++) {
            if (a == 5) {
                rsl = true;
                break;
            } else if (b == 5) {
                rsl = true;
                break;
            }
            a = 0;
            b = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    a--;
                }
                if (board[j][i] == 0) {
                    b--;
                }
                if (board[i][j] == 0 && board[j][i] == 0) {
                    break;
                }
                a++;
                b++;
                }
        }
        return rsl;
    }

}

