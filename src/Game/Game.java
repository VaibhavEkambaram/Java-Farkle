package Game;

public class Game {
    private Player playerOne;
    private Player playerTwo;

    public Game() {
        System.out.println("NEW GAME");

        playerOne = new Player("Player 1");
        playerTwo = new Player("Player 2");

        Board board = new Board();
    }
}
