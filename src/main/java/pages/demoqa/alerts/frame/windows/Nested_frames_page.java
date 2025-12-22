package pages.demoqa.alerts.frame.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

public class Nested_frames_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Nested_frames_page(WebDriver driver) {
        super(driver);
    }
    /**
     * Адрес страницы
     */
    public static String demoqa_nested_frames_page_host = "https://demoqa.com/nestedframes";

     /*
      Xpath
     */

    /**
     * Родительский фрейм
     */
    public static String parent_frame = "frame1";

    /**
     * Текст родительского фрейма
     */
    public static String parent_frame_text = "//body";

    /**
     * Детский фрейм
     */
    public static String child_frame = "//iframe[contains(@srcdoc,'<p>Child Iframe</p>')]";

    /**
     * Текст детского фрейма
     */
    public static String child_frame_text = "//p";

    /**
     * Метод отображения текста первого фрейма
     */
    public Nested_frames_page show_parent_frame_text() {

        driver.switchTo().frame(parent_frame);

        WebElement parent_frame_text_element = set_element_with_condition("visible", parent_frame_text);
        System.out.println(parent_frame_text_element.getText());
        Assert.assertEquals(parent_frame_text_element.getText(),"Parent frame");


        return  new Nested_frames_page(driver);
    }

    /**
     * Метод отображения текста первого фрейма
     */
    public Nested_frames_page show_child_frame_text() {

        driver.switchTo().frame(parent_frame);
        WebElement child_frame_element = set_element_with_condition("visible", child_frame);

        driver.switchTo().frame(child_frame_element);

        WebElement child_frame_text_element = set_element_with_condition("visible", child_frame_text);
        System.out.println(child_frame_text_element.getText());
        Assert.assertEquals(child_frame_text_element.getText(),"Child Iframe");


        return  new Nested_frames_page(driver);
    }

}
