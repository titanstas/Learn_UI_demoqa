package helpers;

import io.restassured.response.Response;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static io.restassured.RestAssured.given;

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

    public static int check_broken_link_by_rest_assured(String urlString) throws IOException {

        int status_code= given()
                .when()
                .get(urlString)
                .then()
                .log().all()
                .extract()
                .statusCode();


        if (status_code >= 400) {
            System.out.println("Broken link found: " + urlString + " (Status Code: " + status_code + ")");
        }
        else {
            System.out.println("Status Code: " + status_code);
        }



        return status_code;
    }
}
