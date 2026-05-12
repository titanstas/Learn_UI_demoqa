package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class Sortable_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Sortable_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_sortable_page_host = "https://demoqa.com/sortable";
 /*
      Xpath
     */


    /**
     * Цифра из списка для сортировки по тексту с изменяющимся xpath
     * Может быть One, Two, Three, Four, Five, Six
     */
    public static String number_from_list = "//div[@class='list-group']//div[text() ='%s']";

    /**
     * Цифра из сетки для сортировки по тексту с изменяющимся xpath
     * Может быть One, Two, Three, Four, Five, Six, Seven, Eight, Nine
     */
    public static String number_from_grid = "//div[@class='create-grid']//div[text() ='%s']";

    /**
     * Кнопка списка
     */
    public static String list_button = "//button[@id='demo-tab-list']";

    /**
     * Кнопка сетки
     */
    public static String grid_button = "//button[@id='demo-tab-grid']";



    /**
     * Метод переноса цифры из списка из одной позиции на другую
     */
    public Sortable_page change_number_position_list (String number_source, String number_target)  {
        WebElement list_button_element = set_element_with_condition("clickable", list_button );
        list_button_element.click();

        WebElement number_from_list_source_element = set_element_with_condition("clickable", number_from_list, number_source );

        WebElement number_from_list_target_element = set_element_with_condition("clickable", number_from_list, number_target );



        Actions actions = new Actions(driver);
        actions
                .clickAndHold(number_from_list_source_element)
                .moveToElement(number_from_list_target_element)
                .moveByOffset(0, 5)
                .release(number_from_list_target_element)
                .build()
                .perform();


        return  new Sortable_page(driver);
    }
}
