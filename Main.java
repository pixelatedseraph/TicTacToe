package TicTacToe;

public class Main {
    public static void main(String[] args) {
        DrawBoard.Draw();
        String Player = "X";
        Boolean cont = true;
        while (cont) {
            PlayerInp.PlayerTurn(Player);
            String stat = GameCore.gameStatus();
            if (stat.equals("win")) {
                System.out.println("Player Won!");
                cont = false;
            } else if (stat.equals("draw")) {
                System.out.println("Match Draw!");
                cont = false;
            }
            else {
                cont = true;
            }
        }
    }
}