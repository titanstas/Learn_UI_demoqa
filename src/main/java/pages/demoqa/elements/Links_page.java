package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;
import pages.demoqa.Demoqa_main_page;

import java.util.ArrayList;
import java.util.List;

public class Links_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Links_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Адрес страницы
     */
    public static String demoqa_links_page_host = "https://demoqa.com/links";

    /**
     * Ссылка на главную страницу (Home)
     */
    public static String main_page_link = "//a[contains(@id,'simpleLink')]";



    /**
     * Метод перехода по ссылке на главную страницу (Home)
     */
    public Demoqa_main_page goto_main_page_link ()
    {
        WebElement element_link = set_element_with_condition("visible", main_page_link );
        element_link.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        return  new Demoqa_main_page(driver);
    }
}
