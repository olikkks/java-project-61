package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

import hexlet.code.games.Calc;
import hexlet.code.games.GrstComDivisor;
import hexlet.code.games.Progression;
import hexlet.code.games.Evenness;
import hexlet.code.games.Prime;

public class Engine {
    public static void engine(String gameNum, String name) {

        Logger logger = Logger.getLogger(Engine.class.getName());
        String selectedTask;
        String clientsSolution;
        String selectedTaskQuestion;
        String selectedCorrectAnswer;
        final int numOfRepeats = 3;
        final int endOfRepeats = 4;
        int i = 1;

        switch (gameNum) {
            case "1":
                Cli.client(name);
                break;
            case "2":
                Evenness even = new Evenness();
                selectedTask = even.getTask();
                logger.info(selectedTask);
                for (i = 1; i <= numOfRepeats; i++) {
                    selectedTaskQuestion = even.getTaskQuestion();
                    logger.info(selectedTaskQuestion);
                    Scanner clientAnswer = new Scanner(System.in);
                    clientsSolution = clientAnswer.nextLine();
                    logger.info("Your answer: " + clientsSolution);
                    selectedCorrectAnswer = even.getCorrectAnswer();
                    if (clientsSolution.equals(selectedCorrectAnswer)) {
                        logger.info("Correct!");
                        even.update();
                    } else {
                        logger.info("'" + clientsSolution + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                                + name + "!");
                        break;
                    }
                }
                break;
            case "3":
                Calc calc = new Calc();
                selectedTask = calc.getTask();
                logger.info(selectedTask);
                for (i = 1; i <= numOfRepeats; i++) {
                    selectedTaskQuestion = calc.getTaskQuestion();
                    logger.info(selectedTaskQuestion);
                    Scanner clientAnswer = new Scanner(System.in);
                    clientsSolution = clientAnswer.nextLine();
                    logger.info("Your answer: " + clientsSolution);
                    selectedCorrectAnswer = calc.getCorrectAnswer();
                    if (clientsSolution.equals(selectedCorrectAnswer)) {
                        logger.info("Correct!");
                        calc.update();
                    } else {
                        logger.info("'" + clientsSolution + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                                + name + "!");
                        break;
                    }
                }
                break;
            case "4":
                GrstComDivisor gcdiv = new GrstComDivisor();
                selectedTask = gcdiv.getTask();
                logger.info(selectedTask);
                for (i = 1; i <= numOfRepeats; i++) {
                    selectedTaskQuestion = gcdiv.getTaskQuestion();
                    logger.info(selectedTaskQuestion);
                    Scanner clientAnswer = new Scanner(System.in);
                    clientsSolution = clientAnswer.nextLine();
                    logger.info("Your answer: " + clientsSolution);
                    selectedCorrectAnswer = gcdiv.getCorrectAnswer();
                    if (clientsSolution.equals(selectedCorrectAnswer)) {
                        logger.info("Correct!");
                        gcdiv.update();
                    } else {
                        logger.info("'" + clientsSolution + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                                + name + "!");
                        break;
                    }
                }
                break;
            case "5":
                Progression pr = new Progression();
                selectedTask = pr.getTask();
                logger.info(selectedTask);
                for (i = 1; i <= numOfRepeats; i++) {
                    selectedTaskQuestion = pr.getTaskQuestion();
                    logger.info(selectedTaskQuestion);
                    Scanner clientAnswer = new Scanner(System.in);
                    clientsSolution = clientAnswer.nextLine();
                    logger.info("Your answer: " + clientsSolution);
                    selectedCorrectAnswer = pr.getCorrectAnswer();
                    if (clientsSolution.equals(selectedCorrectAnswer)) {
                        logger.info("Correct!");
                        pr.update();
                    } else {
                        logger.info("'" + clientsSolution + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                                + name + "!");
                        break;
                    }
                }
                break;
            case "6":
                Prime prime = new Prime();
                selectedTask = prime.getTask();
                logger.info(selectedTask);
                for (i = 1; i <= numOfRepeats; i++) {
                    selectedTaskQuestion = prime.getTaskQuestion();
                    logger.info(selectedTaskQuestion);
                    Scanner clientAnswer = new Scanner(System.in);
                    clientsSolution = clientAnswer.nextLine();
                    logger.info("Your answer: " + clientsSolution);
                    selectedCorrectAnswer = prime.getCorrectAnswer();
                    if (clientsSolution.equals(selectedCorrectAnswer)) {
                        logger.info("Correct!");
                        prime.update();
                    } else {
                        logger.info("'" + clientsSolution + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'" + selectedCorrectAnswer + "'" + "." + "\n" + "Let's try again, "
                                + name + "!");
                        break;
                    }
                }
                break;
            case "0":
                logger.info("Exit");
                break;
            default:
                logger.info("unexpected number");
        }
        if (i == endOfRepeats) {
            logger.info("Congratulations, " + name + "!");
        }
    }
}
