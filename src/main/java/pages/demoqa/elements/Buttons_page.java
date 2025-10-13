package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class Buttons_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Buttons_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_buttons_page_host = "https://demoqa.com/buttons";

    /**
     * Кнопка Double Click Me
     */
    public static String double_click_me_button = "//button[contains(@id, 'doubleClickBtn')]";

    /**
     * Кнопка Right Click Me
     */
    public static String right_click_me_button = "//button[contains(@id, 'rightClickBtn')]";

    /**
     * Кнопка Click Me
     */
    public static String click_me_button = "//button[text() ='Click Me']";




    /**
     * Метод нажатия на кнопку Double Click Me
     */
    public Buttons_page press_double_click_me_button ()
    {
        WebElement element_button = set_element_with_condition("clickable", double_click_me_button );
        Actions actions = new Actions(driver);
        actions.doubleClick(element_button).perform();

        return  new Buttons_page(driver);
    }

    /**
     * Метод нажатия на кнопку Right Click Me
     */
    public Buttons_page press_right_click_me_button ()
    {
        WebElement element_button = set_element_with_condition("clickable", right_click_me_button );
        Actions actions = new Actions(driver);
        actions.contextClick(element_button).perform();

        return  new Buttons_page(driver);
    }

    /**
     * Метод нажатия на кнопку  Click Me
     */
    public Buttons_page press_click_me_button ()
    {
        WebElement element_button = set_element_with_condition("clickable", click_me_button );
        element_button.click();

        return  new Buttons_page(driver);
    }

}
