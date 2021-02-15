package Game;

public class Board {
    Dice[] playerOneBoard = new Dice[6];
    Dice[] playerTwoBoard = new Dice[6];

    public Board() {
    }

    public void printBoard() {
        System.out.println("-----------------------");
        StringBuilder linePrint = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            if (playerOneBoard[i] != null) {
                linePrint.append("[").append(playerOneBoard[i].getDiceNumber()).append("] ");
            } else {
                linePrint.append("[ ] ");
            }
        }
        System.out.println(linePrint);
        System.out.println("-----------------------");
        linePrint = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (playerTwoBoard[i] != null) {
                linePrint.append("[").append(playerTwoBoard[i].getDiceNumber()).append("] ");
            } else {
                linePrint.append("[ ] ");
            }
        }
        System.out.println(linePrint);
        System.out.println("-----------------------");
    }
}
