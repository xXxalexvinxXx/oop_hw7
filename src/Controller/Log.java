package Controller;

import java.io.IOException;
import java.util.logging.*;

public class Log {
    private static final Logger logger = Logger.getLogger("Calc");

    public static void initiateLog() throws IOException {
        FileHandler fh;

        try {

            fh = new FileHandler("MyLog.log", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}