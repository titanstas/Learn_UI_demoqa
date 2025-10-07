package pages.demoqa.elements;

import data.objects.Text_box_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import static helpers.String_helper.contains_string;

public class Text_box_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Text_box_page(WebDriver driver) {
        super(driver);
    }


    /*
      Xpath
     */

    /**
     * Адрес страницы
     */
    public static String demoqa_text_box_host = "https://demoqa.com/text-box";

    /**
     * Поле ввода полного имени
     */
    public static String full_name_field = "//input[contains(@placeholder, 'Full Name')]";

    /**
     * Результат ввода полного имени
     */
    public static String full_name_result = "//p[contains(@id, 'name')]";

    /**
     * Поле ввода полного Email
     */
    public static String email_field = "//input[contains(@placeholder, 'name@example.com')]";

    /**
     * Результат ввода Email
     */
    public static String email_result = "//p[contains(@id, 'email')]";

    /**
     * Поле ввода адреса текущего проживания
     */
    public static String current_address_field = "//textarea[contains(@placeholder, 'Current Address')]";

    /**
     * Результат ввода адреса текущего проживания
     */
    public static String current_address_result = "//p[contains(@id, 'currentAddress')]";

    /**
     * Поле ввода адреса постоянного проживания
     */
    public static String permanent_address_field = "//textarea[contains(@id, 'permanentAddress')]";

    /**
     * Результат ввода адреса постоянного проживания
     */
    public static String permanent_address_result = "//p[contains(@id, 'permanentAddress')]";

    /**
     * Кнопка Отправить
     */
    public static String submit_button = "//button[contains(@id, 'submit')]";



    /**
     * Метод ввода полного имени
     */
    public Text_box_page insert_full_name (String full_name)
    {
        WebElement full_name_element = set_element_with_condition("visible",full_name_field);
        full_name_element.sendKeys(full_name);

        return  new Text_box_page(driver);
    }

    /**
     * Метод ввода email
     */
    public Text_box_page insert_email (String email)
    {
        WebElement email_element = set_element_with_condition("visible",email_field);
        email_element.sendKeys(email);

        return  new Text_box_page(driver);
    }

    /**
     * Метод ввода адреса текущего проживания
     */
    public Text_box_page insert_current_address (String current_address)
    {
        WebElement current_address_element = set_element_with_condition("visible",current_address_field);
        current_address_element.sendKeys(current_address);

        return  new Text_box_page(driver);
    }

    /**
     * Метод ввода адреса постоянного проживания
     */
    public Text_box_page insert_permanent_address (String permanent_address)
    {
        WebElement permanent_address_element = set_element_with_condition("visible",permanent_address_field);
        permanent_address_element.sendKeys(permanent_address);

        return  new Text_box_page(driver);
    }

    /**
     * Метод нажатия кнопки Отправить
     */
    public Text_box_page click_submit_button ()
    {
        WebElement submit_button_element = set_element_with_condition("visible",submit_button);
        submit_button_element.click();

        return  new Text_box_page(driver);
    }

    /**
     * Метод заполнения и отправки формы
     * Ассерты проверяют, что вводимые данные совпадают с отображенными в блоке
     */
    public Text_box_page fill_and_submit (Text_box_object object)
    {
        if (object.getFull_name()!=null) {
            insert_full_name(object.getFull_name());
        }
        if (object.getEmail()!=null) {
            insert_email(object.getEmail());
        }
        if (object.getCurrent_address()!=null) {
            insert_current_address(object.getCurrent_address());
        }
        if (object.getPermanent_address()!=null) {
            insert_permanent_address(object.getPermanent_address());
        }
        click_submit_button();

        WebElement full_name_result_element =set_element_with_condition("visible",full_name_result);
        WebElement email_result_element = set_element_with_condition("visible",email_result);
        WebElement current_address_result_element = set_element_with_condition("visible",current_address_result);
        WebElement permanent_address_result_element = set_element_with_condition("visible",permanent_address_result);



        Assert.assertEquals(
                contains_string(full_name_result_element.getText(),object.getFull_name()),
                object.getFull_name()

        );

        Assert.assertEquals(
                contains_string(email_result_element.getText(),object.getEmail()),
                object.getEmail()
        );

        Assert.assertEquals(
                contains_string(current_address_result_element.getText(),object.getCurrent_address()),
                object.getCurrent_address()
        );

        Assert.assertEquals(
                contains_string(permanent_address_result_element.getText(),object.getPermanent_address()),
                object.getPermanent_address()
        );



        return  new Text_box_page(driver);
    }
}
