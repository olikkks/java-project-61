package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n0 - Exit");
        Scanner gameNumber = new Scanner(System.in);
        String gameNum = gameNumber.nextLine();
        System.out.println("Your choice: " + gameNum);
        switch (gameNum) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.client();
                break;
            case "2":
                System.out.println("Welcome to the Brain Games!");
                Evenness.evenness();
                break;
            default:
                System.out.println("unexpected number");

        }
    }
}
