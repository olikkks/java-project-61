package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

import hexlet.code.games.Calc;
import hexlet.code.games.Evenness;
import hexlet.code.games.GreatestComDivisor;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
                6 - Prime\s
                0 - Exit""");
        Scanner gameNumber = new Scanner(System.in);
        String gameNum = gameNumber.nextLine();

        logger.info("Your choice: %s".formatted(gameNum));

        switch (gameNum) {
            case "1":
                Cli.client();
                break;
            case "2":
                Evenness.evenness();
                break;
            case "3":
                Calc.calculate();
                break;
            case "4":
                GreatestComDivisor.greatestComDivisor();
                break;
            case "5":
                Progression.progression();
                break;
            case "6":
                Prime.prime();
                break;
            case "0":
                logger.info("Bye bye");
                break;
            default:
                logger.info("Unknown user choice" + gameNum);
        }
    }
}
