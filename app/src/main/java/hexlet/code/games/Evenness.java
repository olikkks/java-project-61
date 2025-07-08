package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Evenness {
    static Random random = new Random();
    static String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static String[][] taskQuestionAnswer = new String[3][2];
    static String taskAnswer;
    static String taskQuestion;

    public static void evenness() {
        for (var i = 0; i < taskQuestionAnswer.length; i++) {
            int taskNumber = random.nextInt(100);
            taskQuestion = "Question: " + taskNumber;
            if (taskNumber % 2 == 0) {
                taskAnswer = "yes";
            } else {
                taskAnswer = "no";
            }
            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(task, taskQuestionAnswer);
    }
}
