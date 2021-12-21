package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerWriter {

    public static final String LOG_FILE = "/Users/admin/Desktop/diploma_networkchat/src/logs.txt";

    void logsWrite(String message) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bufferedWriter.write(message + "\n");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


