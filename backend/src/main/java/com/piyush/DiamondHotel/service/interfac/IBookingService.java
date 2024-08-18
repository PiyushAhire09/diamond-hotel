package com.piyush.DiamondHotel.service.interfac;

import com.piyush.DiamondHotel.dto.Response;
import com.piyush.DiamondHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
