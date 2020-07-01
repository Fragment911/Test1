package main.task5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetService {
    boolean isAllow(String uri) {
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            connection.getResponseCode();
            System.out.println(uri + " success!");
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
