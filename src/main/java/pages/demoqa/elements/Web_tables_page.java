package pages.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import data.objects.Web_tables_object;

public class Web_tables_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Web_tables_page(WebDriver driver) {
        super(driver);
    }


     /*
      Xpath
     */

    /**
     * Адрес страницы
     */
    public static String demoqa_webtables_host = "https://demoqa.com/webtables";

    /**
     * Кнопка ADD
     */
    public static String add_button = "//button[contains(@id, 'addNewRecordButton')]";

    /**
     * Кнопка Edit с изменяющимся xpath
     */
    public static String edit_button = "//div[contains(@class, 'rt-tr-group')][%s]//span[contains(@title, 'Edit')]";

    /**
     * Кнопка Delete с изменяющимся xpath
     */
    public static String delete_button = "//div[contains(@class, 'rt-tr-group')][%s]//span[contains(@title, 'Delete')]";

    /**
     * Поле First Name в регистрационной форме
     */
    public static String reg_form_first_name_field = "//input[contains(@placeholder, 'First Name')]";

    /**
     * Поле Last Name в регистрационной форме
     */
    public static String reg_form_last_name_field = "//input[contains(@placeholder, 'Last Name')]";

    /**
     * Поле Email в регистрационной форме
     */
    public static String reg_form_email_field = "//input[contains(@placeholder, 'name@example.com')]";

    /**
     * Поле Age в регистрационной форме
     */
    public static String reg_form_age_field = "//input[contains(@placeholder, 'Age')]";

    /**
     * Поле Salary в регистрационной форме
     */
    public static String reg_form_salary_field = "//input[contains(@placeholder, 'Salary')]";

    /**
     * Поле Department в регистрационной форме
     */
    public static String reg_form_department_field = "//input[contains(@placeholder, 'Department')]";

    /**
     * Кнопка Submit в регистрационной форме
     */
    public static String reg_form_submit_button= "//button[contains(@id, 'submit')]";

    /**
     * Строка поиска
     */
    public static String search_string= "//input[contains(@placeholder, 'Type to search')]";

    /**
     * Кнопка поиска
     */
    public static String search_button= "//span[contains(@class, 'input-group-text')]";



    /**
     * Номер строки в таблице web с изменяющимся xpath
     */
    public static String string_in_web_table= "//div[contains(@class, 'rt-tr-group')][%s]";

    /**
     * Номер столбца в таблице web с изменяющимся xpath
     */
    public static String column_in_web_table= "//div[contains(@class, 'rt-td')][%s]";



