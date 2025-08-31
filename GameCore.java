/* this class evaluates the game end scenario , there are 3 possible cases after each move */
/* 1. the winner wins the game */
/* 2. the board fills up but condition 1 isn't met (Draw) */
/* 3. if neither of those two conditions are met then game isn't finished yet */
package TicTacToe;
public class GameCore {
    public static String gameStatus(){
        if (DrawBoard.board[0].equals(DrawBoard.board[1]) && DrawBoard.board[1].equals(DrawBoard.board[2]) && !(DrawBoard.board[0].equals("-")) ||   /* row wise */
                DrawBoard.board[3].equals(DrawBoard.board[4]) && DrawBoard.board[4].equals(DrawBoard.board[5]) && !(DrawBoard.board[3].equals("-")) ||
                DrawBoard.board[6].equals(DrawBoard.board[7]) && DrawBoard.board[7].equals(DrawBoard.board[8]) && !(DrawBoard.board[6].equals("-")) ||
                /* col wise */
                DrawBoard.board[0].equals(DrawBoard.board[3]) && DrawBoard.board[3].equals(DrawBoard.board[6]) && !(DrawBoard.board[0].equals("-")) ||
                DrawBoard.board[1].equals(DrawBoard.board[4]) && DrawBoard.board[4].equals(DrawBoard.board[7]) && !(DrawBoard.board[1].equals("-")) ||
                DrawBoard.board[2].equals(DrawBoard.board[5]) && DrawBoard.board[8].equals(DrawBoard.board[2]) && !(DrawBoard.board[2].equals("-")) ||
                /* diagonal wise */
                DrawBoard.board[0].equals(DrawBoard.board[4]) && DrawBoard.board[4].equals(DrawBoard.board[8]) && !(DrawBoard.board[0].equals("-")) ||
                DrawBoard.board[2].equals(DrawBoard.board[4]) && DrawBoard.board[4].equals(DrawBoard.board[6]) && !(DrawBoard.board[0].equals("-")) ) {
            return "win";
        }
        /* check for a tie */
        else if(!String.join("", DrawBoard.board).contains("-")){
            return "draw";
        }
        else {
            return "play";
        }
    }
}
