package hexlet.code;
import hexlet.code.games.*;

public interface GameTaskAndCorrectAnswer {
    String getTask();
    String getSelectedTaskQuestion();
    String getCorrectAnswer();
    void update();
}
