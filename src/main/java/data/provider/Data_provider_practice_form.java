package data.provider;

import data.objects.Practice_form_object;

import org.testng.annotations.DataProvider;

public class Data_provider_practice_form {


    @DataProvider(name = "practice_form_provider_object")
    public static Object[][] get_data_from_practice_form_provider_object() {
        return new Object[][]{
                {
                        Practice_form_object.builder()
                                .first_name("Stas")
                                .last_name("Ivanov")
                                .email("123Stas@Stas.ru")
                                .gender("Male")
                                .mobile("1234567890")
                                .date_of_birth_month("February")
                                .date_of_birth_year("2022")
                                .date_of_birth_day("2")
                                .subject("Maths")
                                .hobbies("sports, reading")
                                .file_path("D:\\files\\luminoslogo.png")
                                .current_address("Moscow, Kremlin")
                                .state("Haryana")
                                .city("Karnal")
                                .build()
                }

                };
    }
}
