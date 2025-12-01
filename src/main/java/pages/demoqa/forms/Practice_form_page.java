package pages.demoqa.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Practice_form_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Practice_form_page(WebDriver driver) {
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
    public static String gender_male_button = "//label[text() ='Male']";

    /**
     * Кнопка выбора женского пола
     */
    public static String gender_female_button = "//label[text() ='Female']";

    /**
     * Кнопка выбора другого пола
     */
    public static String gender_other_button = "//label[text() ='Other']";

    /**
     * Поле ввода мобильного телефона (10 цифр)
     */
    public static String mobile_field = "//input[contains(@placeholder, 'Mobile Number')]";

    /**
     * Поле ввода даты рождения
     */
    public static String date_of_birth_field = "//input[contains(@id, 'dateOfBirthInput')]";

    /**
     * Список месяцев даты рождения
     */
    public static String month_date_of_birth_list = "//select[contains(@class, 'react-datepicker__month-select')]";

    /**
     *  Выбор месяца даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_month_date_of_birth = "//select[contains(@class, 'react-datepicker__month-select')]/option[text()= '%s']";

    /**
     * Список лет даты рождения
     */
    public static String year_date_of_birth_list = "//select[contains(@class, 'react-datepicker__year-select')]";

    /**
     *  Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100)
     */
    public static String chose_year_date_of_birth = "//select[contains(@class, 'react-datepicker__year-select')]/option[@value= '%s']";

    /**
     *  Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_day_date_of_birth = "//div[@class= 'react-datepicker__month']//div[contains(@aria-label ,'%s %s')]";



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
     * Кнопка отправки данных
     */
    public static String submit_button = "//button[@id= 'submit']";





    /**
     * Метод ввода имени
     */
    public Practice_form_page enter_first_name(String first_name)
    {
        WebElement first_name_element = set_element_with_condition("visible", first_name_field);
        first_name_element.clear();
        first_name_element.sendKeys(first_name);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода фамилии
     */
    public Practice_form_page enter_last_name(String last_name)
    {
        WebElement last_name_element = set_element_with_condition("visible", last_name_field);
        last_name_element.clear();
        last_name_element.sendKeys(last_name);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода email
     */
    public Practice_form_page enter_email(String email)
    {
        WebElement email_element = set_element_with_condition("visible", email_field);
        email_element.clear();
        email_element.sendKeys(email);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод выбора гендера, нужно выбрать один из имеющихся (сейчас есть Male, Female, Other)
     */
    public Practice_form_page choose_gender(String gender)
    {

        WebElement gender_element;
         switch (gender)
        {
            case "Male" -> gender_element = set_element_with_condition("visible", gender_male_button);

            case "Female" ->  gender_element = set_element_with_condition("visible", gender_female_button);

            case "Other" ->  gender_element = set_element_with_condition("visible", gender_other_button);

            default -> gender_element = set_element_with_condition("visible", gender_male_button);
        }

        gender_element.click();

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода мобильного телефона
     */
    public Practice_form_page enter_mobile(String mobile)
    {
        WebElement mobile_element = set_element_with_condition("visible", mobile_field);
        mobile_element.clear();
        mobile_element.sendKeys(mobile);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода месяца даты рождения
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Practice_form_page enter_month_date_of_birth(String month)
    {

        WebElement month_list_element = set_element_with_condition("visible", month_date_of_birth_list);
        month_list_element.click();

        WebElement month_element = set_element_with_condition("visible", chose_month_date_of_birth, month);
        month_element.click();

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода года даты рождения
     * Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100)
     */
    public Practice_form_page enter_year_date_of_birth(String year)
    {

        WebElement month_list_element = set_element_with_condition("visible", year_date_of_birth_list);
        month_list_element.click();

        WebElement month_element = set_element_with_condition("visible", chose_year_date_of_birth, year);
        month_element.click();

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода дня даты рождения
     * Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Practice_form_page enter_day_date_of_birth(String month, String day)
    {

        WebElement day_of_birth_element = set_element_with_condition("visible", chose_day_date_of_birth, month, day );
        day_of_birth_element.click();

        return  new Practice_form_page(driver);
    }


    /**
     * Метод ввода даты рождения
     */
    public Practice_form_page enter_date_of_birth(String month,String year, String day )
    {

        WebElement date_of_birth_field_element = set_element_with_condition("visible", date_of_birth_field);
        date_of_birth_field_element.click();

        enter_month_date_of_birth(month);
        enter_year_date_of_birth(year);
        enter_day_date_of_birth(month,day);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод ввода предметов
     */
    public Practice_form_page enter_subjects(String subjects)
    {
        WebElement subjects_element = set_element_with_condition("visible", subjects_field);
        subjects_element.sendKeys(subjects);

        return  new Practice_form_page(driver);
    }

    /**
     * Метод выбора хобби
     * Хобби выбирать по названию, которое должно присутствовать в передаваемой строке(есть варианты: sports, reading, music)
     */
    public Practice_form_page check_hobbies(String hobbies)
    {
        WebElement sports_hobbies_checkbox_element = set_element_with_condition("visible", sports_hobbies_checkbox);
        WebElement reading_hobbies_checkbox_element = set_element_with_condition("visible", reading_hobbies_checkbox);
        WebElement music_hobbies_checkbox_element = set_element_with_condition("visible", music_hobbies_checkbox);


        if (hobbies.contains("sports")) {
            sports_hobbies_checkbox_element.click();
        }

        if (hobbies.contains("reading")) {
            reading_hobbies_checkbox_element.click();
        }

        if (hobbies.contains("music")) {
            music_hobbies_checkbox_element.click();
        }


        return  new Practice_form_page(driver);
    }

}
