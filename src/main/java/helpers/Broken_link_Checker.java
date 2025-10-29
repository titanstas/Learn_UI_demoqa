package helpers;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Broken_link_Checker {

    public static int check_broken_link_by_status_code(WebElement image) throws IOException {

        String linkUrl = image.getAttribute("href");
        int statusCode = 0;
        if (linkUrl != null && !linkUrl.isEmpty()) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                statusCode = connection.getResponseCode();

                if (statusCode >= 400) {
                    System.out.println("Broken link found: " + linkUrl + " (Status Code: " + statusCode + ")");
                }
                else {
                    System.out.println("Status Code: " + statusCode);

                }
            } catch (IOException e) {
                System.out.println("Error checking link: " + linkUrl + " - " + e.getMessage());
            }
        }
        return statusCode;
    }
}
