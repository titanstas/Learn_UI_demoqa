package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import static helpers.String_helper.contains_string;

public class Tabs_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Tabs_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_tabs_page_host = "https://demoqa.com/tabs";

     /*
      Xpath
     */

    /**
     * Вкладка What
     */
    public static String what_tab= "//button[@id= 'demo-tab-what']";

    /**
     * Контент вкладки What
     */
    public static String what_content= "//div[@id= 'demo-tabpane-what']/p";

    /**
     * Вкладка Origin
     */
    public static String origin_tab= "//button[@id= 'demo-tab-origin']";

    /**
     * Контент вкладки Origin
     */
    public static String origin_content= "//div[@id= 'demo-tabpane-origin']/p";

    /**
     * Вкладка Use
     */
    public static String use_tab= "//button[@id= 'demo-tab-use']";

    /**
     * Контент вкладки Use
     */
    public static String use_content= "//div[@id= 'demo-tabpane-use']/p";

    /**
     * Метод проверки наличия текста из вкладки What
     */
    public Tabs_page what_tab_get_text() {



        WebElement tab_element = set_element_with_condition("clickable", what_tab);
        tab_element.click();

        WebElement content_element = set_element_with_condition("visible", what_content);
        String part_of_content_element_text = contains_string( content_element.getText(), "Lorem Ipsum");
        Assert.assertEquals(part_of_content_element_text, "Lorem Ipsum");

        return  new Tabs_page(driver);
    }

    /**
     * Метод проверки наличия текста из вкладки Origin
     */
    public Tabs_page origin_tab_get_text() {



        WebElement tab_element = set_element_with_condition("clickable", origin_tab);
        tab_element.click();

        WebElement content_element = set_element_with_condition("visible", origin_content);
        String part_of_content_element_text = contains_string( content_element.getText(), "Contrary to popular belief");
        Assert.assertEquals(part_of_content_element_text, "Contrary to popular belief");

        return  new Tabs_page(driver);
    }

    /**
     * Метод проверки наличия текста из вкладки Use
     */
    public Tabs_page use_tab_get_text() {



        WebElement tab_element = set_element_with_condition("clickable", use_tab);
        tab_element.click();

        WebElement content_element = set_element_with_condition("visible", use_content);
        String part_of_content_element_text = contains_string( content_element.getText(), "It is a long established fact");
        Assert.assertEquals(part_of_content_element_text, "It is a long established fact");

        return  new Tabs_page(driver);
    }

    /**
     * Метод проверки наличия текста из вкладок What, Origin, Use
     */
    public Tabs_page tabs_get_texts() {


        what_tab_get_text();
        origin_tab_get_text();
        use_tab_get_text();

        return  new Tabs_page(driver);
    }


}
