package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Prime {

    private static final String TASK = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

    public static void prime() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String taskAnswer;
            String taskQuestion;
            int randomNumber;
            randomNumber = generateRandomNumber(1, 99);
            taskQuestion = String.valueOf(randomNumber);
            taskAnswer = isPrime(randomNumber) ? "yes" : "no";

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
