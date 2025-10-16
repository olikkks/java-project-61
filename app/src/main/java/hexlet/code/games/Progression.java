package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";

    public static void progression() {
        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        final int lowLimitRandomNum = 1;
        final int smallUpperLimitRandomNum = 10;
        final int lowLimitLength = 5;
        final int upperLimitLength = 10;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = generateRandomNumber(lowLimitRandomNum, smallUpperLimitRandomNum);
            int randomStep = generateRandomNumber(lowLimitRandomNum, smallUpperLimitRandomNum);
            int randomProgressionLength = generateRandomNumber(lowLimitLength, upperLimitLength);
            int hiddenMemberIndex = generateRandomNumber(lowLimitRandomNum, randomProgressionLength - 1);

            String[] rowOfNumbers = makeProgression(randomNumber1, randomStep, randomProgressionLength);
            rowOfNumbers[hiddenMemberIndex] = "..";
            String taskAnswer = rowOfNumbers[hiddenMemberIndex];
            String taskQuestion = String.join(" ", rowOfNumbers);
            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static String[] makeProgression(int randomNumber1,
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
