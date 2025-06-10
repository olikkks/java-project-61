package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

import static hexlet.code.Cli.client;
import static hexlet.code.Engine.engine;

public class App {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        LoggerConfig.init();

        logger.info("""
                Please enter the game number and press Enter.\s
                1 - Greet\s
                2 - Even\s
                3 - Calc\s
                4 - GCD\s
                5 - Progression\s
                6 - Prim\s
                0 - Exit""");
        Scanner gameNumber = new Scanner(System.in);
        String gameNum = gameNumber.nextLine();

        logger.info("Your choice: " + gameNum);

        logger.info("Welcome to the Brain Games! \nMay I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        client(name);
        engine(gameNum, name);
    }
}
