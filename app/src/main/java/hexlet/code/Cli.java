package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void client() {
        System.out.println("May I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
