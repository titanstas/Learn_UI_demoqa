package data.provider;

import data.objects.Practice_form_object;
import org.testng.annotations.DataProvider;

import java.util.stream.Stream;

public class Data_provider_auto_complete {

    @DataProvider(name = "auto_complete_provider")
    public static Object[][] get_data_from_auto_complete_provider() {
        return new Object[][]{
                {"red"}
        };
    }

    @DataProvider(name = "auto_complete_provider_list")
    public static Object[][] get_data_from_auto_complete_provider_list() {
        return new Object[][]{
                {Stream.of("red",  "blue","green").toList()}
        };
    }
}
