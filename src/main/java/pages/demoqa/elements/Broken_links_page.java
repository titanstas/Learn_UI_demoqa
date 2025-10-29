package pages.demoqa.elements;

import helpers.Broken_Image_Checker;
import helpers.Broken_link_Checker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.IOException;

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
     * Ссылка на валидную ссылку
     */
    public static String valid_link = "//a[text() ='Click Here for Valid Link']";

    /**
     * Ссылка на сломанную ссылку
     */
    public static String broken_link = "//a[text() ='Click Here for Broken Link']";


    /**
     * Метод проверки валидности изображения (Валидного)
     */
    public Broken_links_page check_Image_link_valid() throws IOException {
        WebElement element_img = set_element_with_condition("visible", valid_image_link );
        Broken_Image_Checker.check_broken_image_by_status_code(element_img);



        return  new Broken_links_page(driver);
    }

    /**
     * Метод проверки валидности изображения (сломанного) по статус коду
     */
    public Broken_links_page check_Image_link_broken_by_status_code() throws IOException {
        WebElement element_img = set_element_with_condition("visible", broken_image_link );
        Broken_Image_Checker.check_broken_image_by_status_code(element_img);



        return  new Broken_links_page(driver);
    }

    /**
     * Метод проверки валидности изображения (сломанного) по размеру
     */
    public Broken_links_page check_Image_link_broken_by_naturalWidth() throws IOException {
        WebElement element_img = set_element_with_condition("visible", broken_image_link );
        Broken_Image_Checker.check_broken_image_by_naturalWidth(element_img);


        return  new Broken_links_page(driver);
    }

    /**
     * Метод проверки валидности ссылки (Валидной)
     */
    public Broken_links_page check_link_valid() throws IOException {
        WebElement element_link = set_element_with_condition("visible", valid_link );
        Broken_link_Checker.check_broken_link_by_status_code(element_link);


        return  new Broken_links_page(driver);
    }

    /**
     * Метод проверки валидности ссылки (сломанной) по статус коду
     */
    public Broken_links_page check_link_broken() throws IOException {
        WebElement element_link = set_element_with_condition("visible", broken_link );
        Broken_link_Checker.check_broken_link_by_status_code(element_link);


        return  new Broken_links_page(driver);
    }
}
