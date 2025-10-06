package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Evenness {

    private final static String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void evenness() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int taskNumber = generateRandomNumber(1, 100);
            taskQuestion = String.valueOf(taskNumber);
            taskAnswer = findEvenness(taskNumber);
            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }

    public static String findEvenness(int taskNumber) {
        String findTaskAnswer;
        findTaskAnswer = taskNumber % 2 == 0 ? "yes" : "no";
        return findTaskAnswer;
    }
}
