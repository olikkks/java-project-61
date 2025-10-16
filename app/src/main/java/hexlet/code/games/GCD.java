package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void greatestComDivisor() {
        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        final int lowLimitRandomNum = 1;
        final int upperLimitRandomNum = 100;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int dividend1;
            int dividend2;

            dividend1 = generateRandomNumber(lowLimitRandomNum, upperLimitRandomNum);
            dividend2 = generateRandomNumber(lowLimitRandomNum, upperLimitRandomNum);

            String taskQuestion = dividend1 + " " + dividend2;
            String taskAnswer = String.valueOf(findGreatestComDivisor(dividend1, dividend2));

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static int findGreatestComDivisor(int numberOne, int numberTwo) {
        int a = numberOne;
        int b = numberTwo;
        int reminder;
        while (b != 0) {
            reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }
}
