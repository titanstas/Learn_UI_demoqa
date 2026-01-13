package demoqa;

import data.objects.Practice_form_object;
import data.objects.Text_box_object;
import data.objects.Web_tables_object;
import data.provider.Data_provider_practice_form;
import data.provider.Data_provider_text_box;
import data.provider.Data_provider_web_tables;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;
import pages.demoqa.Demoqa_main_page;
import pages.demoqa.alerts.frame.windows.*;
import pages.demoqa.elements.*;
import pages.demoqa.forms.Practice_form_page;
import pages.demoqa.widgets.Accordian_page;
import pages.demoqa.widgets.Auto_complete_page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Tests_demoqa extends BaseTests{

    @Test (groups = {"smoke"})
    public void test_go () throws InterruptedException {
        Demoqa_main_page mainPage = new Demoqa_main_page(driver);
        driver.get(Demoqa_main_page.demoqa_host);
        mainPage.goto_elements_page();

    }


    @Test (dataProvider = "text_box_provider", dataProviderClass = Data_provider_text_box.class,
            groups = {"text_box","sanity"})

    public void test_text_box_1 (String full_name, String email, String current_address, String permanent_address ) throws InterruptedException {
        Text_box_page page = new Text_box_page(driver);
        driver.get(Text_box_page.demoqa_text_box_host);
        page.insert_full_name(full_name);
        page.insert_email(email);
        page.insert_current_address(current_address);
        page.insert_permanent_address(permanent_address);
        page.click_submit_button();
        Thread.sleep(10000);
    }

    @Test (dataProvider = "text_box_provider_object", dataProviderClass = Data_provider_text_box.class,
            groups = {"text_box","smoke"})
    @Tag("text_box")
    public void test_text_box_2 (Text_box_object object) throws InterruptedException {
        Text_box_page page = new Text_box_page(driver);
        driver.get(Text_box_page.demoqa_text_box_host);
        page.fill_and_submit(object);

        Thread.sleep(1000);
    }

    @Test (groups = {"check_box","sanity"})
    public void test_check_box_1 () throws InterruptedException {
        Check_box_page page = new Check_box_page(driver);
        driver.get(Check_box_page.demoqa_checkbox_host);
        page.expand_collapse_by_name("Home");
        page.expand_collapse_by_name("Documents");
        page.expand_collapse_by_name("WorkSpace");
        Thread.sleep(1000);
        page.expand_collapse_by_name("WorkSpace");
        page.expand_collapse_by_name("Documents");
        page.expand_collapse_by_name("Home");

    }

    @Test(groups = {"check_box","smoke"})
    public void test_check_box_2 () throws InterruptedException {
        Check_box_page page = new Check_box_page(driver);
        driver.get(Check_box_page.demoqa_checkbox_host);
        page.expand_collapse_by_name("Home");
        page.expand_collapse_by_name("Documents");
        page.expand_collapse_by_name("WorkSpace");
        Thread.sleep(1000);
        page.folder_check("WorkSpace");

    }

    @Test (groups = {"radio_button","sanity"})
    public void test_radio_button_1 () throws InterruptedException {
        Radio_button_page page = new Radio_button_page(driver);
        driver.get(Radio_button_page.demoqa_radio_button_host);
        page.press_radio_button_yes();
        Thread.sleep(1000);
        page.press_radio_button_impressive();
        Thread.sleep(1000);
        page.check_radio_button_no();


    }

    @Test (groups = {"radio_button","sanity"})
    public void test_radio_button_cond () throws InterruptedException {
        Radio_button_page page = new Radio_button_page(driver);
        driver.get(Radio_button_page.demoqa_radio_button_host);
       // page.press_radio_button_yes_2().check_radio_button_no().press_radio_button_impressive().press_radio_button_yes();
        page.press_radio_button_yes_2();
    }

    @Test (dataProvider = "web_tables_provider_object", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","smoke"} )
    public void test_add_person_in_web_table (Web_tables_object object) throws InterruptedException {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.add_person_in_web_table(object);
    }

    @Test (dataProvider = "web_tables_provider_object_edit", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","smoke"})
    public void test_edit_person_in_web_table (Web_tables_object object, String person_row_number) throws InterruptedException {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.edit_person_in_web_table(object, person_row_number);
    }

    @Test (dataProvider = "web_tables_provider_object_delete", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","smoke"})
    public void test_delete_person_in_web_table ( String person_row_number)  {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.delete_person_in_web_table( person_row_number);
    }

    @Test (dataProvider = "web_tables_provider_object", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","sanity"})
    public void test_search (Web_tables_object object) throws InterruptedException {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.search(object.getFirst_name());
    }

    @Test (dataProvider = "web_tables_provider_object", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","smoke"})
    public void test_add_search_get_person_in_web_table (Web_tables_object object) throws InterruptedException {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.add_search_get_person_in_web_table(object);
    }

    @Test (dataProvider = "web_tables_provider_object", dataProviderClass = Data_provider_web_tables.class, groups = {"web_tables","sanity"})
    public void _get_first_names_in_web_table (Web_tables_object object) throws InterruptedException {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.get_first_names_in_table();
    }

    @Test ( groups = {"web_tables","sanity"})
    public void get_persons_in_web_table ()  {
        Web_tables_page page = new Web_tables_page(driver);
        driver.get(Web_tables_page.demoqa_webtables_host);
        page.get_persons_in_table();
    }

    @Test (groups = {"buttons","sanity"})
    public void press_double_click_me_button ()  {
        Buttons_page page = new Buttons_page(driver);
        driver.get(Buttons_page.demoqa_buttons_page_host);
        page.press_double_click_me_button();
    }

    @Test (groups = {"buttons","sanity"})
    public void press_right_click_me_button ()  {
        Buttons_page page = new Buttons_page(driver);
        driver.get(Buttons_page.demoqa_buttons_page_host);
        page.press_right_click_me_button();
    }

    @Test (groups = {"buttons","smoke"})
    public void click_all_button ()  {
        Buttons_page page = new Buttons_page(driver);
        driver.get(Buttons_page.demoqa_buttons_page_host);
        page.press_all_buttons();

    }

    @Test (groups = {"links","smoke"})
    public void goto_main_page_link_from_links ()  {
        Links_page page = new Links_page(driver);
        driver.get(Links_page.demoqa_links_page_host);
        page.goto_main_page_link_simple();

    }

    @Test (groups = {"links","sanity"})
    public void goto_main_page_dynamic_link_from_links ()  {
        Links_page page = new Links_page(driver);
        driver.get(Links_page.demoqa_links_page_host);
        page.goto_main_page_link_dynamic();

    }

    @Test (groups = {"links","sanity"})
    public void click_link_api_created() throws IOException {
        Links_page page = new Links_page(driver);
        driver.get(Links_page.demoqa_links_page_host);
        page.click_link_api_created();

    }

    @Test (groups = {"links","sanity"})
    public void click_link_api_no_contents() throws IOException {
        Links_page page = new Links_page(driver);
        driver.get(Links_page.demoqa_links_page_host);
        page.click_link_api_no_content();

    }


    //не работает
    @Test (groups = {"links","sanity"})
    public void click_link_api_no_contents_with_rest_assured() throws IOException {
        Links_page page = new Links_page(driver);
        driver.get(Links_page.demoqa_links_page_host);
        page.click_link_api_no_content_with_rest_assured();

    }

    @Test (groups = {"broken_links","smoke"})
    public void test_check_Image_link_broken() throws IOException {
        Broken_links_page page = new Broken_links_page(driver);
        driver.get(Broken_links_page.demoqa_broken_links_page_host);
        page.check_Image_link_broken_by_naturalWidth();

    }

    @Test (groups = {"broken_links","sanity"})
    public void test_check_link_valid() throws IOException {
        Broken_links_page page = new Broken_links_page(driver);
        driver.get(Broken_links_page.demoqa_broken_links_page_host);
        page.check_link_valid();

    }

    @Test (groups = {"broken_links","sanity"})
    public void test_check_link_valid_by_rest_assured() throws IOException {
        Broken_links_page page = new Broken_links_page(driver);
        driver.get(Broken_links_page.demoqa_broken_links_page_host);
        page.check_link_valid_by_rest_assured();

    }

    @Test (groups = {"broken_links","smoke"})
    public void test_check_link_broken() throws IOException {
        Broken_links_page page = new Broken_links_page(driver);
        driver.get(Broken_links_page.demoqa_broken_links_page_host);
        page.check_link_broken();

    }

    @Test (groups = {"broken_links","smoke"})
    public void test_check_link_broken_by_rest_assured() throws IOException {
        Broken_links_page page = new Broken_links_page(driver);
        driver.get(Broken_links_page.demoqa_broken_links_page_host);
        page.check_link_broken_by_rest_assured();

    }

    @Test (groups = {"upload_download","smoke"})
    public void test_check_download_file_and_read() throws IOException {
        Upload_download_page page = new Upload_download_page(driver);
        driver.get(Upload_download_page.demoqa_upload_download_host);
        page.download_and_check_file();

    }

    @Test (groups = {"upload_download","smoke"})
    public void test_check_upload_file() throws IOException {
        Upload_download_page page = new Upload_download_page(driver);
        driver.get(Upload_download_page.demoqa_upload_download_host);
        page.upload_and_check_file();

    }

    @Test (groups = {"dynamic_properties","smoke"})
    public void test_check_button_visible() throws IOException {
        Dynamic_properties_page page = new Dynamic_properties_page(driver);
        driver.get(Dynamic_properties_page.demoqa_dynamic_properties_host);
        page.check_button_visible();

    }

    @Test (groups = {"dynamic_properties","smoke"})
    public void test_check_button_change_color() throws IOException {
        Dynamic_properties_page page = new Dynamic_properties_page(driver);
        driver.get(Dynamic_properties_page.demoqa_dynamic_properties_host);
        page.check_button_change_color();

    }

    @Test (groups = {"practice_form","smoke"})
    public void test_create_student_in_practice_form() throws IOException {
        Practice_form_page page = new Practice_form_page(driver);
        driver.get(Practice_form_page.demoqa_practice_form_host);
        page
                .enter_first_name("Stas")
                .enter_last_name("Ivanov")
                .enter_email("123Stas@Stas.ru")
                .choose_gender("Male")
                .enter_mobile("1234567890")
                .enter_date_of_birth("February","2022","2")
                .enter_subjects("Maths")
                .check_hobbies("sports, reading")
                .upload_and_check_file("D:\\files\\luminoslogo.png")
                .enter_current_address("Moscow, Kremlin")
                .enter_state("Haryana")
                .enter_city("Karnal")
                .click_submit_button();

    }

    @Test (dataProvider = "practice_form_provider_object", dataProviderClass = Data_provider_practice_form.class,groups = {"practice_form","smoke"})
    public void test_create_student_in_practice_form_use_object(Practice_form_object student) {
        Practice_form_page page = new Practice_form_page(driver);
        driver.get(Practice_form_page.demoqa_practice_form_host);
        page.register_student(student);

    }

    @Test (groups = {"browser_windows","smoke"})
    public void test_go_to_new_tab()  {
        Browser_windows_page page = new Browser_windows_page(driver);
        driver.get(Browser_windows_page.demoqa_browser_windows_page_host);
        page.go_to_new_tab();

    }

    @Test (groups = {"browser_windows","smoke"})
    public void test_go_to_new_window()  {
        Browser_windows_page page = new Browser_windows_page(driver);
        driver.get(Browser_windows_page.demoqa_browser_windows_page_host);
        page.go_to_new_window();

    }

    @Test (groups = {"browser_windows","smoke"})
    public void test_go_to_new_window_message()  {
        Browser_windows_page page = new Browser_windows_page(driver);
        driver.get(Browser_windows_page.demoqa_browser_windows_page_host);
        page.go_to_new_window_message();

    }

    @Test (groups = {"alerts","smoke"})
    public void test_open_accept_alert()  {
        Alerts_page page = new Alerts_page(driver);
        driver.get(Alerts_page.demoqa_alerts_page_host);
        page.open_accept_alert();

    }

    @Test (groups = {"alerts","smoke"})
    public void test_open_accept_time_alert()  {
        Alerts_page page = new Alerts_page(driver);
        driver.get(Alerts_page.demoqa_alerts_page_host);
        page.open_accept_time_alert();

    }

    @Test (groups = {"alerts","smoke"})
    public void test_open_accept_confirm_box()  {
        Alerts_page page = new Alerts_page(driver);
        driver.get(Alerts_page.demoqa_alerts_page_host);
        page.open_accept_confirm_box();

    }

    @Test (groups = {"alerts","smoke"})
    public void test_open_insert_in_prompt()  {
        Alerts_page page = new Alerts_page(driver);
        driver.get(Alerts_page.demoqa_alerts_page_host);
        page.open_insert_in_prompt("Stas");

    }

    @Test (groups = {"frames","smoke"})
    public void test_show_frame_1_text()  {
        Frames_page page = new Frames_page(driver);
        driver.get(Frames_page.demoqa_frames_page_host);
        page.show_frame_1_text();

    }

    @Test (groups = {"frames","smoke"})
    public void test_show_frame_2_text()  {
        Frames_page page = new Frames_page(driver);
        driver.get(Frames_page.demoqa_frames_page_host);
        page.show_frame_2_text();

    }

    @Test (groups = {"Nested_frames","smoke"})
    public void test_show_parent_frame_text()  {
        Nested_frames_page page = new Nested_frames_page(driver);
        driver.get(Nested_frames_page.demoqa_nested_frames_page_host);
        page.show_parent_frame_text();

    }

    @Test (groups = {"Nested_frames","smoke"})
    public void test_show_child_frame_text()  {
        Nested_frames_page page = new Nested_frames_page(driver);
        driver.get(Nested_frames_page.demoqa_nested_frames_page_host);
        page.show_child_frame_text();

    }

    @Test (groups = {"modal_dialogs","smoke"})
    public void test_open_close_small_modal()  {
        Modal_dialogs_page page = new Modal_dialogs_page(driver);
        driver.get(Modal_dialogs_page.demoqa_modal_dialogs_page_host);
        page.open_close_small_modal();

    }

    @Test (groups = {"modal_dialogs","smoke"})
    public void test_open_close_large_modal()  {
        Modal_dialogs_page page = new Modal_dialogs_page(driver);
        driver.get(Modal_dialogs_page.demoqa_modal_dialogs_page_host);
        page.open_close_large_modal();

    }

    @Test (groups = {"accordian","smoke"})
    public void test_accordians_expand_get_texts()  {
        Accordian_page page = new Accordian_page(driver);
        driver.get(Accordian_page.demoqa_accordian_page_host);
        page.accordian_1_expand_get_text().
                accordian_2_expand_get_text()
                .accordian_3_expand_get_text();

    }

    @Test (groups = {"auto_complete","smoke"})
    public void test_chose_color_in_multiple_color_names_list()  {
        Auto_complete_page page = new Auto_complete_page(driver);
        driver.get(Auto_complete_page.demoqa_auto_complete_page_host);
        page.chose_color_in_multiple_color_names_list("red");

    }

    @Test (groups = {"auto_complete","smoke"})
    public void test_chose_colors_in_multiple_color_names_list()  {
        Auto_complete_page page = new Auto_complete_page(driver);
        driver.get(Auto_complete_page.demoqa_auto_complete_page_host);
        page.chose_colors_in_multiple_color_names_list(Stream.of("red",  "blue","green").toList());

    }

}


