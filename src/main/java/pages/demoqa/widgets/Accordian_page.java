package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

public class Accordian_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Accordian_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Адрес страницы
     */
    public static String demoqa_accordian_page_host = "https://demoqa.com/accordian";

     /*
      Xpath
     */

    /**
     * Кнопка раскрытия аккордеона 1 (What is Lorem Ipsum?)
     */
    public static String accordian_1_button = "//button[contains(text(),'What is Lorem Ipsum?')]";

    /**
     * Текст аккордеона 1 (What is Lorem Ipsum?)
     */
    public static String accordian_1_text = accordian_1_button+"/parent::h2//following-sibling::div";



    /**
     * Кнопка раскрытия аккордеона 2 (Where does it come from?)
     */
    public static String accordian_2_button = "//button[contains(text(),'Where does it come from?')]";

    /**
     * Текст аккордеона 2 (Where does it come from?)
     */
    public static String accordian_2_text = accordian_2_button+"/parent::h2//following-sibling::div";

    /**
     * Кнопка раскрытия аккордеона 3 (Where does it come from?)
     */
    public static String accordian_3_button = "//button[contains(text(),'Why do we use it?')]";

    /**
     * Текст аккордеона 3 (Why do we use it?)
     */
    public static String accordian_3_text = accordian_3_button+"/parent::h2//following-sibling::div";




    /**
     * Метод раскрытия и отображения текста аккордеона 1
     */
    public Accordian_page accordian_1_expand_get_text() {



        WebElement accordian_1_button_element = set_element_with_condition("visible", accordian_1_button);
        accordian_1_button_element.click();
        accordian_1_button_element.click();

        WebElement accordian_1_text_element = set_element_with_condition("visible", accordian_1_text);
        System.out.println(accordian_1_text_element.getText());

        return  new Accordian_page(driver);
    }

    /**
     * Метод раскрытия и отображения текста аккордеона 2
     */
    public Accordian_page accordian_2_expand_get_text() {



        WebElement accordian_2_button_element = set_element_with_condition("visible", accordian_2_button);
        accordian_2_button_element.click();

        WebElement accordian_2_text_element = set_element_with_condition("visible", accordian_2_text);
        System.out.println(accordian_2_text_element.getText());

        return  new Accordian_page(driver);
    }

    /**
     * Метод раскрытия и отображения текста аккордеона 3
     */
    public Accordian_page accordian_3_expand_get_text() {



        WebElement accordian_3_button_element = set_element_with_condition("visible", accordian_3_button);
        accordian_3_button_element.click();

        WebElement accordian_3_text_element = set_element_with_condition("visible", accordian_3_text);
        System.out.println(accordian_3_text_element.getText());


        return  new Accordian_page(driver);
    }


}
