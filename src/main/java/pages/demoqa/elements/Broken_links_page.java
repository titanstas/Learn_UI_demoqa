package pages.demoqa.elements;

import helpers.Broken_Image_Checker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.demoqa.Demoqa_main_page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Broken_links_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Broken_links_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_broken_links_page_host = "https://demoqa.com/broken";

    /**
     * Ссылка на валидную картинку
     */
    public static String valid_image_link = "//div/img[contains(@src,'/images/Toolsqa.jpg')]";

    /**
     * Ссылка на сломанную картинку
     */
    public static String broken_image_link = "//div/img[contains(@src,'/images/Toolsqa_1.jpg')]";


    /**
     * Метод проверки валидности изображения (Валидного)
     */
    public Broken_links_page check_Image_link_valid() throws IOException {
        WebElement element_img = set_element_with_condition("visible", valid_image_link );
        Broken_Image_Checker.check_broken_image(element_img);



        return  new Broken_links_page(driver);
    }

    /**
     * Метод проверки валидности изображения (сломанного)
     */
    public Broken_links_page check_Image_link_broken() throws IOException {
        WebElement element_img = set_element_with_condition("visible", broken_image_link );
        Broken_Image_Checker.check_broken_image(element_img);



        return  new Broken_links_page(driver);
    }
}
