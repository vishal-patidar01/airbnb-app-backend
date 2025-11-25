package com.vishal.projects.airBnbApplication.services;

import com.vishal.projects.airBnbApplication.dto.BookingDto;
import com.vishal.projects.airBnbApplication.dto.BookingRequest;
import com.vishal.projects.airBnbApplication.repositories.BookingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    @Override
    public BookingDto initialiseBooking(BookingRequest bookingRequest) {
        return null;
    }
}
