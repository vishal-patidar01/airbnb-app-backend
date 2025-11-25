package com.vishal.projects.airBnbApplication.controlles;


import com.vishal.projects.airBnbApplication.dto.BookingDto;
import com.vishal.projects.airBnbApplication.dto.BookingRequest;
import com.vishal.projects.airBnbApplication.services.BookingService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class HotelBookingController {

    private final BookingService bookingService;

    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest) {
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }
}
