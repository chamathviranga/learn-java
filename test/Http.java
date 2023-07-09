package test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Http {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response code: " + responseCode);
    }
}