package helpers;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Broken_Image_Checker {


    public static int check_broken_image(WebElement image) throws IOException {

        String imageUrl = image.getAttribute("src");
        int statusCode = 0;
        if (imageUrl != null && !imageUrl.isEmpty()) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                connection.setRequestMethod("HEAD"); // Or "GET"
                connection.connect();
                statusCode = connection.getResponseCode();

                if (statusCode != 200) {
                    System.out.println("Broken image found: " + imageUrl + " (Status Code: " + statusCode + ")");
                }
                else {
                    System.out.println("Status Code: " + statusCode);
                }
            } catch (IOException e) {
                System.out.println("Error checking image: " + imageUrl + " - " + e.getMessage());
            }
        }
        return statusCode;
    }
}
