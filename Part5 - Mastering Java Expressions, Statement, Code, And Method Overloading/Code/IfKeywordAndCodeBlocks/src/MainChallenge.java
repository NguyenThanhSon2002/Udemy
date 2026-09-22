//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainChallenge {
    public static void main(String[] args) {

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver){
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score is: " + newFinalScore);
//        }

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        caculateScore(gameOver, score, levelCompleted, bonus);
        int highScore = caculateScore2(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is: " + caculateScore2(gameOver, score, levelCompleted, bonus));
    }

    public static void caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

    }

    public static int (boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        return finalScore;

    }
}