package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board; // intializing variable

    public Board(Character[][] matrix) {

        this.board = matrix;

    }

    public Boolean isInFavorOfX() {
        if (isHorizontal('X') || (isVertical('X')) || (isDiagonal('X'))) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (isHorizontal('O') || (isVertical('0')) || (isDiagonal('0'))) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        }
        return false;
    }


    public String getWinner() {
        if (isInFavorOfO()) {
            return "0";
        }
        if (isInFavorOfX()) {
            return "X";
        }
        return " ";
    }

    public Boolean isHorizontal(Character xsAndOs) {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }

        }
        return false;
    }


    public Boolean isVertical(Character xsAndOs) {
        for (int i = 0; i <= 2; i++) {
            if (board[0][i] == board[1][i] && board[i][1] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    public Boolean isDiagonal(Character xsAndOs) {
        if ((board[0][0] == xsAndOs && board[1][1] == xsAndOs && board[2][2] == xsAndOs) ||
                (board)[2][0] == xsAndOs && board[1][1] == xsAndOs && board[0][2] == xsAndOs) {
            return true;
        }
        return false;
    }
}

