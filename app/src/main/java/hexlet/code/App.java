package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {

    public static void main(String[] args) {

        System.out.println("""
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

        System.out.println("Your choice: " + gameNum);

        switch (gameNum) {
            case "1":
                Greet.client();
                break;
            case "2":
                Even.evenness();
                break;
            case "3":
                Calc.calculate();
                break;
            case "4":
                GCD.greatestComDivisor();
                break;
            case "5":
                Progression.progression();
                break;
            case "6":
                Prime.prime();
                break;
            case "0":
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("Unknown user choice" + gameNum);
        }
    }
}
