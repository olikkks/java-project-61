package hexlet.code.games;

import hexlet.code.GameTaskAndCorrectAnswer;

import java.util.Random;

public class GrstComDivisor implements GameTaskAndCorrectAnswer {

    private String taskQuestion;
    private String correctAnswer;


    public GrstComDivisor() {
        findGCD();
    }

    private void findGCD() {
        final int randomNumber1bound = 100;
        Random random1 = new Random();
        int dividend1 = random1.nextInt(randomNumber1bound);
        final int randomNumber2bound = 100;
        Random random2 = new Random();
        int dividend2 = random2.nextInt(randomNumber2bound);

        int a = dividend1;
        int b = dividend2;
        int gcd;
        int reminder;
        if (b == 0) {
            gcd = a;
        } else {
            while (b != 0) {
                reminder = a % b;
                a = b;
                b = reminder;
            }
            gcd = a;
        }

        taskQuestion = "Question: " + dividend1 + " " + dividend2;
        correctAnswer = "" + gcd;
    }

    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
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
        findGCD();
    }

}
