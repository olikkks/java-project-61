package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Evenness {

    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenness() {
        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        final int lowLimitRandomNum = 1;
        final int upperLimitRandomNum = 100;
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int taskNumber = generateRandomNumber(lowLimitRandomNum, upperLimitRandomNum);
            String taskQuestion = String.valueOf(taskNumber);
            String taskAnswer = isEven(taskNumber) ? "yes" : "no";
            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static boolean isEven(int taskNumber) {
        boolean isEven;
        isEven = taskNumber % 2 == 0;
        return isEven;
    }
}
