package logger;

import java.util.Date;

public class Logger {

    private static Logger logger;

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {

    }

    private LoggerWriter loggerWriter = new LoggerWriter();

    public void log(String message) {

        loggerWriter.logsWrite(new Date() + ": " + message);
    }

}
