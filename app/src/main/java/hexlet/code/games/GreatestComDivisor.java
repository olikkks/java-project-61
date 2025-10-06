package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class GreatestComDivisor {
    //    static Random random = new Random();
    private final static String task = "Find the greatest common divisor of given numbers.";


    public static void greatestComDivisor() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;
        int dividend1;
        int dividend2;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            dividend1 = generateRandomNumber(1, 100);
            dividend2 = generateRandomNumber(1, 100);

            taskQuestion = dividend1 + " " + dividend2;
            taskAnswer = String.valueOf(findGreatestComDivisor(dividend1, dividend2));

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
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
