package pages.demoqa.widgets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;
import java.util.List;

public class Slider_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Slider_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_slider_page_host = "https://demoqa.com/slider";

     /*
      Xpath
     */

    /**
     * Слайдер
     */
    public static String slider_field = "//input[@id= 'slider']";

    /**
     * Кружок слайдера
     */
    public static String slider_circle_field = "//div[@class= 'range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']";




    /**
     * Метод выбора значения слайдера
     * Базовое значение слайдера 25
     * Для выбора конкретного варианта сначала устанавливаем значение на 0, потом устанавливаем на искомое от 0 до 100
     */
    public Slider_page chose_slider_value(String value) {


        WebElement slider_field_element = set_element_with_condition("visible", slider_field);

        for (int i = 0; i < 25; i++) {
            slider_field_element.sendKeys(Keys.ARROW_LEFT);
        }

        for (int i = 0; i < Integer.parseInt(value); i++) {
            slider_field_element.sendKeys(Keys.ARROW_RIGHT);
        }

        Assert.assertEquals(slider_field_element.getAttribute("value"), value);


        return  new Slider_page(driver);


    }

    /**
     * Метод выбора значения слайдера
     * Можно выбрать значение от 0 до 100 на слайдере, что соответствует значению от - 50 до 50 аргумента move_offset_value
     * Точное значение пикселей от -382 до 384
     */
    public Slider_page chose_slider_value_2(String move_offset_value)  {


        WebElement slider_field_element = set_element_with_condition("visible", slider_field);

        Actions move = new Actions(driver);

       int move_offset_value_int= (int) (Double.parseDouble(move_offset_value) *7.68);

        move
                .moveToElement(slider_field_element)
                .clickAndHold(slider_field_element)
                .moveByOffset(move_offset_value_int, 0)
                .release()
                .build().perform();


        Assert.assertEquals(slider_field_element.getAttribute("value"), String.valueOf(Integer.parseInt(move_offset_value)+50));


        return  new Slider_page(driver);
    }
}
