package hexlet.code.games;
import hexlet.code.GameTaskAndCorrectAnswer;
import java.util.Random;
import java.util.Arrays;

public class Progression implements GameTaskAndCorrectAnswer {

    private final  String task = "What number is missing in the progression?";
    private String taskQuestion;
    private String correctAnswer;
    private String result;

    public Progression() {
        Progr();
    }

    private void Progr() {
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(10);
        Random random2 = new Random();
        int randomStep = random2.nextInt(10);
        Random random3 = new Random();
        int randomRowLengthAdd = random3.nextInt(5);
        int randomRowLength = 5 + randomRowLengthAdd;
        Random random4 = new Random();
        int skip = random4.nextInt(randomRowLength);

        String[] rowOfNumbers = new String[randomRowLength];

            for (var i = 0; i < randomRowLength; i++) {
                int num = randomNumber1 + randomStep * i;
                rowOfNumbers[i] = "" + num;
            }

        result = rowOfNumbers[skip];
        rowOfNumbers[skip] = "..";
        taskQuestion = "Question: " + Arrays.toString(rowOfNumbers);
        correctAnswer = result;
    }

    @Override
    public String getTask() {
        return task;
    }

    @Override
    public String getSelectedTaskQuestion() {
        return taskQuestion;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void update() {
        Progr();
    }

}