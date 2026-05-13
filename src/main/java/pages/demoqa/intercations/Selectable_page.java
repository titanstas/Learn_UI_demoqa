package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Selectable_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Selectable_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_selectable_page_host = "https://demoqa.com/selectable";
 /*
      Xpath
     */


    /**
     * Сообщение из списка для сортировки по тексту с изменяющимся xpath
     *
     */
    public static String message_from_list = "//div[@id='demo-tabpane-list']//li[text() ='%s']";

    /**
     * Кнопка списка
     */
    public static String list_button = "//button[@id='demo-tab-list']";

    /**
     * Кнопка сетки
     */
    public static String grid_button = "//button[@id='demo-tab-grid']";





    /**
     * Метод выбора сообщения из списка
     */
    public Selectable_page choose_message_from_list (String message_text )  {
        WebElement list_button_element = set_element_with_condition("clickable", list_button );
        list_button_element.click();


        WebElement message_from_list_element = set_element_with_condition("clickable", message_from_list, message_text );
        message_from_list_element.click();


        return  new Selectable_page(driver);
    }
}
