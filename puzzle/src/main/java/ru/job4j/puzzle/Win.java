package ru.job4j.puzzle;

public class Win {
    public static boolean Horizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean Vertical(int[][] board, int column) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (Horizontal(board, i) || Vertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
