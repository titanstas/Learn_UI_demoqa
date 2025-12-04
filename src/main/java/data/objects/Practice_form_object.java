package data.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Practice_form_object {

    String first_name;
    String last_name;
    String email;
    String gender;
    String mobile;
    String date_of_birth_month;
    String date_of_birth_year;
    String date_of_birth_day;
    String subject;
    String hobbies;
    String file_path;
    String current_address;
    String state;
    String city;

}

//
//String first_name="Stas";
//String last_name"Ivanov"
//        .enter_email("123Stas@Stas.ru")
//                .choose_gender("Male")
//                .enter_mobile("1234567890")
//                .enter_date_of_birth("February","2022","2")
//                .enter_subjects("Maths")
//                .check_hobbies("sports, reading")
//                .upload_and_check_file()
//                .enter_current_address("Moscow, Kremlin")
//                .enter_state("Haryana")
//                .enter_city("Karnal"


