package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class Engine {
    public static void engine(String task, String[][] taskQuestionAnswer) {

        String clientsSolution;
        String selectedTaskQuestion;
        String selectedCorrectAnswer;
        int i;

        Logger logger = Logger.getLogger(Engine.class.getName());
        logger.info("Welcome to the Brain Games! \nMay I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        logger.info("Hello, " + name + "!");
        logger.info(task);
        for (i = 0; i < taskQuestionAnswer.length; i++) {
            selectedTaskQuestion = taskQuestionAnswer[i][0];
            logger.info(selectedTaskQuestion);
            Scanner clientAnswer = new Scanner(System.in);
            clientsSolution = clientAnswer.nextLine();
            logger.info("Your answer: " + clientsSolution);
            selectedCorrectAnswer = taskQuestionAnswer[i][1];
            if (clientsSolution.equals(selectedCorrectAnswer)) {
                logger.info("Correct!");
            } else {
                logger.info("'" + clientsSolution + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                        + name + "!");
                break;
            }
        }
        if (i == taskQuestionAnswer.length) {
            logger.info("Congratulations, " + name + "!");
        }
    }
}

