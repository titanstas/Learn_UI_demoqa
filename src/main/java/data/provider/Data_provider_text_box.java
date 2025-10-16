package data.provider;

import data.objects.Text_box_object;
import data.objects.Web_tables_object;
import org.testng.annotations.DataProvider;

public class Data_provider_text_box {

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
}
