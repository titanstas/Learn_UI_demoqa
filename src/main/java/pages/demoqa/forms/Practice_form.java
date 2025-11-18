package pages.demoqa.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import pages.demoqa.elements.Dynamic_properties_page;

public class Practice_form extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Practice_form(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_practice_form_host = "https://demoqa.com/automation-practice-form";

    /*
      Xpath
     */


    /**
     * Поле ввода имени
     */
    public static String first_name_field = "//input[contains(@placeholder, 'First Name')]";

    /**
     * Поле ввода фамилии
     */
    public static String last_name_field = "//input[contains(@placeholder, 'Last Name')]";

    /**
     * Поле ввода email
     */
    public static String email_field = "//input[contains(@id, 'userEmail')]";

    /**
     * Кнопка выбора мужского пола
     */
    public static String gender_male_button = "//input[contains(@value, 'Male')]";

    /**
     * Кнопка выбора женского пола
     */
    public static String gender_female_button = "//input[contains(@value, 'Female')]";

    /**
     * Кнопка выбора другого пола
     */
    public static String gender_other_button = "//input[contains(@value, 'Other')]";

    /**
     * Поле ввода мобильного телефона (10 цифр)
     */
    public static String mobile_field = "//input[contains(@placeholder, 'Mobile Number')]";

    /**
     * Поле ввода даты рождения
     */
    public static String date_of_birth_field = "//input[contains(@id, 'dateOfBirthInput')]";

    /**
     * Поле ввода предметов
     */
    public static String subjects_field = "//div[contains(@class, 'subjects-auto-complete__input')]";

    /**
     *  Чекбокс хобби спорт
     */
    public static String sports_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-1')]";

    /**
     *  Чекбокс хобби чтение
     */
    public static String reading_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-2')]";

    /**
     *  Чекбокс хобби музыка
     */
    public static String music_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-3')]";

    /**
     *  Кнопка загрузки файла
     */
    public static String picture_upload_button = "//input[contains(@id, 'uploadPicture')]";

    /**
     *  Поле ввода текущего адреса
     */
    public static String current_address_field = "//textarea[contains(@id, 'currentAddress')]";

    /**
     *  Всплывающий список выбора штата
     */
    public static String state_list = "//div[@id= 'state']";


    /**
     *  Выбор варианта штата во всплывающем списке с изменяющимся xpath (сейчас есть NCR, Uttar Pradesh, Haryana, Rajasthan)
     */
    public static String state_list_variant = "//div[text() ='%s']";


    /**
     *  Всплывающий список выбора штата
     */
    public static String city_list_variant_list = "//div[@id= 'city']";

    /**
     *  Выбор варианта города во всплывающем списке с изменяющимся xpath (сейчас есть Delhi, Gurgaon, Noida)
     */
    public static String city_list_variant = "//div[text() ='%s']";






    /**
     * Метод ввода имени
     */
    public Practice_form enter_first_name(String first_name)
    {
        WebElement first_name_element = set_element_with_condition("visible", first_name_field);
        first_name_element.clear();
        first_name_element.sendKeys(first_name);

        return  new Practice_form(driver);
    }

}
