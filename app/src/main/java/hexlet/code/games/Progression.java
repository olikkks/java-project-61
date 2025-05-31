package hexlet.code.games;

import hexlet.code.GameTaskAndCorrectAnswer;

import java.util.Random;

public class Progression implements GameTaskAndCorrectAnswer {

    private String taskQuestion;
    private String correctAnswer;

    public Progression() {
        progr();
    }

    private void progr() {
        final int randomNumber1bound = 10;
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(randomNumber1bound);
        final int randomNumber2bound = 10;
        Random random2 = new Random();
        int randomStep = random2.nextInt(randomNumber2bound);
        final int randomNumber3bound = 5;
        Random random3 = new Random();
        int randomRowLengthAdd = random3.nextInt(randomNumber3bound);
        final int lowestAmountOfNum = 5;
        int randomRowLength = lowestAmountOfNum + randomRowLengthAdd;
        Random random4 = new Random();
        int skip = random4.nextInt(randomRowLength - 1);

        String[] rowOfNumbers = new String[randomRowLength];

        for (var i = 0; i < randomRowLength; i++) {
            int num = randomNumber1 + randomStep * i;
            rowOfNumbers[i] = "" + num;
        }

        String result = rowOfNumbers[skip];
        rowOfNumbers[skip] = "..";

        StringBuilder example = new StringBuilder(rowOfNumbers[0]);
        for (var i = 1; i < rowOfNumbers.length; i++) {
            example.append(" ").append(rowOfNumbers[i]);
        }

        taskQuestion = "Question: " + example;
        correctAnswer = result;
    }

    @Override
    public String getTask() {
        return "What number is missing in the progression?";
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
        progr();
    }

}
