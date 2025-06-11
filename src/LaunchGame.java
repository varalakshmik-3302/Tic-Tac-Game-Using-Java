public class LaunchGame {
    public static void main(String[] args) {
        TicTacGame t = new TicTacGame();
        HumanPlayer p1 = new HumanPlayer("vara", 'x');
        AIPlayer p2 = new AIPlayer("AI", 'O');
        Player cp;
        cp = p1;
        while (true) {
            System.out.println(cp.name + " turn ");
            cp.makeMove();
            TicTacGame.displayBoard();
            if (TicTacGame.checkRowWin() || TicTacGame.checkColWin() || TicTacGame.checkDiagWin()) {
                System.out.println(cp.name + " win ");
                break;
            } else if (TicTacGame.checkDraw()) {
                System.out.println("Game is a draw");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}
