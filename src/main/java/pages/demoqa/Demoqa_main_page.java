package pages.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.demoqa.elements.Elements_main_page;

public class Demoqa_main_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Demoqa_main_page(WebDriver driver) {
        super(driver);
    }

     /*
      Xpath
     */

    /**
     * Адрес страницы
     */
    public static String demoqa_host = "https://demoqa.com/";

    /**
     * Раздел elements
     */
    public static String demoqa_section_elements = "//h5[contains(text(),'Elements')]";

    /**
     * Раздел forms
     */
    public static String demoqa_section_forms = "//h5[contains(text(),'Forms')]";

    /**
     * Раздел Alerts, Frame & Windows
     */
    public static String demoqa_section_alerts_frame_windows= "//h5[contains(text(),'Alerts, Frame & Windows')]";

    /**
     * Раздел Widgets
     */
    public static String demoqa_section_widgets = "//h5[contains(text(),'Widgets')]";

    /**
     * Раздел Interactions
     */
    public static String demoqa_section_interactions = "//h5[contains(text(),'Interactions')]";


    /*
    Методы
    */


    /**
     * Метод перехода в раздел Elements
     */
    public Elements_main_page goto_elements_page()
    {
        WebElement page_link = set_element_with_condition("visible",demoqa_section_elements);
        page_link.click();

        return  new Elements_main_page(driver);
    }


}
