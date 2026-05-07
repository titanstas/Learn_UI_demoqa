package pages.demoqa.widgets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import java.util.List;

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
    public static String select_value_list = "//input[@id= 'react-select-2-input']";

    /**
     *  Элемент всплывающего списка Select Value c изменяющимся xpath с выбором элемента по его тексту
     */
    public static String select_value_list_option = "//div[@role= 'listbox']//*[text()='%s']";

    /**
     *  Всплывающий список Select One
     */
    public static String select_one_list = "//input[@id= 'react-select-3-input']";


    /**
     *  Элемент всплывающего списка Select One c изменяющимся xpath с выбором элемента по его тексту
     */
    public static String select_one_list_option = "//div[@id= 'react-select-3-listbox']//*[text()='%s']";


    /**
     *  Всплывающий список Old Style Select Menu
     */
    public static String old_style_select_menu_list = "//select[@id= 'oldSelectMenu']";

    /**
     *  Элемент всплывающего списка Old Style Select Menu c изменяющимся xpath с выбором элемента по его тексту
     */
    public static String old_style_select_menu_list_option = old_style_select_menu_list+"//*[text()='%s']";



    /**
     *  Всплывающий список Multiselect drop down
     */
    public static String multiselect_drop_down_list = "//input[@id= 'react-select-4-input']";

    /**
     *  Элемент всплывающего списка Multiselect drop down c изменяющимся xpath с выбором элемента по его тексту
     */
    public static String multi_select_drop_down_list_option = "//div[@id= 'react-select-4-listbox']//*[text()='%s']";

    /**
     *  Всплывающий список Standard multi select
     */
    public static String standard_multi_select_list = "//select[@id= 'cars']";

    /**
     *  Элемент всплывающего списка Standard multi select c изменяющимся xpath с выбором элемента по его тексту
     */
    public static String standard_multi_select_list_option = standard_multi_select_list+"//*[text()='%s']";


    /**
     * Метод выбора варианта из всплывающего списка Select Value
     */
    public Select_menu_page chose_element_from_list_select_value(String list_option_text) throws InterruptedException {

        WebElement select_Value_list_element = set_element_with_condition("clickable", select_value_list);
        select_Value_list_element.click();

        Thread.sleep(1000);

        WebElement select_Value_list_option_element = set_element_with_condition("clickable", select_value_list_option, list_option_text );
        select_Value_list_option_element.click();

        Thread.sleep(1000);

        return new Select_menu_page(driver);
    }

    /**
     * Метод выбора варианта из всплывающего списка Select One
     */
    public Select_menu_page chose_element_from_list_select_one(String list_option_text) throws InterruptedException {

        WebElement select_one_list_element = set_element_with_condition("clickable", select_one_list);
        select_one_list_element.click();

        Thread.sleep(1000);

        WebElement select_one_list_option_element = set_element_with_condition("clickable", select_one_list_option, list_option_text );
        select_one_list_option_element.click();

        Thread.sleep(1000);

        return new Select_menu_page(driver);
    }

    /**
     * Метод выбора варианта из всплывающего списка Select One
     */
    public Select_menu_page chose_element_from_list_old_style_select_menu(String list_option_text) throws InterruptedException {

        WebElement old_style_select_menu_list_element = set_element_with_condition("clickable", old_style_select_menu_list);
        old_style_select_menu_list_element.click();

        Thread.sleep(1000);

        WebElement old_style_select_menu_list_option_element = set_element_with_condition("clickable", old_style_select_menu_list_option, list_option_text );
        old_style_select_menu_list_option_element.click();

        new Actions(driver).sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(1000);

        return new Select_menu_page(driver);
    }

    /**
     * Метод выбора варианта из всплывающего списка Multiselect drop down
     */
    public Select_menu_page chose_element_from_list_multi_select_drop_down(List<String> list_options_text) throws InterruptedException {

        WebElement multiselect_drop_down_list_element = set_element_with_condition("clickable", multiselect_drop_down_list);
        multiselect_drop_down_list_element.click();

        Thread.sleep(1000);

        for (String s : list_options_text) {


            WebElement multi_select_drop_down_list_option_element =
                    set_element_with_condition("clickable", multi_select_drop_down_list_option, s);
            multi_select_drop_down_list_option_element.click();

        }

        new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();

        Thread.sleep(1000);

        return new Select_menu_page(driver);
    }

    /**
     * Метод выбора варианта из всплывающего списка Multiselect drop down
     */
    public Select_menu_page chose_element_from_list_standard_multi_select(List<String> list_options_text) throws InterruptedException {


        new Actions(driver).sendKeys(Keys.SHIFT).clickAndHold().build().perform();


        for (int i = 0; i < list_options_text.size(); i++) {


            WebElement standard_multi_select_list_option_element =
                    set_element_with_condition("clickable", standard_multi_select_list_option, list_options_text.get(i));
            standard_multi_select_list_option_element.click();

        }

        new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();

        Thread.sleep(1000);

        return new Select_menu_page(driver);
    }
}
