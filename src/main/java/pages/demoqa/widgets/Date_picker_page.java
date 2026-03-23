package pages.demoqa.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.demoqa.forms.Practice_form_page;

public class Date_picker_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Date_picker_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */
    public static String demoqa_date_picker_page_host = "https://demoqa.com/date-picker";

     /*
      Xpath
     */

    /**
     * Кнопка выбора даты (Select Date)
     */
    public static String chose_date_button = "//input[contains(@id,'datePickerMonthYearInput')]";


    /**
     * Список месяцев даты (Select Date)
     */
    public static String month_date_list = "//select[contains(@class, 'react-datepicker__month-select')]";


    /**
     *  Выбор месяца даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу) (Select Date)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_month_date = "//select[contains(@class, 'react-datepicker__month-select')]/option[text()= '%s']";


    /**
     * Список лет даты (Select Date)
     */
    public static String year_date_list = "//select[contains(@class, 'react-datepicker__year-select')]";


    /**
     *  Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100) (Select Date)
     */
    public static String chose_year_date = "//select[contains(@class, 'react-datepicker__year-select')]/option[@value= '%s']";



    /**
     *  Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу) (Select Date)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_day_date_of_birth = "//div[@class= 'react-datepicker__month']//div[contains(@aria-label ,'%s %s')]";

    /**
     * Кнопка выбора даты и времени (Date And Time)
     */
    public static String chose_date_time_button = "//input[contains(@id,'dateAndTimePickerInput')]";


    /**
     * Список месяцев даты и времени (Date And Time)
     */
    public static String month_date_time_list = "//span[contains(@class, 'react-datepicker__month-read-view--selected-month')]";

    /**
     *  Выбор месяца даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу) (Date And Time)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_month_date_time = "//div[@class= 'react-datepicker__month-dropdown']/div[text()= '%s']";

    /**
     * Список лет даты (Date And Time)
     */
    public static String year_date_time_list = "//span[contains(@class, 'react-datepicker__year-read-view--selected-year')]";

    /**
     *  Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100) (Date And Time)
     */
    public static String chose_year_date_time = "//div[@class= 'react-datepicker__year-dropdown']/div[text()= '%s']";

    /**
     *  Выбор времени даты рождения по числу с изменяющимся xpath (время выбирать по числу от 00:00 до 23:45, промежутки времени по 15 секунд) (Date And Time)
     */
    public static String chose_time_date_time = "//ul[@class= 'react-datepicker__time-list']/li[text()= '%s:%s']";

    /**
     *  Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу) (Date And Time)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_day_date_time_of_birth = "//div[@class= 'react-datepicker__month']//div[contains(@aria-label ,'%s %s')]";



    /**
     * Метод ввода месяца даты рождения
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Date_picker_page enter_month_date(String month)
    {

        WebElement month_list_element = set_element_with_condition("visible", month_date_list);
        month_list_element.click();

        WebElement month_element = set_element_with_condition("visible", chose_month_date, month);
        month_element.click();

        return  new Date_picker_page(driver);
    }



    /**
     * Метод ввода года даты рождения
     * Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100)
     */
    public Date_picker_page enter_year_date(String year)
    {

        WebElement year_list_element = set_element_with_condition("visible", year_date_list);
        year_list_element.click();

        WebElement year_element = set_element_with_condition("visible", chose_year_date, year);
        year_element.click();

        return  new Date_picker_page(driver);
    }


    /**
     * Метод ввода дня даты рождения
     * Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Date_picker_page enter_day_date(String month, String day)
    {

        WebElement day_element = set_element_with_condition("visible", chose_day_date_of_birth, month, day );
        day_element.click();

        return  new Date_picker_page(driver);
    }



    /**
     * Метод ввода даты рождения
     */
    public Date_picker_page enter_date(String month,String year, String day )
    {

        WebElement chose_date_button_element = set_element_with_condition("visible", chose_date_button);
        chose_date_button_element.click();

        enter_month_date(month);
        enter_year_date(year);
        enter_day_date(month,day);

        return  new Date_picker_page(driver);
    }


    /**
     * Метод ввода месяца даты рождения
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Date_picker_page enter_month_date_time(String month)
    {

        WebElement month_list_element = set_element_with_condition("visible", month_date_time_list);
        month_list_element.click();

        WebElement month_element = set_element_with_condition("visible", chose_month_date_time, month);
        month_element.click();

        return  new Date_picker_page(driver);
    }



    /**
     * Метод ввода года даты рождения
     * Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100)
     */
    public Date_picker_page enter_year_date_time(String year)
    {

        WebElement year_list_element = set_element_with_condition("visible", year_date_time_list);
        year_list_element.click();

        WebElement year_element = set_element_with_condition("visible", chose_year_date_time, year);
        year_element.click();

        return new Date_picker_page(driver);
    }


    /**
     * Метод ввода дня даты рождения
     * Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     * Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public Date_picker_page enter_day_date_time(String month, String day)
    {

        WebElement day_element = set_element_with_condition("visible", chose_day_date_time_of_birth, month, day );
        day_element.click();

        return  new Date_picker_page(driver);
    }

    /**
     * Метод ввода времени даты рождения
     * Выбор времени даты рождения по числу с изменяющимся xpath (время выбирать по числу от 00:00 до 23:45, промежутки времени по 15 секунд) (Date And Time)
     */
    public Date_picker_page enter_time_date_time(String hours, String minutes)
    {

        WebElement time_element = set_element_with_condition("visible", chose_time_date_time, hours, minutes );
        time_element.click();

        return  new Date_picker_page(driver);
    }



    /**
     * Метод ввода даты рождения
     */
    public Date_picker_page enter_date_time(String month,String year, String day, String hours, String minutes )
    {

        WebElement chose_date_button_element = set_element_with_condition("visible", chose_date_time_button);
        chose_date_button_element.click();

        enter_month_date_time(month);
        enter_year_date_time(year);
        enter_day_date_time(month,day);
        enter_time_date_time(hours, minutes);

        return  new Date_picker_page(driver);
    }




}
