//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int playerPosition = caculateHighScorePosition(1500);
        displayHighScorePosition("Son", playerPosition);

        playerPosition = caculateHighScorePosition(1000);
        displayHighScorePosition("Nam", playerPosition);

        playerPosition = caculateHighScorePosition(500);
        displayHighScorePosition("Phuong", playerPosition);

        playerPosition = caculateHighScorePosition(100);
        displayHighScorePosition("Ly", playerPosition);

        playerPosition = caculateHighScorePosition(25);
        displayHighScorePosition("Huy", playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int caculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
