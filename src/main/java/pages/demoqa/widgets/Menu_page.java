package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

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
    public static String demoqa_menu_page_host = "https://demoqa.com/menu#";

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
     * Кнопка меню Sub Sub Item 1  в меню SUB SUB LIST »
     */
    public static String sub_sub_item_1_button =  sub_list_button+"/parent::li//a[text()= 'Sub Sub Item 1']";

    /**
     * Кнопка меню Sub Sub Item 2  в меню SUB SUB LIST »
     */
    public static String sub_sub_item_2_button =  sub_list_button+"/parent::li//a[text()= 'Sub Sub Item 2']";


    /**
     * Метод нажатия на кнопку в меню Sub Sub Item 1
     */
    public Menu_page press_menu_button_sub_sub_item_1() throws InterruptedException {

        Actions actions = new Actions(driver);


        WebElement main_item_2_button_element = set_element_with_condition("clickable", main_item_2_button);
        main_item_2_button_element.click();

        actions.pause(Duration.ofSeconds(1)).perform();


        WebElement sub_list_button_element = set_element_with_condition("clickable", sub_list_button);
        sub_list_button_element.click();

        actions.pause(Duration.ofSeconds(1)).perform();

        WebElement sub_sub_item_1_button_element = set_element_with_condition("clickable", sub_sub_item_1_button);
        sub_sub_item_1_button_element.click();

        Assert.assertEquals(sub_sub_item_1_button_element.getText(), "Sub Sub Item 1");

        actions.pause(Duration.ofSeconds(1)).perform();

        return  new Menu_page(driver);
    }
}
