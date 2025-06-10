package hexlet.code.games;

import java.util.Random;

public class GrstComDivisor {

    private String taskQuestion;
    private String correctAnswer;
    Random random = new Random();

    public GrstComDivisor() {
        this.findGCD();
    }

    private void findGCD() {
        final int randomNumber1bound = 100;
        int dividend1 = random.nextInt(randomNumber1bound);

        final int randomNumber2bound = 100;
        int dividend2 = random.nextInt(randomNumber2bound);

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

    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getTaskQuestion() {
        return taskQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void update() {
        this.findGCD();
    }
}
