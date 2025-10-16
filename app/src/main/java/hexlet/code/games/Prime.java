package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Prime {

    private static final String TASK = "Answer 'yes' if given number is prime, otherwise answer 'no'.";

    public static void prime() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        final int lowLimitRandomNum = 1;
        final int upperLimitRandomNum = 100;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = generateRandomNumber(lowLimitRandomNum, upperLimitRandomNum);
            String taskQuestion = String.valueOf(randomNumber);
            String taskAnswer = isPrime(randomNumber) ? "yes" : "no";

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static boolean isPrime(int randomNumber) {

        if (randomNumber < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i += 1) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
