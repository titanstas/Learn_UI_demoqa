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
    public static String accordian_1_button = "//div[contains(text(),'What is Lorem Ipsum?')]";

    /**
     * Текст аккордеона 1 (What is Lorem Ipsum?)
     */
    public static String accordian_1_text = "//div[contains(text(),'What is Lorem Ipsum?')]/following-sibling::div";



    /**
     * Кнопка раскрытия аккордеона 2 (Where does it come from?)
     */
    public static String accordian_2_button = "//div[contains(text(),'Where does it come from?')]";

    /**
     * Текст аккордеона 2 (Where does it come from?)
     */
    public static String accordian_2_text = "//div[contains(text(),'Where does it come from?')]/following-sibling::div/div/p[1]";

    /**
     * Кнопка раскрытия аккордеона 3 (Where does it come from?)
     */
    public static String accordian_3_button = "//div[contains(text(),'Why do we use it?')]";

    /**
     * Текст аккордеона 3 (Why do we use it?)
     */
    public static String accordian_3_text = "//div[contains(text(),'Why do we use it?')]/following-sibling::div/div/p";




    /**
     * Метод раскрытия и отображения текста аккордеона 1
     */
    public Accordian_page accordian_1_expand_get_text() {



        WebElement accordian_1_button_element = set_element_with_condition("visible", accordian_1_button);
        accordian_1_button_element.click();
        accordian_1_button_element.click();

        WebElement accordian_1_text_element = set_element_with_condition("visible", accordian_1_text);
        Assert.assertEquals(accordian_1_text_element.getText(),
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );
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
        Assert.assertEquals(accordian_2_text_element.getText(),
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32."
        );
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
        Assert.assertEquals(accordian_3_text_element.getText(), "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
        );

        System.out.println(accordian_3_text_element.getText());


        return  new Accordian_page(driver);
    }


}
