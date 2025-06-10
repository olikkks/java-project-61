package hexlet.code.games;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Prime {

    private String taskQuestion;
    private String correctAnswer;
    Random random = new Random();

    public Prime() {
        this.isPrime();
    }

    private void isPrime() {
        final int randomNumberBound = 99;
        int number = random.nextInt(randomNumberBound);
        final int notZero = 1;
        int randomNumber = notZero + number;

        taskQuestion = "Question: " + randomNumber;
        double randomNumberRoot = sqrt(randomNumber);
        correctAnswer = "no";
        final int smallPrimeNotInAlgorithm = 3;

        if (randomNumber < 2) {
            correctAnswer = "no";
        } else if (randomNumber == 2) {
            correctAnswer = "yes";
        } else if (randomNumber == smallPrimeNotInAlgorithm) {
            correctAnswer = "yes";
        } else if (randomNumber % 2 == 0) {
            correctAnswer = "no";
        } else {
            for (int i = smallPrimeNotInAlgorithm; (randomNumberRoot < smallPrimeNotInAlgorithm
                    && i < randomNumber) || (i <= randomNumberRoot); i += 2) {
                if (randomNumber % i != 0) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                    break;
                }
            }
        }
    }

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getTaskQuestion() {
        return taskQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void update() {
        this.isPrime();
    }
}
