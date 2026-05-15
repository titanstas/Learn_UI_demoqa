package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

public class Droppable_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Droppable_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_droppable_page_host = "https://demoqa.com/droppable";
 /*
      Xpath
     */

    /**
     * Вкладка Simple
     *
     */
    public static String simple_tab = "//button[@data-rr-ui-event-key='simple']";


    /**
     * Блок для перетаскивания
     *
     */
    public static String drag_block = "//div[@id='draggable']";

    /**
     * Блок для бросания
     *
     */
    public static String drop_block = "//div[@id='droppable']";

    /**
     * Метод изменения положения ползунка для изменения размера коробки с ограничениями
     * Изменение по оси x и y
     */
    public Resizable_page drag_n_drop_simple( )  {
        WebElement simple_tab_element = set_element_with_condition("clickable", simple_tab );
        simple_tab_element.click();


        WebElement drag_block_element = set_element_with_condition("clickable", drag_block );
        WebElement drop_block_element = set_element_with_condition("clickable", drop_block );


        Actions actions = new Actions(driver);
        actions
                .moveToElement(drag_block_element)
                .clickAndHold(drag_block_element)
                .moveToElement(drop_block_element)
                .moveByOffset(0,5)
                .release()
                .build()
                .perform();


        return  new Resizable_page(driver);
    }
}
