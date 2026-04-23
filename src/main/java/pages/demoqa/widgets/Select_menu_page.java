package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

public class Select_menu_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Select_menu_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_select_menu_page_host = "https://demoqa.com/select-menu";

     /*
      Xpath
     */

    /**
     *  Всплывающий список Select Value
     */
    public static String select_Value_list = "//div[@id= 'react-select-2-placeholder']";

    /**
     *  Всплывающий список Select One
     */
    public static String select_one_list = "//div[@id= 'react-select-3-placeholder']";

    /**
     *  Всплывающий список Old Style Select Menu
     */
    public static String old_style_select_menu_list = "//select[@id= 'oldSelectMenu']";

    /**
     *  Всплывающий список Multiselect drop down
     */
    public static String multiselect_drop_down_list = "//div[@id= 'react-select-4-placeholder']";

    /**
     *  Всплывающий список Standard multi select
     */
    public static String standard_multi_select_list = "//select[@id= 'cars']";




    /**
     * Метод выбора варианта из всплывающего списка
     */
    public Select_menu_page chose_element_from_list()  {

        WebElement select_Value_list_element = set_element_with_condition("clickable", select_Value_list);
        select_Value_list_element.click();


        return new Select_menu_page(driver);
    }
}
