package hexlet.code;

public class Randoms {
    public static int generateRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