//div[contains(@class, 'rt-tr -odd')]//div[contains(@role, 'gridcell')]

    //input[contains(@placeholder, 'Type to search')]

    /**
     * Метод нажатия кнопки Add
     */
    public Web_tables_page click_add_button ()
    {
        WebElement button_element = set_element_with_condition("clickable",add_button);
        button_element.click();

        return  new Web_tables_page(driver);
    }

    /**
     * Метод нажатия кнопки Edit у выбранного человека в таблице
     */
    public Web_tables_page click_edit_button (String person_row_number)
    {
        WebElement button_element = set_element_with_condition("clickable",edit_button, person_row_number);
        button_element.click();

        return  new Web_tables_page(driver);
    }

    /**
     * Метод нажатия кнопки Delete у выбранного человека в таблице
     */
    public Web_tables_page click_delete_button (String person_row_number)
    {
        WebElement button_element = set_element_with_condition("clickable",delete_button, person_row_number);
        button_element.click();

        return  new Web_tables_page(driver);
    }


    /**
     * Метод ввода имени в регистрационной форме
     */
    public Web_tables_page insert_first_name (String first_name)
    {
        WebElement first_name_element = set_element_with_condition("visible",reg_form_first_name_field);
        first_name_element.clear();
        first_name_element.sendKeys(first_name);

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода фамилии в регистрационной форме
     */
    public Web_tables_page insert_last_name (String last_name)
    {
        WebElement last_name_element = set_element_with_condition("visible",reg_form_last_name_field);
        last_name_element.clear();
        last_name_element.sendKeys(last_name);

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода Email в регистрационной форме
     */
    public Web_tables_page insert_email (String email)
    {
        WebElement email_element = set_element_with_condition("visible",reg_form_email_field);
        email_element.clear();
        email_element.sendKeys(email);

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода возраста в регистрационной форме
     */
    public Web_tables_page insert_age (Integer age)
    {
        WebElement age_element = set_element_with_condition("visible",reg_form_age_field);
        age_element.clear();
        age_element.sendKeys(age.toString());

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода зарплаты в регистрационной форме
     */
    public Web_tables_page insert_salary (Integer salary)
    {
        WebElement salary_element = set_element_with_condition("visible",reg_form_salary_field);
        salary_element.clear();
        salary_element.sendKeys(salary.toString());

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода департамента в регистрационной форме
     */
    public Web_tables_page insert_department (String department)
    {
        WebElement department_element = set_element_with_condition("visible",reg_form_department_field);
        department_element.clear();
        department_element.sendKeys(department);

        return  new Web_tables_page(driver);
    }

    /**
     * Метод нажатия кнопки submit в регистрационной форме
     */
    public Web_tables_page click_submit_button ()
    {
        WebElement button_element = set_element_with_condition("clickable",reg_form_submit_button);
        button_element.click();

        return  new Web_tables_page(driver);
    }

    /**
     * Метод нажатия кнопки submit в регистрационной форме
     */
    public Web_tables_page search (String string)
    {
        WebElement search_string_element = set_element_with_condition("visible",search_string);
        search_string_element.sendKeys(string);
        WebElement search_button_element = set_element_with_condition("visible",search_button);
        search_button_element.click();

        return  new Web_tables_page(driver);
    }

    /**
     * Метод добавления человека в таблицу web
     */
    public Web_tables_page add_person_in_web_table(Web_tables_object object_person)

    {
        click_add_button();

        insert_first_name(object_person.getFirst_name());
        insert_last_name(object_person.getLast_name());
        insert_email(object_person.getEmail());
        insert_age(object_person.getAge());
        insert_salary(object_person.getSalary());

        insert_department(object_person.getDepartment());


        click_submit_button();


        return new Web_tables_page(driver);
    }

    /**
     * Метод добавления человека в таблицу web
     */
    public Web_tables_page edit_person_in_web_table(Web_tables_object object_person, String person_row_number)

    {
        click_edit_button(person_row_number);

        insert_first_name(object_person.getFirst_name());
        insert_last_name(object_person.getLast_name());
        insert_email(object_person.getEmail());
        insert_age(object_person.getAge());
        insert_salary(object_person.getSalary());

        insert_department(object_person.getDepartment());


        click_submit_button();


        return new Web_tables_page(driver);
    }

    /**
     * Метод удаления человека в таблицу web
     */
    public Web_tables_page delete_person_in_web_table( String person_row_number)

    {
        click_delete_button(person_row_number);

        return new Web_tables_page(driver);
    }




    /**
     * Метод получения WebElement в ячейке таблицы web
     */
    public WebElement get_WebElement_in_table_cell(String ... xpathParameter)

    {
        return set_element_with_condition("visible",string_in_web_table+column_in_web_table, xpathParameter);
    }


    /**
     * Метод добавления, поиска и получения человека в таблице web
     *
     */
    public Web_tables_page add_search_get_person_in_web_table(Web_tables_object object_person)

    {
        add_person_in_web_table(object_person);


        search(object_person.getFirst_name());


        Assert.assertEquals(get_WebElement_in_table_cell("1","1").getText()
                ,object_person.getFirst_name());

        Assert.assertEquals(get_WebElement_in_table_cell("1","2").getText()
                ,object_person.getLast_name());

        Assert.assertEquals(get_WebElement_in_table_cell("1","3").getText()
                ,object_person.getAge().toString());

        Assert.assertEquals(get_WebElement_in_table_cell("1","4").getText(),
                object_person.getEmail());

        Assert.assertEquals(get_WebElement_in_table_cell("1","5").getText(),
                object_person.getSalary().toString());

        Assert.assertEquals(get_WebElement_in_table_cell("1","6").getText(),
                object_person.getDepartment());

        return new Web_tables_page(driver);
    }

}
