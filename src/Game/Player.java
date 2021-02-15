package Game;

public class Player {

    private String playerName;

    private int totalScore;
    private int roundScore;
    private int selectedScore;

    public Player(String playerName) {
        this.playerName = playerName;
        System.out.println("CREATED NEW PLAYER CALLED " + playerName);
    }
}
