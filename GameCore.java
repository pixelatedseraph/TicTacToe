/* this class evaluates the game end scenario , there are 3 possible cases after each move */
/* 1. the winner wins the game */
/* 2. the board fills up but condition 1 isn't met (Draw) */
/* 3. if neither of those two conditions are met then game isn't finished yet */
package TicTacToe;
public class GameCore {
    /* enum to store all game outcomes */
    public enum status {WIN, DRAW, CONT};

    /* a method to check whether someone won */
    private static Boolean WinCheck(int a, int b, int c, String[] board) {
        return (DrawBoard.board[a].equals(DrawBoard.board[b]) && DrawBoard.board[b].equals(DrawBoard.board[c]) && !(DrawBoard.board[a].equals("-")));
    }

    public static status gameStatus() {
        /* now check if someone won in row wise */
        for (int i = 0; i < 9 ; i+=3){
            if(WinCheck(i,i+1,i+2,DrawBoard.board)) return status.WIN;
    }
        /* do the same for column wise */
        for (int i = 0 ; i < 3 ; ++i){
            if(WinCheck(i,i+3,i+6,DrawBoard.board)) return status.WIN;
        }
        /* now for diagonal wise */
        if (WinCheck(0,4,8,DrawBoard.board) || WinCheck(2,4,6,DrawBoard.board)) return status.WIN;
}
}
