package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;


import java.util.HashMap;
import java.util.logging.Level;


public class Drivers {
    /**
     * Метод для выбора драйвера хром и использования хрома для тетирования и драйвера для него
     */
    public static WebDriver Setdriver () {
        //Установить директорию для загрузки файла
        String downloadFilepath = "D:\\files";
        HashMap<String, String> chromePrefs = new HashMap<String, String>();
        chromePrefs.put("download.default_directory", downloadFilepath);



        //Установить сбор логов всех уровней для браузера и сети
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);

        ChromeOptions options = new ChromeOptions();

        // Применить опцию сбора логов
        options.setCapability("goog:loggingPrefs", logPrefs);

        // Применить опцию директории для загрузки файла
        options.setExperimentalOption("prefs", chromePrefs);

        // Применить опцию местоположения exe файла хром
        options.setBinary("D:\\ChromeDriver\\Chrome\\chrome-win64\\chrome.exe");

        // Установить системную переменную, которая показывает место хранения хромдрайвера
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        //D:\ChromeDriver\chromedriver-win64\chromedriver.exe


        return new ChromeDriver(options);
    }
}
