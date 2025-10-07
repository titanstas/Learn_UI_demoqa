package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Elements_main_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Elements_main_page(WebDriver driver) {
        super(driver);
    }

    /*
      Xpath
     */

    /**
     * Адрес страницы
     */
    public static String demoqa_elements_host = "https://demoqa.com/elements";
}
