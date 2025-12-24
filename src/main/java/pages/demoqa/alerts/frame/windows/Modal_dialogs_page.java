package pages.demoqa.alerts.frame.windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

public class Modal_dialogs_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Modal_dialogs_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_modal_dialogs_page_host = "https://demoqa.com/modal-dialogs";

     /*
      Xpath
     */


    /**
     * Кнопка для отображения маленького модального окна
     */
    public static String small_modal_button = "//button[contains(@id,'showSmallModal')]";

    /**
     * Текст в маленьком модальном окне
     */
    public static String small_modal_text = "//div[contains(@class,'modal-body')]";

    /**
     * Кнопка закрытия маленького модального окна
     */
    public static String close_small_modal_button = "//button[contains(@id,'closeSmallModal')]";

    /**
     * Кнопка для отображения большого модального окна
     */
    public static String large_modal_button = "//button[contains(@id,'showLargeModal')]";

    /**
     * Текст в большом модальном окне
     */
    public static String large_modal_text = "//div[contains(@class,'modal-body')]/p";

    /**
     * Кнопка закрытия большого модального окна
     */
    public static String close_large_modal_button = "//button[contains(@id,'closeLargeModal')]";




    /**
     * Метод открытия и проверки правильности текста маленького модального окна
     */
    public Modal_dialogs_page open_small_modal() {
        WebElement small_modal_button_element = set_element_with_condition("clickable", small_modal_button );
        small_modal_button_element.click();

        WebElement small_modal_text_element = set_element_with_condition("visible", small_modal_text );
        Assert.assertEquals(small_modal_text_element.getText(),"This is a small modal. It has very less content");



        return  new Modal_dialogs_page(driver);
    }

    /**
     * Метод закрытия маленького модального окна
     */
    public Modal_dialogs_page close_small_modal() {
        WebElement close_small_modal_button_element = set_element_with_condition("clickable", close_small_modal_button );
        close_small_modal_button_element.click();

        Assert.assertTrue(element_have_condition("invisible", small_modal_text));


        return  new Modal_dialogs_page(driver);
    }

    /**
     * Метод открытия, проверки правильности текста и закрытия маленького модального окна
     */
    public Modal_dialogs_page open_close_small_modal() {
        open_small_modal();
        close_small_modal();


        return  new Modal_dialogs_page(driver);
    }


    /**
     * Метод открытия и проверки правильности текста большого модального окна
     */
    public Modal_dialogs_page open_large_modal() {
        WebElement large_modal_button_element = set_element_with_condition("clickable", large_modal_button );
        large_modal_button_element.click();

        WebElement large_modal_text_element = set_element_with_condition("visible", large_modal_text );
        Assert.assertEquals(large_modal_text_element.getText(), "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");



        return  new Modal_dialogs_page(driver);
    }

    /**
     * Метод закрытия маленького модального окна
     */
    public Modal_dialogs_page close_large_modal() {
        WebElement close_large_modal_button_element = set_element_with_condition("clickable", close_large_modal_button );
        close_large_modal_button_element.click();

        Assert.assertTrue(element_have_condition("invisible", large_modal_text));


        return  new Modal_dialogs_page(driver);
    }

    /**
     * Метод открытия, проверки правильности текста и закрытия маленького модального окна
     */
    public Modal_dialogs_page open_close_large_modal() {
        open_large_modal();
        close_large_modal();


        return  new Modal_dialogs_page(driver);
    }



}
