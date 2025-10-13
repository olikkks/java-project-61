package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class Engine {
    public static final int ROUNDS = 3;

    public static void engine(String task, String[][] taskQuestionAnswer) {

        String clientsSolution;
        String selectedTaskQuestion;
        String selectedCorrectAnswer;
        //int i;

        Logger logger = Logger.getLogger(Engine.class.getName());
        logger.info("Welcome to the Brain Games! \nMay I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        logger.info("Hello, " + name + "!");
        logger.info(task);
        Scanner clientAnswer = new Scanner(System.in);
        for (String[] questionAnswer : taskQuestionAnswer) {
            selectedTaskQuestion = "Question: " + questionAnswer[0];
            logger.info(selectedTaskQuestion);

            clientsSolution = clientAnswer.nextLine();
            logger.info("Your answer: " + clientsSolution);
            selectedCorrectAnswer = questionAnswer[1];
            if (clientsSolution.equals(selectedCorrectAnswer)) {
                logger.info("Correct!");
            } else {
                logger.info("'" + clientsSolution + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                        + name + "!");
                return;
            }
        }
        logger.info("Congratulations, " + name + "!");
    }
}

