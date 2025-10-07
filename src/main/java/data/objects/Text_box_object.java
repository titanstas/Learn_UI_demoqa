package data.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Text_box_object {

    String full_name;
    String email;
    String current_address;
    String permanent_address;
}
