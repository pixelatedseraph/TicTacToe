package TicTacToe;

public class DrawBoard {
    /* setup game board */
static String [] board = {"-","-","-","-","-","-","-","-","-",};
    public static void Draw(){
        System.out.println(board[0]+ " | " +board[1]+ " | "+ board[2]);
        System.out.println(board[3]+ " | " +board[4]+ " | "+ board[5]);
        System.out.println(board[6]+ " | " +board[7]+ " | "+ board[8]);

    }
}
