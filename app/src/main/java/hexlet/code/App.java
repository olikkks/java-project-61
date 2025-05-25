package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Evenness;

import hexlet.code.Engine;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n3 - Calc \n0 - Exit");
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
            default:
                System.out.println("unexpected number");

        }

    }
}
