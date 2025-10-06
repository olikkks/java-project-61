package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

import static java.lang.Math.sqrt;

public class Prime {

    private final static String TASK = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

    public static void prime() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;
        int randomNumber;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            randomNumber = generateRandomNumber(1, 99);
            taskQuestion = String.valueOf(randomNumber);
            taskAnswer = findPrime(randomNumber);

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static String findPrime(int randomNumber) {
        double randomNumberRoot = sqrt(randomNumber);
        int smallPrimeNotInAlgorithm = 3;
        String findTaskAnswer = "";
        if (randomNumber < 2) {
            findTaskAnswer = "no";
        } else if (randomNumber == 2) {
            findTaskAnswer = "yes";
        } else if (randomNumber == smallPrimeNotInAlgorithm) {
            findTaskAnswer = "yes";
        } else if (randomNumber % 2 == 0) {
            findTaskAnswer = "no";
        } else {
            for (var j = smallPrimeNotInAlgorithm; (randomNumberRoot < smallPrimeNotInAlgorithm
                    && j < randomNumber) || (j <= randomNumberRoot); j += 2) {
                if (randomNumber % j != 0) {
                    findTaskAnswer = "yes";
                } else {
                    findTaskAnswer = "no";
                    break;
                }
            }
        }
        return findTaskAnswer;
    }
}
