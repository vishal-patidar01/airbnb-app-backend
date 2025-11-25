package com.vishal.projects.airBnbApplication.services;

import com.vishal.projects.airBnbApplication.dto.BookingDto;
import com.vishal.projects.airBnbApplication.dto.BookingRequest;

public interface BookingService {


    BookingDto initialiseBooking(BookingRequest bookingRequest);

}
