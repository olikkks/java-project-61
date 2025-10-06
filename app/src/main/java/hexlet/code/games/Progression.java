package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Progression {
    private final static String TASK = "What number is missing in the progression?";

    public static void progression() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;
        int randomNumber1;
        int randomStep;
        int randomRowLength;
        int skipPlace;

        for (var i = 0; i < Engine.ROUNDS; i++) {

            randomNumber1 = generateRandomNumber(1, 10);
            randomStep = generateRandomNumber(1, 10);
            randomRowLength = generateRandomNumber(5, 10);
            skipPlace = generateRandomNumber(1, randomRowLength - 1);

            String[] rowOfNumbers = findRowOfNumbers(randomNumber1, randomStep, randomRowLength);
            taskAnswer = rowOfNumbers[skipPlace];
            rowOfNumbers[skipPlace] = "..";
            StringBuilder example = new StringBuilder(rowOfNumbers[0]);
            for (var k = 1; k < rowOfNumbers.length; k++) {
                example.append(" ").append(rowOfNumbers[k]);
            }
            taskQuestion = String.valueOf(example);

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static String[] findRowOfNumbers(int randomNumber1,
                                            int randomStep,
                                            int randomRowLength) {
        String[] rowOfNumbers = new String[randomRowLength];
        for (var j = 0; j < randomRowLength; j++) {
            int num = randomNumber1 + randomStep * j;
            rowOfNumbers[j] = String.valueOf(num);
        }
        return rowOfNumbers;
    }
}
