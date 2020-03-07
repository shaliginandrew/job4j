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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        int count=0;
        for (int i=0;i<3.;i++ ) {
            if (board[i][column] == 'X') {
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
                {'r', 'X', 'j'},
                {'м','X','f'},
                {'f', 'X', 't'}
        };
        boolean result=MatrixCheck.monoHorizontal(board,1);
        System.out.println("Все одинаковые символы в строке: "+result);
        boolean result2=MatrixCheck.monoVertical(board,1);
        System.out.println("Все одинаковые символы в столбце: "+result2);

    }
}
