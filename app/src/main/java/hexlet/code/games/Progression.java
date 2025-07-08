package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    static private final Random random = new Random();
    static final String task = "What number is missing in the progression?";
    static String[][] taskQuestionAnswer = new String[3][2];
    static String taskAnswer;
    static String taskQuestion;
    static int randomNumber1;
    static int randomStep;
    static int randomRowLengthAdd;
    static final int lowestAmountOfNum = 5;
    static int randomRowLength;
    static int skipPlace;

    public static void progression() {

        for (var i = 0; i < taskQuestionAnswer.length; i++) {

            randomNumber1 = random.nextInt(10);
            randomStep = random.nextInt(10);
            randomRowLengthAdd = random.nextInt(3);
            randomRowLength = lowestAmountOfNum + randomRowLengthAdd;
            skipPlace = random.nextInt(randomRowLength - 1);

            String[] rowOfNumbers = new String[randomRowLength];
            for (var j = 0; j < randomRowLength; j++) {
                int num = randomNumber1 + randomStep * j;
                rowOfNumbers[j] = String.valueOf(num);
            }

            taskAnswer = rowOfNumbers[skipPlace];

            rowOfNumbers[skipPlace] = "..";

            StringBuilder example = new StringBuilder(rowOfNumbers[0]);
            for (var k = 1; k < rowOfNumbers.length; k++) {
                example.append(" ").append(rowOfNumbers[k]);
            }
            taskQuestion = "Question: " + example;

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }
}
