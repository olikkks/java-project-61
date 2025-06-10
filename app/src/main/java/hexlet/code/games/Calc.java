package hexlet.code.games;

import java.util.Random;

public class Calc {

    static String taskQuestion;
    static String correctAnswer;
    static String operation;
    static int result;
    Random random = new Random();

    public Calc() {
        this.calculate();
    }

    private void calculate() {
        final int randomNumber1bound = 100;
        int randomNumber1 = random.nextInt(randomNumber1bound);

        final int randomNumber2bound = 10;
        int randomNumber2 = random.nextInt(randomNumber2bound);

        final int randomNumber3bound = 3;
        int randomOperation = random.nextInt(randomNumber3bound);

        switch (randomOperation) {
            case 0:
                operation = "+";
                result = randomNumber1 + randomNumber2;
                break;
            case 1:
                operation = "-";
                result = randomNumber1 - randomNumber2;
                break;
            case 2:
                operation = "*";
                result = randomNumber1 * randomNumber2;
                break;
            default:
                break;
        }

        taskQuestion = "Question: " + randomNumber1 + " " + operation + " " + randomNumber2;


        correctAnswer = "" + result;
    }

    public String getTask() {
        return "What is the result of the expression?";
    }

    public String getTaskQuestion() {
        return taskQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void update() {
        this.calculate();
    }

}
