package pages.demoqa.elements;

import data.objects.Web_tables_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Web_tables_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Web_tables_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Адрес страницы
     */


    public static String demoqa_webtables_host = "https://demoqa.com/webtables";
     /*
      Xpath
     */

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

    /**
     * First name в таблице web с изменяющимся xpath
     */
    public static String first_name_in_web_table= "//div[contains(@class, 'rt-td')][1]";

    /**
     * Last Name в таблице web с изменяющимся xpath
     */
    public static String last_name_in_web_table= "//div[contains(@class, 'rt-td')][2]";

    /**
     * Age в таблице web с изменяющимся xpath
     */
    public static String age_in_web_table= "//div[contains(@class, 'rt-td')][3]";

    /**
     * Email в таблице web с изменяющимся xpath
     */
    public static String email_in_web_table= "//div[contains(@class, 'rt-td')][4]";

    /**
     * Salary в таблице web с изменяющимся xpath
     */
    public static String salary_name_in_web_table= "//div[contains(@class, 'rt-td')][5]";

    /**
     * Department в таблице web с изменяющимся xpath
     */
    public static String department_in_web_table= "//div[contains(@class, 'rt-td')][6]";


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
    public Web_tables_page insert_age (String age)
    {
        WebElement age_element = set_element_with_condition("visible",reg_form_age_field);
        age_element.clear();
        age_element.sendKeys(age);

        return  new Web_tables_page(driver);
    }

    /**
     * Метод ввода зарплаты в регистрационной форме
     */
    public Web_tables_page insert_salary (String salary)
    {
        WebElement salary_element = set_element_with_condition("visible",reg_form_salary_field);
        salary_element.clear();
        salary_element.sendKeys(salary);

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
     * Метод получения списка имен в таблице web
     */
    public List<String> get_first_names_in_table()

    {
        List<WebElement> first_names_elements = set_elements_with_condition("visible",first_name_in_web_table );
        List<String> first_names_texts = first_names_elements.stream().map(x->x.getText()).toList();
        first_names_texts.forEach(System.out::println);
        return first_names_texts;
    }

    /**
     * Метод получения списка фамилий в таблице web
     */
    public List<String> get_last_names_in_table()

    {
        List<WebElement> last_names_elements = set_elements_with_condition("visible",last_name_in_web_table );
        List<String> last_names_texts = last_names_elements.stream().map(x->x.getText()).toList();
        last_names_texts.forEach(System.out::println);
        return last_names_texts;
    }

    /**
     * Метод получения списка возрастов в таблице web
     */
    public List<String> get_ages_in_table()

    {
        List<WebElement> ages_elements = set_elements_with_condition("visible",age_in_web_table );
        List<String> ages_texts = ages_elements.stream().map(x->x.getText()).toList();
        ages_texts.forEach(System.out::println);
        return ages_texts;
    }

    /**
     * Метод получения списка email в таблице web
     */
    public List<String> get_emails_in_table()

    {
        List<WebElement> emails_elements = set_elements_with_condition("visible",email_in_web_table );
        List<String> emails_texts = emails_elements.stream().map(x->x.getText()).toList();
        emails_texts.forEach(System.out::println);
        return emails_texts;
    }

    /**
     * Метод получения списка зарплат в таблице web
     */
    public List<String> get_salaries_in_table()

    {
        List<WebElement> salaries_elements = set_elements_with_condition("visible",salary_name_in_web_table );
        List<String> salaries_texts = salaries_elements.stream().map(x->x.getText()).toList();
        salaries_texts.forEach(System.out::println);
        return salaries_texts;
    }

    /**
     * Метод получения списка отделов в таблице web
     */
    public List<String> get_departments_in_table()

    {
        List<WebElement> departments_elements = set_elements_with_condition("visible",department_in_web_table );
        List<String> departments_texts = departments_elements.stream().map(x->x.getText()).toList();
        departments_texts.forEach(System.out::println);
        return departments_texts;
    }

    /**
     * Метод получения списка отделов в таблице web
     */
    public List<Web_tables_object> get_persons_in_table()

    {
        List<String> first_names =get_first_names_in_table();
        List<String> last_names = get_last_names_in_table();
        List<String> ages = get_ages_in_table();
        List<String> emails= get_emails_in_table();
        List<String> salaries= get_salaries_in_table();
        List<String> departments = get_departments_in_table();



        List<Web_tables_object> Web_tables_objects = new ArrayList<>(first_names.size());

        for (int i = 0; i < first_names.size(); i++) {
             Web_tables_objects.add(
                    Web_tables_object.builder()
                            .first_name(first_names.get(i))
                            .last_name(last_names.get(i))
                            .email(emails.get(i))
                            .age(ages.get(i))
                            .salary(salaries.get(i))
                            .department(departments.get(i))
                            .build()
            );

        }

        Web_tables_objects.forEach(System.out::println);


        return Web_tables_objects;
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
