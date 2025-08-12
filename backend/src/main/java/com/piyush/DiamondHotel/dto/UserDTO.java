package com.piyush.DiamondHotel.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<BookingDTO> bookings = new ArrayList<>();

}

/*      @JsonInclude(JsonInclude.Include.NON_NULL)
 used for JSON serialization and deserialization. It ensures that any
fields with null values are excluded from the JSON output, making the JSON response more compact.


       DTO :- Data Transfer Object, Send data between client and server .

        -Client can send DTO object to Server in form of HTTP request & Server can fetch the info from it.
        -To reduce no of remote calls for each separate Entity. Ex. Org, Dept, Empl instead of separate call
        to Each by Rest API, Make One Single call to DTO-Class Which contains All info of Org, Dept, Empl
        -by using DTO, Server can send Only required data to client, Not Whole entity.
*/
