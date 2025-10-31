package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import static helpers.String_helper.contains_string;

public class Check_box_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Check_box_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_checkbox_host = "https://demoqa.com/checkbox";

    /*
      Xpath
     */


    /**
     * Кнопка раскрыть/закрыть папку
     */
    public static String expand_collapse_button = "/button[contains(@class, 'rct-collapse rct-collapse-btn')]";

    /**
     * Чекбокс выбора папки
     */
    public static String folder_checkbox = "//span[contains(@class, 'rct-checkbox')]";

    /**
     * Элемент родитель для перехода от папки к другому элементу
     */
    public static String transition_from_folder_to_other_element = "/parent::label/parent::span";

    /**
     * Элемент папки по названию с изменяющимся xpath
     */
    public static String folder_by_name = "//span[contains(text(),'%s')]";

    /**
     * Сообщение, где отображен выбор папок с нажатым чекбоксом
     */
    public static String message_checked_folders = "//div[contains(@class, 'display-result mt-4')]";




    /**
     * Метод раскрытия/закрытия папки по имени
     */
    public Check_box_page expand_collapse_by_name (String name)
    {
        WebElement folder_element_button = set_element_with_condition("visible",folder_by_name+ transition_from_folder_to_other_element +expand_collapse_button, name );
        folder_element_button.click();

        return  new Check_box_page(driver);
    }

    /**
     * Метод выбора папки по имени
     */
    public Check_box_page folder_check (String name)
    {
        WebElement folder_element_button = set_element_with_condition("visible",folder_by_name+ transition_from_folder_to_other_element +folder_checkbox,name );
        folder_element_button.click();

        WebElement element_message_checked_folders = set_element_with_condition("visible",message_checked_folders,name );
        Assert.assertEquals(
                contains_string(element_message_checked_folders.getText(),name.toLowerCase()),
                name.toLowerCase()
        );


        return  new Check_box_page(driver);
    }
}
