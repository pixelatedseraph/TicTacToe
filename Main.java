package TicTacToe;

public class Main {
    public static void main(String[] args) {
        DrawBoard.Draw();
        String Player = "X";
        Boolean run = true;
        while (run) {
            PlayerInp.PlayerTurn(Player);
            GameCore.Status stat = GameCore.gameStatus();
            switch (stat){
                case WIN -> {
                    System.out.println("Player "+Player+" Won!");
                    run = false;
                }
                case DRAW -> {
                    System.out.println("Match Draw"); run = false;
                }
                case CONT -> {
                    run = true;
                }
            }
            /* switch player if continue */
            if (stat==GameCore.Status.CONT){
                Player = Player.equals("X") ? "O" : "X";
            }
        }
    }
}