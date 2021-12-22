package server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ServerService {

    private static final String SETTING_FILE =
            "/Users/admin/Desktop/diploma_networkchat/src/main/resources/settings.txt";
    private static final int DEFAULT_PORT = 8000;

    public static int getPort() {
        int port = DEFAULT_PORT;
        try (BufferedReader br = new BufferedReader(new FileReader(SETTING_FILE))) {

           String[] arr =  br.readLine().split("=");
           port = Integer.parseInt(arr[1]);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return port;
    }

}
