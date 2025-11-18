package com.vishal.projects.airBnbApplication.services;

import com.vishal.projects.airBnbApplication.dto.HotelDto;
import com.vishal.projects.airBnbApplication.entities.Hotel;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);
}
