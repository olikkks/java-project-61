package hexlet.code.games;

import hexlet.code.GameTaskAndCorrectAnswer;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Prime implements GameTaskAndCorrectAnswer {

    private String taskQuestion;
    private String correctAnswer;

    public Prime() {
        isPrime();
    }

    private void isPrime() {
        Random random = new Random();
        int number = random.nextInt(99);
        int randomNumber = 1 + number;
        taskQuestion = "Question: " + randomNumber;
        double randomNumberRoot = sqrt(randomNumber);
        correctAnswer = "no";
        //System.out.println(randomNumberRoot);

        if (randomNumber < 2) {
            correctAnswer = "no";
        } else if (randomNumber == 2) {
            correctAnswer = "yes";
        } else if (randomNumber == 3) {
            correctAnswer = "yes";
        } else if (randomNumber % 2 == 0) {
            correctAnswer = "no";
        } else {
            for (int i = 3; (randomNumberRoot < 3 && i < randomNumber) || (i < randomNumberRoot); i += 2) {
                //System.out.println("i = " + i + " n = " + (randomNumber % i) + " " + correctAnswer);
                if (randomNumber % i != 0) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                    break;
                }
            }
        }
    }

    @Override
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        isPrime();
    }
}
