package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

import static helpers.String_helper.contains_string;

public class Tool_tips_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Tool_tips_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_tool_tips_page_host = "https://demoqa.com/tool-tips";

     /*
      Xpath
     */

    /**
     * Кнопка с подсказкой подсказки
     */
    public static String tool_tip_button = "//button[@id= 'toolTipButton']";

    /**
     * Текст подсказки в кнопке
     */
    public static String tool_tip_button_text = "//div[@class= 'tooltip-inner']";




    /**
     * Метод проверки наличия текста из подсказки в кнопке
     */
    public Tool_tips_page get_tool_tip_from_button() {


        WebElement tool_tip_button_element = set_element_with_condition("visible", tool_tip_button);
        new Actions(driver)
                .moveToElement(tool_tip_button_element)
                .clickAndHold(tool_tip_button_element)
                .build()
                .perform();


        WebElement tool_tip_button_text_element = set_element_with_condition("visible", tool_tip_button_text);



        Assert.assertEquals(tool_tip_button_text_element.getText(), "You hovered over the Button");

        //System.out.println(tool_tip_button_text_element.getText());

        return  new Tool_tips_page(driver);
    }
}
