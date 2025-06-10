package hexlet.code;

import java.util.logging.*;

public class LoggerConfig {
    private static boolean initialized = false;

    public static void init() {
        if (initialized) return;
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
