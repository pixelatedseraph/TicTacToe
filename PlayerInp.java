/* this class handles the user input and place the symbol in respective position */
package TicTacToe;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner.*;
import java.util.random.*;
public class PlayerInp {
    static void PlayerTurn(String player){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1-9");
        int pos = sc.nextInt()-1;
        while (pos < 0 || pos > 8 || !(Objects.equals(DrawBoard.board[pos], "-"))){
            System.out.println("Invalid Positon or Already Occupied!,Enter again : ");
            pos = sc.nextInt()-1;
        }
        DrawBoard.board[pos] = player;
        DrawBoard.Draw();
        System.out.println(" ");
    }
    static void ComputerTurn(String player){
        Random r = new Random();
        int pos = r.nextInt(9); /* 0 to 8 random number gen  */
        while (!( DrawBoard.board[pos].equals("-"))){
            pos = r.nextInt();
        }
        DrawBoard.board[pos] = player;
        DrawBoard.Draw();
    }
}
