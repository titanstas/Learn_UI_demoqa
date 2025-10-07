package pages.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import static helpers.String_helper.contains_string;

public class Radio_button_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Radio_button_page(WebDriver driver) {
        super(driver);
    }


    /*
      Xpath
     */

    /**
     * Адрес страницы
     */
    public static String demoqa_radio_button_host = "https://demoqa.com/radio-button";

    /**
     * Радио кнопка Yes
     */
    public static String radio_button_yes = "//label[contains(@for, 'yesRadio')]";

    /**
     * Радио кнопка Impressive
     */
    public static String radio_button_impressive = "//label[contains(@for, 'impressiveRadio')]";

    /**
     * Радио кнопка No
     */
    public static String radio_button_no = "//label[contains(@for, 'noRadio')]";

    /**
     * Input элемент в радиокноках
     */
    public static String input_radio_buttons = "/parent::div/input";

    /**
     * Сообщение о выбранной радио кнопке
     */
    public static String message_pressed_button = "//p[contains(@class, 'mt-3')]";


    /**
     * Метод нажатия на радиокнопку Yes
     */
    public Radio_button_page press_radio_button_yes ()
    {
        WebElement element_button = set_element_with_condition("visible",radio_button_yes);
        element_button.click();

        WebElement element_message_pressed_button = set_element_with_condition("clickable",message_pressed_button );
        Assert.assertEquals(
                contains_string(element_message_pressed_button.getText(),"Yes"),
                "Yes"
        );

        return new Radio_button_page(driver);
    }

    /**
     * Метод нажатия на радиокнопку Yes
     */
    public Radio_button_page press_radio_button_yes_2 ()
    {
        WebElement element_button = set_element_with_condition("visible",radio_button_yes);
        element_have_condition("clickable",radio_button_yes);
        element_button.click();

        return new Radio_button_page(driver);
    }

    /**
     * Метод нажатия на радиокнопку Impressive
     */
    public Radio_button_page press_radio_button_impressive()
    {
        WebElement element_button = set_element_with_condition("visible",radio_button_impressive);
        element_button.click();

        WebElement element_message_pressed_button = set_element_with_condition("clickable",message_pressed_button );
        Assert.assertEquals(
                contains_string(element_message_pressed_button.getText(),"Impressive"),
                "Impressive"
        );

        return  new Radio_button_page(driver);
    }

    /**
     * Метод проверки, что радиокнопка NO не нажимается
     */
    public Radio_button_page check_radio_button_no()
    {
     WebElement  radio_button_no_input = set_element(radio_button_no+input_radio_buttons);

        Assert.assertFalse(radio_button_no_input.isEnabled());


        return  new Radio_button_page(driver);
    }
}
//(radio_button_no+input_radio_buttons)