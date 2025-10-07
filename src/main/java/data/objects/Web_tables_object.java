package data.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Web_tables_object {

    String first_name;
    String last_name;
    String email;
    Integer age;
    Integer salary;
    String department;
}




