package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


import org.openqa.selenium.devtools.v139.log.Log;
import org.testng.Assert;
import pages.BasePage;
import pages.demoqa.Demoqa_main_page;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
     * Ссылка на главную страницу обычная (Home)
     */
    public static String main_page_link_simple = "//a[contains(@id,'simpleLink')]";

    /**
     * Ссылка на главную страницу динамическая (Home)
     */
    public static String main_page_link_dynamic = "//a[contains(@id,'dynamicLink')]";

    /**
     * Ссылка на главную страницу динамическая (Home)
     */
    public static String link_api_created = "//a[contains(@id,'created')]";



    /**
     * Метод перехода по ссылке обычной на главную страницу (Home)
     */
    public Demoqa_main_page goto_main_page_link_simple ()
    {
        WebElement element_link = set_element_with_condition("visible", main_page_link_simple );
        element_link.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        return  new Demoqa_main_page(driver);
    }

    /**
     * Метод перехода по ссылке динамической на главную страницу (Home)
     */
    public Demoqa_main_page goto_main_page_link_dynamic ()
    {
        WebElement element_link = set_element_with_condition("visible", main_page_link_dynamic );
        element_link.click();

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        return  new Demoqa_main_page(driver);
    }

    /**
     * Метод нажатия на ссылку created
     */
    public Demoqa_main_page click_link_api_created ()
    {
        WebElement element_link = set_element_with_condition("visible", link_api_created );
        element_link.click();

        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Log.enable());
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("Log Level: " + logEntry.getLevel());
            System.out.println("Log Text: " + logEntry.getText());
            // Further processing of logEntry
        });

        return  new Demoqa_main_page(driver);
    }
}
