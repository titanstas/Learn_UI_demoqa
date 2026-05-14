package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

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
     * Цифра из сетки для сортировки по тексту с изменяющимся xpath
     * Может быть One, Two, Three, Four, Five, Six, Seven, Eight, Nine
     */
    public static String number_from_grid = "//div[@id='demo-tabpane-grid']//li[text() ='%s']";

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
    public Selectable_page choose_messages_from_list(List <String> messages_text  )  {
        WebElement list_button_element = set_element_with_condition("clickable", list_button );
        list_button_element.click();

        for (int i = 0; i < messages_text.size(); i++) {
            WebElement message_from_list_element = set_element_with_condition("clickable", message_from_list, messages_text.get(i) );
            message_from_list_element.click();
        }

        return  new Selectable_page(driver);
    }

    /**
     * Метод выбора цифр из сетки
     * Цифры могут быть One, Two, Three, Four, Five, Six, Seven, Eight, Nine
     */
    public Selectable_page choose_numbers_from_grid(List <String> numbers_text  )  {
        WebElement grid_button_element = set_element_with_condition("clickable", grid_button );
        grid_button_element.click();

        for (int i = 0; i < numbers_text.size(); i++) {
            WebElement number_from_grid_element = set_element_with_condition("clickable", number_from_grid, numbers_text.get(i));
            number_from_grid_element.click();
        }

        return  new Selectable_page(driver);
    }
}
