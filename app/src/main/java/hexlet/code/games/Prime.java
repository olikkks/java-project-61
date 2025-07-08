package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Prime {

    static Random random = new Random();
    static String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static String[][] taskQuestionAnswer = new String[3][2];
    static String taskAnswer;
    static String taskQuestion;
    static int notZero = 1;
    static int number;
    static int randomNumber;
    static int smallPrimeNotInAlgorithm = 3;

    public static void prime() {
        for (var i = 0; i < taskQuestionAnswer.length; i++) {
            number = random.nextInt(99);
            randomNumber = notZero + number;

            taskQuestion = "Question: " + randomNumber;
            double randomNumberRoot = sqrt(randomNumber);
            taskAnswer = "no";

            if (randomNumber < 2) {
                taskAnswer = "no";
            } else if (randomNumber == 2) {
                taskAnswer = "yes";
            } else if (randomNumber == smallPrimeNotInAlgorithm) {
                taskAnswer = "yes";
            } else if (randomNumber % 2 == 0) {
                taskAnswer = "no";
            } else {
                for (var j = smallPrimeNotInAlgorithm; (randomNumberRoot < smallPrimeNotInAlgorithm
                        && j < randomNumber) || (j <= randomNumberRoot); j += 2) {
                    if (randomNumber % j != 0) {
                        taskAnswer = "yes";
                    } else {
                        taskAnswer = "no";
                        break;
                    }
                }
            }
            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }
}
