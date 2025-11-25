package com.vishal.projects.airBnbApplication.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequest {

    private Long id;
    private Long roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer roomsCount;
}
