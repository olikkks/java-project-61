package hexlet.code.games;

import java.util.Random;

public class Evenness {
    private final Random random = new Random();
    static String taskQuestion;
    private static String correctAnswer;

    public Evenness() {
        this.isEven();
    }

    private void isEven() {

        int randomNumberBound = 100;
        int randomNumber = random.nextInt(randomNumberBound);
        taskQuestion = "Question: " + randomNumber;

        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
    }

    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getTaskQuestion() {
        return taskQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void update() {
        this.isEven();
    }

}




