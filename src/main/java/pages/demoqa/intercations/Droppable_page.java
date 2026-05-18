package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    public static String simple_tab = "button[@id='droppableExample-tab-simple']";

    /**
     * Вкладка Simple
     *
     */
    public static String accept_tab = "//button[@id='droppableExample-tab-accept']";

    /**
     * Вкладка Prevent Propogation
     *
     */
    public static String prevent_propogation_tab = "//button[@id='droppableExample-tab-preventPropogation']";

    /**
     * Вкладка Revert Draggable
     *
     */
    public static String revert_draggable_tab = "//button[@id='droppableExample-tab-revertable']";



    /**
     * Блок для перетаскивания во вкладке Simple
     *
     */
    public static String drag_block_simple = "//div[@id='draggable']";

    /**
     * Блок для бросания во вкладке Simple
     *
     */
    public static String drop_block_simple = "//div[@id='droppable']";

    /**
     * Блок для перетаскивания Acceptable во вкладке Accept
     *
     */
    public static String drag_block_acceptable_accept = "//div[@id='acceptable']";

    /**
     * Блок для перетаскивания Not Acceptable во вкладке Accept
     *
     */
    public static String drag_block_not_acceptable_accept = "//div[text()='Not Acceptable']";

    /**
     * Блок для бросания Simple во вкладке Accept
     *
     */
    public static String drop_block_accept = "//div[@class='accept-drop-container']/div[@class='drop-box ui-droppable']";





    /**
     * Метод переноса блока перетаскивания в блок бросания во вкладке Simple
     *
     */
    public Droppable_page drag_n_drop_simple( )  {
        WebElement simple_tab_element = set_element_with_condition("clickable", simple_tab );
        simple_tab_element.click();


        WebElement drag_block_element = set_element_with_condition("clickable", drag_block_simple);
        WebElement drop_block_element = set_element_with_condition("clickable", drop_block_simple);


        Actions actions = new Actions(driver);
        actions
                .moveToElement(drag_block_element)
                .clickAndHold(drag_block_element)
                .moveToElement(drop_block_element)
                .moveByOffset(5,5)
                .release()
                .build()
                .perform();

        return  new Droppable_page(driver);
    }



    /**
     * Метод переноса блока перетаскивания в блок бросания во вкладке Simple
     *
     */
    public Droppable_page drag_n_drop_accept( )  {
        WebElement simple_tab_element = set_element_with_condition("clickable", accept_tab );
        simple_tab_element.click();


        WebElement drag_block_acceptable_accept_element = set_element_with_condition("clickable", drag_block_acceptable_accept);
        WebElement drop_block_accept_element = set_element_with_condition("clickable", drop_block_accept);


        Actions actions = new Actions(driver);
        actions
                .moveToElement(drag_block_acceptable_accept_element)
                .clickAndHold(drag_block_acceptable_accept_element)
                .moveToElement(drop_block_accept_element)
                .moveByOffset(5,5)
                .release()
                .build()
                .perform();

        return  new Droppable_page(driver);
    }

    /**
     * Метод переноса блока перетаскивания в блок бросания во вкладке Simple
     *
     */
    public Droppable_page drag_n_drop_not_accept( )  {
        WebElement simple_tab_element = set_element_with_condition("clickable", accept_tab );
        simple_tab_element.click();


        WebElement drag_block_not_acceptable_accept_element = set_element_with_condition("clickable", drag_block_not_acceptable_accept);
        WebElement drop_block_accept_element = set_element_with_condition("clickable", drop_block_accept);


        Actions actions = new Actions(driver);
        actions
                .moveToElement(drag_block_not_acceptable_accept_element)
                .clickAndHold(drag_block_not_acceptable_accept_element)
                .moveToElement(drop_block_accept_element)
                .moveByOffset(5,5)
                .release()
                .build()
                .perform();

        return  new Droppable_page(driver);
    }


}


