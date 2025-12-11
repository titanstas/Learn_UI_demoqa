package pages.demoqa.alerts.frame.windows;

import helpers.Broken_Image_Checker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Browser_windows_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Browser_windows_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Адрес страницы
     */
    public static String demoqa_browser_windows_page_host = "https://demoqa.com/browser-windows";

     /*
      Xpath
     */


    /**
     * Кнопка для открытия новой вкладки
     */
    public static String new_tab_button = "//button[contains(@id,'tabButton')]";

    /**
     * Кнопка для открытия нового окна
     */
    public static String new_window_button = "//button[contains(@id,'windowButton')]";

    /**
     * Кнопка для открытия нового окна с сообщением
     */
    public static String new_window_message_button = "//button[contains(@id,'messageWindowButton')]";

    /**
     * Body нового окна с сообщением
     */
    public static String new_message_window_body = "//body";



    /**
     * Метод перехода на новую вкладку
     */
    public Browser_windows_page go_to_new_tab() {
        WebElement new_tab_button_element = set_element_with_condition("clickable", new_tab_button );
        new_tab_button_element.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/sample");

        return  new Browser_windows_page(driver);
    }

    /**
     * Метод перехода на новое окно
     */
    public Browser_windows_page go_to_new_window() {
        WebElement new_window_button_element = set_element_with_condition("clickable", new_window_button );
        new_window_button_element.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));



        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/sample");

        return  new Browser_windows_page(driver);
    }

    /**
     * Метод перехода на новое окно с сообщением
     */
    public Browser_windows_page go_to_new_window_message() {
        WebElement new_window_message_button_element = set_element_with_condition("clickable", new_window_message_button );
        new_window_message_button_element.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        return  new Browser_windows_page(driver);
    }
}
