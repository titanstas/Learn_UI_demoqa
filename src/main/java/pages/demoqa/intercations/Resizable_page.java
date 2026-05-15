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
     * Текст размера коробки без ограничений
     *
     */
    public static String text_no_restrictions_box = "//div[@id='resizable']";

    /**
     * Ползунок для изменения размера коробки с ограничениями
     *
     */
    public static String slider_restrictions_box = text_restrictions_box+"//span[@class='react-resizable-handle react-resizable-handle-se']";

    /**
     * Ползунок для изменения размера коробки без  ограничений
     *
     */
    public static String slider_no_restrictions_box = text_no_restrictions_box+"//span[@class='react-resizable-handle react-resizable-handle-se']";





    /**
     * Метод изменения положения ползунка для изменения размера коробки с ограничениями
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
        Assert.assertEquals(text_restrictions_box_element.getSize().getHeight(),yOffset+200 );
        Assert.assertEquals(text_restrictions_box_element.getSize().getWidth(),xOffset+200 );

        return  new Resizable_page(driver);
    }

    /**
     * Метод изменения положения ползунка для изменения размера коробки без ограничений
     * Изменение по оси x и y
     */
    public Resizable_page change_no_restrictions_box_size(int xOffset, int yOffset  )  {
        WebElement slider_no_restrictions_box_element = set_element_with_condition("clickable", slider_no_restrictions_box );



        Actions actions = new Actions(driver);
        actions
                .moveToElement(slider_no_restrictions_box_element)
                .clickAndHold(slider_no_restrictions_box_element)
                .moveByOffset(xOffset, yOffset)
                .release()
                .build()
                .perform();

        WebElement text_no_restrictions_box_element = set_element_with_condition("visible", text_no_restrictions_box );
        Assert.assertEquals(text_no_restrictions_box_element.getSize().getHeight(),yOffset+200 );
        Assert.assertEquals(text_no_restrictions_box_element.getSize().getWidth(),xOffset+200 );

        return  new Resizable_page(driver);
    }
}
