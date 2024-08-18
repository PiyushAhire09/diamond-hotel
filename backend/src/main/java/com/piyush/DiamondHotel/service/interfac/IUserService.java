package com.piyush.DiamondHotel.service.interfac;

import com.piyush.DiamondHotel.dto.LoginRequest;
import com.piyush.DiamondHotel.dto.Response;
import com.piyush.DiamondHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
