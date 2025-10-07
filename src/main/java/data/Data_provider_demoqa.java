package data;

import data.objects.Text_box_object;
import data.objects.Web_tables_object;
import org.testng.annotations.DataProvider;

public class Data_provider_demoqa {
    @DataProvider(name = "text_box_provider")
    public static Object[][] get_data_from_text_box_provider() {
        return new Object[][]{
                {"Stas", "Stas@yandex.ru", "Ул.Ясеневая дом 7", "Ул.Ясеневая дом 8"}
        };
    }

    @DataProvider(name = "text_box_provider_object")
    public static Object[][] get_data_from_text_box_provider_object() {
        return new Object[][]{
                {Text_box_object.builder()
                        .full_name("Stas")
                        .email("Stas@yandex.ru")
                        .current_address("Ул.Ясеневая дом 7")
                        .permanent_address("Ул.Ясеневая дом 8")
                        .build()}
        };
    }

    @DataProvider(name = "web_tables_provider_object")
    public static Object[][] get_data_from_web_tables_provider_object() {
        return new Object[][]{
                {Web_tables_object.builder()
                        .first_name("Stas")
                        .last_name("Ivanov")
                        .email("Stas@yandex.ru")
                        .age(77)
                        .salary(500000)
                        .department("Main")
                        .build()}
        };


    }

    @DataProvider(name = "web_tables_provider_object_edit")
    public static Object[][] get_data_from_web_tables_provider_object_edit() {
        return new Object[][]{
                {
                    Web_tables_object.builder()
                        .first_name("Stas")
                        .last_name("Ivanov")
                        .email("Stas@yandex.ru")
                        .age(77)
                        .salary(500000)
                        .department("Main")
                        .build()

                        , "1"
                }

        };
    }

    @DataProvider(name = "web_tables_provider_object_delete")
    public static Object[][] get_data_from_web_tables_provider_object_delete() {
        return new Object[][]{
                {"1"}
        };
    }
}
