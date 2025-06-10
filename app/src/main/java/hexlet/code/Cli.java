package hexlet.code;

import java.util.logging.Logger;

public class Cli {
    //private static final Logger logger = Logger.getLogger(Cli.class.getName());

    public static void client(String name) {
        Logger logger = Logger.getLogger(Cli.class.getName());
//        logger.setUseParentHandlers(false);
//        ConsoleHandler handler = new ConsoleHandler();
//        handler.setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return record.getMessage() + System.lineSeparator();
//            }
//        });
//        logger.addHandler(handler);

        //logger.info("May I have your name?");

        //System.out.println("May I have your name?");
        //Scanner s = new Scanner(System.in);
        //String name = s.nextLine();
        //System.out.println("Hello, " + name + "!");


        logger.info("Hello, " + name + "!");
    }
}
