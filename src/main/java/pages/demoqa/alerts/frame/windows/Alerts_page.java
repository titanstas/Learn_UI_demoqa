package pages.demoqa.alerts.frame.windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

public class Alerts_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Alerts_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_alerts_page_host = "https://demoqa.com/alerts";

     /*
      Xpath
     */


    /**
     * Кнопка для отображения алерта
     */
    public static String open_alert_button = "//button[contains(@id,'alertButton')]";

    /**
     * Кнопка для отображения алерта с задержкой
     */
    public static String open_time_alert_button = "//button[contains(@id,'timerAlertButton')]";

    /**
     * Кнопка для отображения поля подтверждения
     */
    public static String open_confirm_box_button = "//button[contains(@id,'confirmButton')]";

    /**
     * Поле для отображения текста после нажатия поля подтверждения
     */
    public static String text_after_click_confirm_box = "//span[contains(@id,'confirmResult')]";

    /**
     * Кнопка для отображения промпта
     */
    public static String open_prompt_button = "//button[contains(@id,'promtButton')]";

    /**
     * Поле для отображения текста после ввода промпта
     */
    public static String text_after_prompt = "//span[contains(@id,'promptResult')]";


    /**
     * Метод отображения и подтверждения алерта
     */
    public Alerts_page open_accept_alert() {
        WebElement open_alert_button_element = set_element_with_condition("clickable", open_alert_button );
        open_alert_button_element.click();

        Assert.assertTrue(element_have_condition("alertIsPresent",""));


        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertTrue(element_have_condition("alertIsNotPresent",""));

        return  new Alerts_page(driver);
    }

    /**
     * Метод отображения и подтверждения алерта
     */
    public Alerts_page open_accept_time_alert() {
        WebElement open_time_alert_button_element = set_element_with_condition("clickable", open_time_alert_button);
        open_time_alert_button_element.click();


        Assert.assertTrue(element_have_condition("alertIsPresent", ""));

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertTrue(element_have_condition("alertIsNotPresent", ""));

        return  new Alerts_page(driver);
    }

    /**
     * Метод отображения и подтверждения поля подтверждения
     */
    public Alerts_page open_accept_confirm_box() {
        WebElement open_confirm_box_button_element = set_element_with_condition("clickable", open_confirm_box_button);
        open_confirm_box_button_element.click();


        Assert.assertTrue(element_have_condition("alertIsPresent", ""));

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertTrue(element_have_condition("alertIsNotPresent", ""));

        WebElement text_after_click_confirm_box_element = set_element_with_condition("visible", text_after_click_confirm_box);
        Assert.assertEquals(text_after_click_confirm_box_element.getText(),"You selected Ok");

        return  new Alerts_page(driver);
    }

    /**
     * Метод отображения и подтверждения поля подтверждения
     */
    public Alerts_page open_insert_in_prompt(String prompt_text) {
        WebElement open_prompt_button_element = set_element_with_condition("clickable", open_prompt_button);
        open_prompt_button_element.click();


        Assert.assertTrue(element_have_condition("alertIsPresent", ""));

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(prompt_text);
        alert.accept();

        Assert.assertTrue(element_have_condition("alertIsNotPresent", ""));

        WebElement text_after_prompt_element = set_element_with_condition("visible", text_after_prompt);
        Assert.assertEquals(text_after_prompt_element.getText(),"You entered "+prompt_text);

        return  new Alerts_page(driver);
    }

}
