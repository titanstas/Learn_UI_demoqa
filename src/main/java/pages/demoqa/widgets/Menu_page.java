package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

public class Menu_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Menu_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_tool_tips_page_host = "https://demoqa.com/menu#";

     /*
      Xpath
     */

    /**
     * Кнопка меню Main Item 1
     */
    public static String main_item_1_button = "//a[text()= 'Main Item 1']";

    /**
     * Кнопка меню Main Item 2
     */
    public static String main_item_2_button = "//a[text()= 'Main Item 2']";

    /**
     * Кнопка меню Main Item 3
     */
    public static String main_item_3_button = "//a[text()= 'Main Item 3']";


    /**
     * Кнопка меню Sub Item в меню Main Item 2 - первая
     */
    public static String sub_item_button_n1 = main_item_2_button+"/parent::li/ul/li[1]/a";

    /**
     * Кнопка меню Sub Item в меню Main Item 2 - вторая
     */
    public static String sub_item_button_n2 = main_item_2_button+"/parent::li/ul/li[2]/a";

    /**
     * Кнопка меню SUB SUB LIST » в меню Main Item 2 -
     */
    public static String sub_list_button =  main_item_2_button+"/parent::li//a[text()= 'SUB SUB LIST »']";


    /**
     * Метод проверки наличия текста из подсказки в кнопке
     */
    public Menu_page get_tool_tip_from_button() {


        WebElement tool_tip_button_element = set_element_with_condition("visible", main_item_1_button);



        return  new Menu_page(driver);
    }
}
