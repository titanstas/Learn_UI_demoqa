package pages.demoqa.intercations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class Resizable_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Resizable_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_resizable_page_host = "https://demoqa.com/resizable";
 /*
      Xpath
     */


    /**
     * Текст размера коробки с ограничениями
     *
     */
    public static String text_restrictions_box = "//div[@id='resizableBoxWithRestriction']";

    /**
     * Ползунок для изменения размера коробки с ограничениями
     *
     */
    public static String slider_restrictions_box = text_restrictions_box+"//span[@class='react-resizable-handle react-resizable-handle-se']";





    /**
     * Метод изменения положения ползунка для изменения размера коробки
     * Изменение по оси x и y
     */
    public Resizable_page change_restrictions_box_size(int xOffset, int yOffset  )  {
        WebElement slider_restrictions_box_element = set_element_with_condition("clickable", slider_restrictions_box );



        Actions actions = new Actions(driver);
        actions
                .moveToElement(slider_restrictions_box_element)
                .clickAndHold(slider_restrictions_box_element)
                .moveByOffset(xOffset, yOffset)
                .release()
                .build()
                .perform();

        WebElement text_restrictions_box_element = set_element_with_condition("visible", text_restrictions_box );
       // Assert.assertEquals(text_restrictions_box_element.getAttribute("offsetTop"),yOffset+200 );
       // Assert.assertEquals(text_restrictions_box_element.getAttribute("offsetWidth"),xOffset+200 );

        return  new Resizable_page(driver);
    }
}
