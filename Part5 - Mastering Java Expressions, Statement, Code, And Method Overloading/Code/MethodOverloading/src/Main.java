public class Main {

    public static void main(String[] args) {
        System.out.println(calculateScore("Tim", 500));
        System.out.println(calculateScore(75));
        System.out.println(calculateScore());
    }

    public static int calculateScore (String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return calculateScore("Son", score);
    }

    public static int calculateScore () {
        System.out.println("Unnamed player scored 0 points");
        return 0;
    }
}
