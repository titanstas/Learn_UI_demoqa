package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.HashMap;


public class Drivers {
    /**
     * Метод для выбора драйвера хром и использования хрома для тетирования и драйвера для него
     */
    public static WebDriver Setdriver () {
        //Установить директорию для загрузки файла
        String downloadFilepath = "D:\\files";
        HashMap<String, String> chromePrefs = new HashMap<String, String>();
        chromePrefs.put("download.default_directory", downloadFilepath);



        ChromeOptions options = new ChromeOptions();

        // Применить опцию директории для загрузки файла
        options.setExperimentalOption("prefs", chromePrefs);

        // Применить опцию местоположения exe файла хром
        options.setBinary("D:\\ChromeDriver\\Chrome\\chrome-win64\\chrome.exe");

        // Установить системную переменную, которая показывает место хранения хромдрайвера
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        //D:\ChromeDriver\chromedriver-win64\chromedriver.exe



        WebDriver  driver = new ChromeDriver(options);

        return driver;
    }
}
