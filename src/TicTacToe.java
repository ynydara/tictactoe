public class TicTacToe {
    private char[][] board;
    private char nextPlayer;
    private char winner;
    TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }//for
        }//for
        nextPlayer = 'x';
    }//TicTacToe

    public void playAMove(char symbol, int row, int column) {

        if (symbol == nextPlayer && isGameOver()) { //char has ' ' and string has " "
            if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
                if (board[row][column] != 'x' && board[row][column] != 'o') {
                    board[row][column] = symbol;
                    if (nextPlayer == 'x') {
                        nextPlayer = 'o';
                    }//if
                    else if (nextPlayer == 'o') {
                        nextPlayer = 'x';
                    }//else if
                }//if
            }//if
        }//if

        board[row][column] = symbol; // do row -1 && column -1 to fix the Index 3 out of bounds exception.
    }//playAMove

    public boolean isGameOver() {
        boolean over = false;
        //check rows

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] &&
                    board[i][0] == board[i][2] &&
                    board[i][0] != ' '){ //this line is because the game will end before it started because every space is an empty space
                over = true;
                winner = board[i][0];
                break; //gets out of the for loop
            }//if
        }//for
//check columns
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == board[1][j] &&
                    board[0][j] == board[2][j] &&
                    board[0][j] != ' '){ //this line is because the game will end before it started because every space is an empty space
                over = true;
                break; //gets out of the for loop
            }//if
        }//for
        //check diagonals


        return over;

    }//isGameOver

    public char getWinner(){
        return winner;
    }//whoIsTheWinner

    public String toString(){
        return  board[0][0] +  " |" + board[0][1] +"| " + board[0][2]+"\n "+ "-----\n"+
                board[1][0] +  " |" + board[1][1] +"| " + board[1][2]+"\n "+ "-----\n"+
                board[2][0] +  " |" + board[2][1] +"| " + board[2][2]+"\n "+ "-----\n"+
                "";

    }//toString
}//class
