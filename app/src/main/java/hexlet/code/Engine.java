package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void engine(String task, String[][] taskQuestionAnswer) {
        System.out.println("Welcome to the Brain Games! \nMay I have your name?");
        Scanner clientScanner = new Scanner(System.in);
        String name = clientScanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (String[] questionAnswer : taskQuestionAnswer) {
            String selectedTaskQuestion = "Question: " + questionAnswer[0];
            System.out.println(selectedTaskQuestion);
            String clientsSolution = clientScanner.nextLine();
            System.out.println("Your answer: " + clientsSolution);
            String selectedCorrectAnswer = questionAnswer[1];
            if (clientsSolution.equals(selectedCorrectAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + clientsSolution + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                        + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

