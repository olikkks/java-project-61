package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Calc {

    private static final String TASK = "What is the result of the expression?";

    public static void calculate() {
        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        final int lowLimitRandomNum = 1;
        final int upperLimitRandomNum = 100;
        final int smallUpperLimitRandomNum = 10;
        final int lowLimitOperation = 0;
        final int upperLimitOperation = 2;


        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = generateRandomNumber(lowLimitRandomNum, upperLimitRandomNum);
            int randomNumber2 = generateRandomNumber(lowLimitRandomNum, smallUpperLimitRandomNum);
            int randomOperation = generateRandomNumber(lowLimitOperation, upperLimitOperation);
            char[] operations = {'+', '-', '*'};
            char operator = operations[randomOperation];

            String taskQuestion = randomNumber1 + " " + operator + " " + randomNumber2;
            String taskAnswer = String.valueOf(findCalc(randomNumber1, randomNumber2, operator));

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    private static int findCalc(int randomNumber1, int randomNumber2, char operator) {
        return switch (operator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new Error("Unknown operator:" + operator);
        };
    }
}
