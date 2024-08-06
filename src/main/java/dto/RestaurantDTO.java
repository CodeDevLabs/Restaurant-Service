package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantDTO {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String image;
}
