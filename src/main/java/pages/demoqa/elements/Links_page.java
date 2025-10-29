package pages.demoqa.elements;

import helpers.HttpStatusChecker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import pages.BasePage;
import pages.demoqa.Demoqa_main_page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static helpers.String_helper.contains_string;

public class Links_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Links_page(WebDriver driver) {
        super(driver);
    }
/*
      Xpath
     */

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
     * Текст отображенный после нажатия на апи ссылку
     */
    public static String api_click_text = "//p[contains(@id,'linkResponse')]";

    /**
     * Ссылка на апи запрос Created
     */
    public static String link_api_created = "//a[contains(@id,'created')]";

    /**
     * Ссылка на апи запрос Created
     */
    public static String link_api_no_content = "//a[contains(@id,'no-content')]";




/*
URL адреса апи запросов
     */


    /**
     * URL апи запроса Created
     */
    public static String url_api_created = "https://demoqa.com/created";

    /**
     * URL апи запроса no content
     */
    public static String url_api_no_content = "https://demoqa.com/no-content";


/*
Статус коды апи запросов
     */

    /**
     * Код апи запроса Created
     */
    public static String status_api_created = "201";

    /**
     * Код апи запроса no_content
     */
    public static String status_api_no_content = "204";




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
    public Links_page click_link_api_created () throws IOException {
        WebElement element_link = set_element_with_condition("visible", link_api_created );
        element_link.click();
        WebElement text = set_element_with_condition("visible", api_click_text );

        Assert.assertEquals(contains_string(text.getText(),status_api_created),status_api_created);
        Assert.assertEquals(HttpStatusChecker.getStatusCode(url_api_created),Integer.parseInt(status_api_created));

        return  new Links_page(driver);
    }

    /**
     * Метод нажатия на ссылку no content
     */
    public Links_page click_link_api_no_content () throws IOException {
        WebElement element_link = set_element_with_condition("visible", link_api_no_content );
        element_link.click();
        WebElement text = set_element_with_condition("visible", api_click_text );

        Assert.assertEquals(contains_string(text.getText(),status_api_no_content),status_api_no_content);
        Assert.assertEquals(HttpStatusChecker.getStatusCode(url_api_no_content),Integer.parseInt(status_api_no_content));

        return  new Links_page(driver);
    }

    /**
     * Метод нажатия на ссылку no content
     */
    public Links_page click_link_api_no_content_with_rest_assured () throws IOException {
        WebElement element_link = set_element_with_condition("visible", link_api_no_content );
        element_link.click();
        WebElement text = set_element_with_condition("visible", api_click_text );

        Assert.assertEquals(contains_string(text.getText(),status_api_no_content),status_api_no_content);
        Assert.assertEquals(HttpStatusChecker.getStatusCode_by_rest_assured(url_api_no_content),Integer.parseInt(status_api_no_content));

        return  new Links_page(driver);
    }
}
