package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import pages.BasePage;

public class Dynamic_properties_page  extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Dynamic_properties_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_dynamic_properties_host = "https://demoqa.com/dynamic-properties";

    /*
      Xpath
     */


    /**
     * Кнопка меняющая цвет
     */
    public static String color_change_button = "//button[contains(@id, 'colorChange')]";


    /**
     * Кнопка видимая через 5 секунд
     */
    public static String visible_after_5_sec_button = "//button[contains(@id, 'visibleAfter')]";


    /**
     * Метод проверки появления кнопки
     */
    public Dynamic_properties_page check_button_visible()
    {
        Assert.assertTrue(element_have_condition("visible", visible_after_5_sec_button));


        return  new Dynamic_properties_page(driver);
    }

    /**
     * Метод проверки изменения цвета кнопки
     */
    public Dynamic_properties_page check_button_change_color()
    {
        WebElement element_button = set_element_with_condition("visible", color_change_button );

        String button_color=element_button.getCssValue("color");
        String button_color_hex = Color.fromString(button_color).asHex();

        Assert.assertEquals(button_color_hex,"#dc3545");

        return  new Dynamic_properties_page(driver);
    }

}
