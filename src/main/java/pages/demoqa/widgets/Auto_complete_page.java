package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class Auto_complete_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Auto_complete_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_auto_complete_page_host = "https://demoqa.com/auto-complete";

     /*
      Xpath
     */

    /**
     * Поле для ввода различных цветов
     */
    public static String multiple_color_names_field = "//div[contains(@id, 'autoCompleteMultiple')]//div[contains(@class, 'auto-complete__input')]";

    /**
     * Вариант цвета из всплывающего списка различных цветов (нумеруется с 0)
     */
    public static String color_from_list_in_multiple_color_names = "//div[contains(@id, 'react-select-2-option-%s')]";

    /**
     * Выбранные цвета в поле для ввода различных цветов
     */
    public static String chosen_color_in_multiple_color_names_field = "//div[contains(@class, 'css-12jo7m5 auto-complete__multi-value__label')]";



    /**
     * Выбрать цвет в поле для ввода различных цветов
     * Нужно указать цвет и его номер в выпадающем списке(если печатать цвет полностью, то, это 0)
     * Нумерация начинается с 0
     */
    public Auto_complete_page type_color_in_multiple_color_names(String color, String number_on_list) {


        WebElement multiple_color_names_field_element = set_element_with_condition("visible", multiple_color_names_field);
        multiple_color_names_field_element.sendKeys(color);

        WebElement color_element = set_element_with_condition("visible", color_from_list_in_multiple_color_names, number_on_list);
        multiple_color_names_field_element.click();

        List<WebElement> chosen_colors = set_elements_with_condition("visible",chosen_color_in_multiple_color_names_field);
        List<WebElement> input_colors_from_chosen_colors = chosen_colors.stream().filter(x->x.getText().toLowerCase().contains(color)).toList();

        Assert.assertTrue(input_colors_from_chosen_colors.contains(color));

        return  new Auto_complete_page(driver);
    }
}
