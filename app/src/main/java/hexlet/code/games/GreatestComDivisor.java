package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GreatestComDivisor {
    static Random random = new Random();
    static String task = "Find the greatest common divisor of given numbers.";
    static String[][] taskQuestionAnswer = new String[3][2];
    static String taskAnswer;
    static String taskQuestion;
    static int dividend1;
    static int dividend2;

    public static void greatestComDivisor() {
        for (var i = 0; i < taskQuestionAnswer.length; i++) {
            dividend1 = random.nextInt(100);
            dividend2 = random.nextInt(100);
            int a = dividend1;
            int b = dividend2;
            int reminder;
            while (b != 0) {
                reminder = a % b;
                a = b;
                b = reminder;
            }
            taskQuestion = "Question: " + dividend1 + " " + dividend2;
            taskAnswer = String.valueOf(a);

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }
}
