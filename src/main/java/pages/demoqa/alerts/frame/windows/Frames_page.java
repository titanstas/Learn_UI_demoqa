package pages.demoqa.alerts.frame.windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

public class Frames_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Frames_page(WebDriver driver) {
        super(driver);
    }
    /**
     * Адрес страницы
     */
    public static String demoqa_frames_page_host = "https://demoqa.com/frames";

     /*
      Xpath
     */

    /**
     * Первый фрейм
     */
    public static String frame_1 = "frame1";

    /**
     * Текст первого фрейма
     */
    public static String frame_1_text = "//h1[contains(@id,'sampleHeading')]";

    /**
     * Второй фрейм
     */
    public static String frame_2 = "frame2";

    /**
     * Текст второго фрейма
     */
    public static String frame_2_text = "//h1[contains(@id,'sampleHeading')]";

    /**
     * Метод отображения текста первого фрейма
     */
    public Frames_page show_frame_1_text() {

        driver.switchTo().frame(frame_1);

        WebElement frame_1_text_element = set_element_with_condition("visible", frame_1_text );
        System.out.println(frame_1_text_element.getText());



        return  new Frames_page(driver);
    }

    /**
     * Метод отображения текста первого фрейма
     */
    public Frames_page show_frame_2_text() {

        driver.switchTo().frame(frame_2);

        WebElement frame_2_text_element = set_element_with_condition("visible", frame_2_text );
        System.out.println(frame_2_text_element.getText());



        return  new Frames_page(driver);
    }

}
