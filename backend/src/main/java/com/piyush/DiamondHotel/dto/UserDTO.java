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
/*
       DTO :- Data Transafer Object, Send data between client and server .

        -Client can send DTO object to Server in form of HTTP request & Server can fetch the info from it.
        -To reduce no of remote calls for each seperate Entity. Ex. Org, Dept, Empl insted of seperate call
        to Each by Rest API, Make One Single call to DTO-Class Which contains All info of Org, Dept,
        Empl
        -Server can send Only required data to client, Not Whole entity.
 */
