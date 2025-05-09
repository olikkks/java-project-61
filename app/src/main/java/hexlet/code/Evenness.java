package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Evenness {
    public static void evenness() {
        System.out.println("May I have your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + " !" +
                "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");


        String isEven = "";
        String correctAnswer = "";

        int i;
        for (i = 1; i <= 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            Scanner clientAnswer = new Scanner(System.in);
            isEven = clientAnswer.nextLine();

            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (isEven.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                //System.out.println("'" + isEven+ "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + "." + "\n" + "Let's try again, " + name + "!");
                break;
            }
        }

        if (i == 4) {
            System.out.println("Congratulation, " + name);
        } else {
            System.out.println("'" + isEven + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + "." + "\n" + "Let's try again, " + name + "!");
        }
    }
}



