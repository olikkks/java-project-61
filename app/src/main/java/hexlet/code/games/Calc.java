package hexlet.code.games;

import hexlet.code.GameTaskAndCorrectAnswer;

import java.util.Random;

public class Calc implements GameTaskAndCorrectAnswer {

    private String taskQuestion;
    private String correctAnswer;
    private String operation;
    private int result;

    public Calc() {
        calculate();
    }

    private void calculate() {
        final int randomNumber1bound = 100;
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(randomNumber1bound);
        final int randomNumber2bound = 10;
        Random random2 = new Random();
        int randomNumber2 = random2.nextInt(randomNumber2bound);
        final int randomNumber3bound = 3;
        Random random3 = new Random();
        int randomOperation = random3.nextInt(randomNumber3bound);

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

    @Override
    public String getTask() {
        return "What is the result of the expression?";
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
        calculate();
    }

}
