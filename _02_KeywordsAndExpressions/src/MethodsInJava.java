public class MethodsInJava {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("THe highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("THe next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            // and we'll forget it in the next copy+paste segment
            finalScore += 1000;
        }

        return finalScore;
    }
}
