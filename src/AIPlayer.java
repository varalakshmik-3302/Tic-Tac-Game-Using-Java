import java.util.*;

public class AIPlayer extends Player {
    AIPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner sc = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Enter row and col");
            Random r = new Random();
            row = r.nextInt(3);
            col = r.nextInt(3);
        } while (!isValidMove(row, col));
        TicTacGame.placeMark(row, col, mark);

    }
}
