package pages.demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

public class Progress_bar_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Progress_bar_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Адрес страницы
     */
    public static String demoqa_slider_page_host = "https://demoqa.com/progress-bar";

     /*
      Xpath
     */

    /**
     * Индикатор выполнения
     */
    public static String progress_bar_field = "//div[@role= 'progressbar']";

    /**
     * Кнопка Старт и Стоп
     */
    public static String start_stop_button = "//button[@id= 'startStopButton']";

    /**
     * Кнопка Перезагрузить
     */
    public static String reset_button = "//button[@id= 'resetButton']";








    /**
     * Метод 100% заполнения индикатор выполнения
     * Доводит значение заполнение индикатора до 100%
     *
     */
    public Progress_bar_page progress_100() {

        WebElement start_stop_button_element = set_element_with_condition("clickable", start_stop_button);
        start_stop_button_element.click();

        WebElement progress_bar_field_element = set_element_with_condition("visible", progress_bar_field);


        progress_bar_field_element.getAttribute("aria-valuenow");

        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .attributeToBe(By.xpath(progress_bar_field),"aria-valuenow", "100")
                );

        Assert.assertEquals(progress_bar_field_element.getAttribute("aria-valuenow"), "100");

        return  new Progress_bar_page(driver);

    }



}
