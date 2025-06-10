package hexlet.code;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LoggerConfig {
    private static boolean initialized = false;

    public static void init() {
        if (initialized) {
            return;
        }
        Logger rootLogger = Logger.getLogger("");
        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });
        rootLogger.addHandler(handler);
        initialized = true;
    }
}
