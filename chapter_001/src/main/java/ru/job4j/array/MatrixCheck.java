package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        int count=0;
        for (int i=0;i<board.length;i++ ) {
            if (board[row][i] == 'X') {
                count++;
            }
        }
            if (count==(board.length)) {
                result = true;
            }
        return result;
    }

    public static void main(String[] args) {

        char[][] board = new char[][] {
                {'r', 'd', 'j'},
                {'X','X','X'},
                {'f', 'g', 't'}
        };
        boolean result=MatrixCheck.monoHorizontal(board,1);
        System.out.println(result);
    }
}
