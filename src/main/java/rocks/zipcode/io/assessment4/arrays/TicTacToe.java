package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < column.length; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String seen = row[0];
        for (int i = 1; i < row.length; i++) {
            if (!seen.equals(row[i]))
                return false;
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        String seen = column[0];
        for (int i = 1; i < column.length; i++) {
            if (!seen.equals(column[i]))
                return false;
        }
        return true;
    }

    public String getWinner() {
        if (checkRow() != null)
            return checkRow();
        else if (checkColumn() != null)
            return checkColumn();
        return checkDiagonal();
    }

    public String checkRow(){
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i))
                return getRow(i)[0];
        }
        return null;
    }

    public String checkColumn(){
        for (int i = 0; i < 3; i++) {
            if (isColumnHomogeneous(i))
                return getColumn(i)[0];
        }
        return null;
    }

    public String checkDiagonal(){
        if (getRow(0)[0].equals(getRow(1)[1]) && getRow(1)[1].equals(getRow(2)[2]))
            return getRow(0)[0];
        else if (getRow(0)[2].equals(getRow(1)[1]) && getRow(1)[1].equals(getRow(2)[0]))
            return getRow(0)[2];
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
