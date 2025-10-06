package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Calc {

    private final static String TASK = "What is the result of the expression?";
    private final static String[] operations = {"+", "-", "*"};

    public static void calculate() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = generateRandomNumber(1, 100);
            int randomNumber2 = generateRandomNumber(1, 10);
            int randomOperation = generateRandomNumber(0, 2);

            taskQuestion = randomNumber1 + " " + operations[randomOperation] + " " + randomNumber2;
            taskAnswer = findCalc(randomNumber1, randomNumber2, randomOperation);

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static String findCalc(int randomNumber1, int randomNumber2, int randomOperation) {
        String findTaskAnswer = "";
        switch (randomOperation) {
            case 0:
                findTaskAnswer = String.valueOf(randomNumber1 + randomNumber2);
                break;
            case 1:
                findTaskAnswer = String.valueOf(randomNumber1 - randomNumber2);
                break;
            case 2:
                findTaskAnswer = String.valueOf(randomNumber1 * randomNumber2);
                break;
            default:
                break;
        }
        return findTaskAnswer;
    }
}
