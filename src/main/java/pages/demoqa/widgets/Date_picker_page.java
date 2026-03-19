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
     * Список месяцев даты
     */
    public static String month_date_list = "//select[contains(@class, 'react-datepicker__month-select')]";


    /**
     *  Выбор месяца даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_month_date = "//select[contains(@class, 'react-datepicker__month-select')]/option[text()= '%s']";


    /**
     * Список лет даты
     */
    public static String year_date_list = "//select[contains(@class, 'react-datepicker__year-select')]";


    /**
     *  Выбор года даты рождения по числу с изменяющимся xpath (годы выбирать по числу от 1900 до 2100)
     */
    public static String chose_year_date = "//select[contains(@class, 'react-datepicker__year-select')]/option[@value= '%s']";



    /**
     *  Выбор дня даты рождения по названию месяца и числу с изменяющимся xpath (дни выбирать по числу)
     *  Месяцы выбирать по названию: January, February, March, April, May, June, July, August, September, October, November, December
     */
    public static String chose_day_date_of_birth = "//div[@class= 'react-datepicker__month']//div[contains(@aria-label ,'%s %s')]";






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
     * Метод выбора даты
     */
    public Date_picker_page accordian_1_expand_get_text() {





        return  new Date_picker_page(driver);
    }


}
