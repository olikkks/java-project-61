package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class Greet {

    public static void client() {
        Logger logger = Logger.getLogger(Greet.class.getName());
        logger.info("Welcome to the Brain Games! \nMay I have your name?");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        logger.info("Hello, " + name + "!");
    }
}
