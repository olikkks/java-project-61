package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Randoms.generateRandomNumber;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";

    public static void progression() {

        String[][] taskQuestionAnswer = new String[Engine.ROUNDS][2];
        String taskAnswer;
        String taskQuestion;
        int randomNumber1;
        int randomStep;
        int randomProgressionLength;
        int hiddenMemberIndex;

        for (var i = 0; i < Engine.ROUNDS; i++) {

            randomNumber1 = generateRandomNumber(Engine.LOWLIMITRANDOMNUM, Engine.SMALLUPPERLIMITRANDOMNUM);
            randomStep = generateRandomNumber(Engine.LOWLIMITRANDOMNUM, Engine.SMALLUPPERLIMITRANDOMNUM);
            randomProgressionLength = generateRandomNumber(Engine.PROGRLOWLIMITRANDOMLENGTH, Engine.PROGRUPPERLIMITRANDOMLENGTH);
            hiddenMemberIndex = generateRandomNumber(Engine.LOWLIMITRANDOMNUM, randomProgressionLength - 1);

            String[] rowOfNumbers = makeProgression(randomNumber1, randomStep,
                    randomProgressionLength);

            String answer = rowOfNumbers[hiddenMemberIndex];

            rowOfNumbers[hiddenMemberIndex] = "..";

            taskQuestion = String.join(" ", rowOfNumbers);
            taskAnswer = answer;

            taskQuestionAnswer[i][0] = taskQuestion;
            taskQuestionAnswer[i][1] = taskAnswer;
        }
        Engine.engine(TASK, taskQuestionAnswer);
    }

    public static String[] makeProgression(int randomNumber1,
                                           int randomStep,
                                           int randomRowLength) {
        String[] rowOfNumbers = new String[randomRowLength];
        for (var j = 0; j < randomRowLength; j++) {
            int num = randomNumber1 + randomStep * j;
            rowOfNumbers[j] = String.valueOf(num);
        }
        return rowOfNumbers;
    }
}
