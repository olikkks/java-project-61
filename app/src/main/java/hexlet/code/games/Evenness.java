package hexlet.code.games;

import hexlet.code.GameTaskAndCorrectAnswer;

import java.util.Random;

public class Evenness implements GameTaskAndCorrectAnswer {

    private String taskQuestion;
    private String correctAnswer;

    public Evenness() {
        isEven();

    }

    private void isEven() {
        final int randomNumberBound = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(randomNumberBound);
        taskQuestion = "Question: " + randomNumber;

        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
    }

    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getSelectedTaskQuestion() {
        return taskQuestion;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void update() {
        isEven();
    }

}




