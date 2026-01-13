package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Collections;
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
    public static String multiple_color_names_field = "//div[contains(@id, 'autoCompleteMultiple')]//input";

    //div[contains(@id, 'autoCompleteMultiple')]//input
    //div[contains(@id, 'autoCompleteMultiple')]//div[contains(@class, 'auto-complete__value-container')]
    /**
     * Вариант цвета из всплывающего списка различных цветов (нумеруется с 0)
     */
    public static String color_from_list_in_multiple_color_names = "//div[contains(@id, 'react-select-2-option-0')]";

    /**
     * Выбранные цвета в поле для ввода различных цветов
     */
    public static String chosen_colors_in_multiple_color_names_field = "//div[contains(@class, 'css-12jo7m5 auto-complete__multi-value__label')]";



    /**
     * Выбрать цвет в выпадающем списке для различных цветов
     * Нужно указать цвет и его порядковый номер в выпадающем списке
     * Нумерация начинается с 0
     */
    public Auto_complete_page chose_color_in_multiple_color_names_list(String color) {


        WebElement multiple_color_names_field_element = set_element_with_condition("visible", multiple_color_names_field);
        multiple_color_names_field_element.sendKeys(color);

        WebElement color_element = set_element_with_condition("visible", color_from_list_in_multiple_color_names);
        color_element.click();

       // WebElement chosen_color_element = set_element_with_condition("visible",chosen_colors_in_multiple_color_names_field);
        List <WebElement> chosen_colors_elements = set_elements_with_condition("visible",chosen_colors_in_multiple_color_names_field);
        List <String> chosen_colors_elements_sorted =chosen_colors_elements
                .stream()
                .filter(x -> x.getText().toLowerCase().equals(color))
                .map(x -> x.getText().toLowerCase())
                .toList();

        String Chosen_color = chosen_colors_elements_sorted.get(0);

        Assert.assertEquals(Chosen_color, color);

        return  new Auto_complete_page(driver);
    }

    /**
     * Выбрать несколько цветов в выпадающем списке для различных цветов
     * Нужно указать цвета
     * Нумерация начинается с 0
     */
    public Auto_complete_page chose_colors_in_multiple_color_names_list(List<String> colors ) {

        for (String color : colors) {
            chose_color_in_multiple_color_names_list(color);
        }


        List <WebElement> chosen_colors_elements = set_elements_with_condition("visible",chosen_colors_in_multiple_color_names_field);

        List <String> chosen_colors = new ArrayList<>();

        for (WebElement element : chosen_colors_elements) {
            chosen_colors.add(element.getText().toLowerCase());
        }

        //Collections.sort(colors);
        //Collections.sort(chosen_colors);

        Assert.assertEquals(chosen_colors,colors);



        return  new Auto_complete_page(driver);
    }
}
