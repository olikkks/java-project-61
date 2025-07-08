package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    static Random random = new Random();
    static String task = "What is the result of the expression?";
    static String[][] taskQuestionAnswer = new String[3][2];
    static String taskAnswer;
    static String taskQuestion;
    static String operation = "";

    public static void calculate() {
        for (var i = 0; i < taskQuestionAnswer.length; i++) {
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(10);
            int randomOperation = random.nextInt(3);

            switch (randomOperation) {
                case 0:
                    operation = "+";
                    taskAnswer = String.valueOf(randomNumber1 + randomNumber2);
                    break;
                case 1:
                    operation = "-";
                    taskAnswer = String.valueOf(randomNumber1 - randomNumber2);
                    break;
                case 2:
                    operation = "*";
                    taskAnswer = String.valueOf(randomNumber1 * randomNumber2);
                    break;
                default:
                    break;
            }
            taskQuestion = "Question: " + randomNumber1 + " " + operation + " " + randomNumber2;

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }
}
