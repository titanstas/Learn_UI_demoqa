package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Upload_download_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Upload_download_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Адрес страницы
     */
    public static String demoqa_upload_download_host = "https://demoqa.com/upload-download";


     /*
      Xpath
     */

    /**
     *  Кнопка Download
     */
    public static String file_path = "//a[contains(@id, 'downloadButton')]";


    /**
     *  директория для хранения файла
     */
    public static String file_directory ="D:\\files\\";

    /**
     *  Метод загрузки и чтения данных файла, проверяет каждую секунду загрузился ли файл
     */

    public Upload_download_page download_and_check_file() {
        //Нажатие на кнопку для загрузки файла
        WebElement button = set_element_with_condition("visible",file_path);
        button.click();

        //Название файла
        String file_name =button.getAttribute("download");
        //Время секунд без файла
        int seconds_without_file = 0;
        //Путь к директории
        Path download_file_directory= Paths.get(file_directory);
        //Путь к файлу
        Path download_file_path = Paths.get(file_directory+file_name);


        //Создание директории для хранения файла, если ее нет
        if (!Files.exists(download_file_directory)) {
            try {
                Files.createDirectory(download_file_directory);
            } catch (IOException e) {
                System.out.println("Не создается директория");
            }
        }


        // Цикл для проверки, что файл появился
        while (!Files.exists(download_file_path))
        {
            try {
                Thread.sleep(1000);
                seconds_without_file++;
            }
            catch (InterruptedException e) {e.printStackTrace();}

            System.out.println("Файла нет "+ seconds_without_file+ " секунд");

            if (seconds_without_file>10) {
                System.out.println("Файла "+file_name+" нет в директории "+file_directory);
                break;
            }
        }
        Assert.assertTrue(Files.exists(download_file_path));

            return new Upload_download_page(driver);
    }


}
