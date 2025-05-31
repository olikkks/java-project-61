package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GrstComDivisor;
import hexlet.code.games.Progression;
import hexlet.code.games.Evenness;
import hexlet.code.games.Prime;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. \n"
                + "1 - Greet \n2 - Even \n3 - Calc \n4 - GCD \n5 - Progression \n"
                + "6 - Prim \n0 - Exit");
        Scanner gameNumber = new Scanner(System.in);
        String gameNum = gameNumber.nextLine();
        System.out.println("Your choice: " + gameNum);
        GameTaskAndCorrectAnswer game;
        switch (gameNum) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.client();
                break;
            case "2":
                game = new Evenness();
                Engine.engine(game);
                break;
            case "3":
                game = new Calc();
                Engine.engine(game);
                break;
            case "4":
                game = new GrstComDivisor();
                Engine.engine(game);
                break;
            case "5":
                game = new Progression();
                Engine.engine(game);
                break;
            case "6":
                game = new Prime();
                Engine.engine(game);
                break;
            case "0":
                break;
            default:
                System.out.println("unexpected number");

        }

    }
}
