package pages.demoqa.forms;

import data.objects.Practice_form_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
    public static String subjects_field = "//input[contains(@id, 'subjectsInput')]";

    /**
     * Всплывающий список выбора предметов
     */
    public static String subjects_list = "//div[contains(@class, 'subjects-auto-complete__menu-list')]";

    /**
     * Вариант из всплывающего списка выбора предметов с изменяющимся xpath
     * Нужно добавить конкретный вариант, которые есть во всплывающем списке
     */
    public static String subjects_list_variant = "//div[contains(@class, 'subjects-auto-complete__menu-list')]/div[text()='%s']";

    /**
     * Выбранный предмет из всплывающего списка выбора предметов с изменяющимся xpath
     * Нужно выбрать конкретный вариант, который добавлен во всплывающем списке
     */
    public static String subjects_chosen_variant = "//div[contains(@class, 'subjects-auto-complete__multi-value__label')]";

    /**
     *  Чекбокс хобби спорт
     */
    public static String sports_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-1')]/following-sibling::label";

    /**
     *  Чекбокс хобби чтение
     */
    public static String reading_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-2')]/following-sibling::label";

    /**
     *  Чекбокс хобби музыка
     */
    public static String music_hobbies_checkbox = "//input[contains(@id, 'hobbies-checkbox-3')]/following-sibling::label";

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
    public static String state_list = "//div[@id= 'state']/parent::div";


    /**
     *  Выбор варианта штата во всплывающем списке с изменяющимся xpath
     *  Сейчас есть NCR, Uttar Pradesh, Haryana, Rajasthan
     */
    public static String state_list_variant = "//div[text() ='%s']";


    /**
     *  Всплывающий список выбора города
     */
    public static String city_list = "//div[@id= 'city']/parent::div";

    /**
     *  Выбор варианта города во всплывающем списке с изменяющимся xpath
     *  Для NCR сейчас есть Delhi, Gurgaon, Noida
     *  Для Haryana сейчас есть Karnal, Panipat
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
     * Метод ввода предмета и выбора введенного предмета из всплывающего списка
     */
    public Practice_form_page enter_subjects(String subject)
    {
        WebElement subjects_element = set_element_with_condition("visible", subjects_field);
        subjects_element.clear();
        subjects_element.sendKeys(subject);

        WebElement subjects_list_variant_element = set_element_with_condition("visible", subjects_list_variant, subject);
        subjects_list_variant_element.click();

        WebElement subjects_chosen_variant_element = set_element_with_condition("visible", subjects_chosen_variant);
        Assert.assertEquals(subjects_chosen_variant_element.getText(),subject);

        return new Practice_form_page(driver);
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


        if (hobbies.toLowerCase().contains("sports")) {
            sports_hobbies_checkbox_element.click();
        }

        if (hobbies.toLowerCase().contains("reading")) {
            reading_hobbies_checkbox_element.click();
        }

        if (hobbies.toLowerCase().contains("music")) {
            music_hobbies_checkbox_element.click();
        }


        return  new Practice_form_page(driver);
    }


    /**
     *  Метод загрузки файла
     *
     */
    public Practice_form_page upload_and_check_file(String file_path) {


        WebElement upload_file_button =  set_element_with_condition("visible", picture_upload_button);
        upload_file_button.sendKeys(file_path);

        return new Practice_form_page(driver);
    //file_path ="D:\\files\\luminoslogo.png";
    }

    /**
     *  Метод ввода текущего адреса
     *
     */
    public Practice_form_page enter_current_address(String current_address) {


        WebElement current_address_field_element =  set_element_with_condition("visible", current_address_field);
        current_address_field_element.sendKeys(current_address);

        return new Practice_form_page(driver);
    }

    /**
     *  Метод выбора штата
     * Выбор варианта штата во всплывающем списке с изменяющимся xpath (сейчас есть NCR, Uttar Pradesh, Haryana, Rajasthan)
     */
    public Practice_form_page enter_state(String state) {


        WebElement state_list_element =  set_element_with_condition("clickable", state_list);
        state_list_element.click();

        WebElement state_list_variant_element =  set_element_with_condition("clickable", state_list_variant, state );
        state_list_variant_element.click();

        return new Practice_form_page(driver);
    }

    /**
     *  Метод выбора города
     *  Выбор варианта города во всплывающем списке с изменяющимся xpath
     *  Для NCR сейчас есть Delhi, Gurgaon, Noida
     *  Для Haryana сейчас есть Karnal, Panipat
     */
    public Practice_form_page enter_city(String city) {


        WebElement city_list_element =  set_element_with_condition("clickable", city_list);
        city_list_element.click();

        WebElement city_list_variant_element =  set_element_with_condition("clickable", city_list_variant, city );
        city_list_variant_element.click();

        return new Practice_form_page(driver);
    }

    /**
     *  Метод нажатия на кнопку отправить
     *
     */
    public Practice_form_page click_submit_button( ) {


        WebElement submit_button_element =  set_element_with_condition("clickable", submit_button);
        submit_button_element.click();

        return new Practice_form_page(driver);
    }

    /**
     *  Метод заполнения и отправки данных по студенту
     *
     */
    public Practice_form_page register_student(Practice_form_object student ) {

                enter_first_name(student.getFirst_name());
                enter_last_name(student.getLast_name());
                enter_email(student.getEmail());
                choose_gender(student.getGender());
                enter_mobile(student.getMobile());
                enter_date_of_birth(student.getDate_of_birth_month(),student.getDate_of_birth_year(),student.getDate_of_birth_day());
                enter_subjects(student.getSubject());
                check_hobbies(student.getHobbies());
                upload_and_check_file(student.getFile_path());
                enter_current_address(student.getCurrent_address());
                enter_state(student.getState());
                enter_city(student.getCity());
                click_submit_button();


        return new Practice_form_page(driver);
    }






}
