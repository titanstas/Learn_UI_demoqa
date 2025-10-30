package helpers;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import static io.restassured.RestAssured.given;


public class HttpStatusChecker {

    public static int getStatusCode(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int statusCode = connection.getResponseCode();
        connection.disconnect();
        return statusCode;
    }

    public static int getStatusCode_by_rest_assured(String urlString) throws IOException {

        int status_code= given()
                .when()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .get(urlString)
                .then()
                .log().all()
                .extract().statusCode();

        System.out.println(urlString);
        System.out.println(status_code);

        return status_code;
    }
}
