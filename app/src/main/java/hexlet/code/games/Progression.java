package hexlet.code.games;

import java.util.Random;

public class Progression {

    private String taskQuestion;
    private String correctAnswer;
    Random random = new Random();

    public Progression() {
        this.progr();
    }

    private void progr() {
        final int randomNumber1bound = 10;
        int randomNumber1 = random.nextInt(randomNumber1bound);

        final int randomNumber2bound = 10;
        int randomStep = random.nextInt(randomNumber2bound);

        final int randomNumber3bound = 5;
        int randomRowLengthAdd = random.nextInt(randomNumber3bound);

        final int lowestAmountOfNum = 5;
        int randomRowLength = lowestAmountOfNum + randomRowLengthAdd;
        int skip = random.nextInt(randomRowLength - 1);

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

    public String getTask() {
        return "What number is missing in the progression?";
    }

    public String getTaskQuestion() {
        return taskQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void update() {
        this.progr();
    }
}
