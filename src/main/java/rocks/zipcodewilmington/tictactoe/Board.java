package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if (getWinner().equals("X")) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
       if(getWinner().equals("O")) {
           return true;
       } return false;
    }

    public Boolean isTie() {
        if (getWinner().equals("")){
                    return true;
                }
        return false;
    }

    public String getWinner() {

        if(checkRows().equals("O") || checkRows().equals("X")){

            return checkRows();
        }
        if(checkCols().equals("O") || checkCols().equals("X")){

            return checkCols();
        }
        if(checkDiags().equals("O") || checkDiags().equals("X")){

            return checkDiags();
        }
            return "";
    }
    public String checkRows(){
          for (int i = 0; i < 3 ; i++) {
            if(board[i][0].equals(board[i][1]) && board[i][1].equals (board[i][2]))
               return String.valueOf(board[i][0]);
        }
        return "";
    }
    public String checkCols(){

        for (int i = 0; i < 3 ; i++) {
            if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
              return  String.valueOf(board[0][i]);
        }
        return "";
    }
    public String checkDiags(){

           if(board[0][0].equals(board[1][1]) && board[1][1].equals (board[2][2]) ||
                   board[0][2].equals(board[1][1]) && board[1][1].equals (board[2][0])  )
                return String.valueOf(board[1][1]);

        return "";
    }
}
