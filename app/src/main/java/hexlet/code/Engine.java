package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(GameTaskAndCorrectAnswer game) {
        System.out.println("Welcome to the Brain Games! \nMay I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("Hello, " + name + "!");

        String selectedTask;
        String clientsSolution = "";
        String selectedTaskQuestion;
        String selectedCorrectAnswer = "";
        final int numOfRepeats = 3;
        final int endOfRepeats = 4;

        selectedTask = game.getTask();
        System.out.println(selectedTask);

        int i;
        for (i = 1; i <= numOfRepeats; i++) {
            selectedTaskQuestion = game.getSelectedTaskQuestion();
            System.out.println(selectedTaskQuestion);

            Scanner clientAnswer = new Scanner(System.in);
            clientsSolution = clientAnswer.nextLine();

            System.out.println("Your answer: " + clientsSolution);

            selectedCorrectAnswer = game.getCorrectAnswer();

            if (clientsSolution.equals(selectedCorrectAnswer)) {
                System.out.println("Correct!");
                game.update();
            } else {
                break;
            }
        }

        if (i == endOfRepeats) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("'" + clientsSolution + "'"
                    + " is wrong answer ;(. Correct answer was "
                    + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                    + name + "!");
        }
    }
}
