package com.vishal.projects.airBnbApplication.dto;

import com.vishal.projects.airBnbApplication.entities.Hotel;
import com.vishal.projects.airBnbApplication.entities.Room;
import com.vishal.projects.airBnbApplication.entities.User;
import com.vishal.projects.airBnbApplication.entities.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Hotel hotel;
    private Room room;
    private User user;
    private Integer roomCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
