package com.vishal.projects.airBnbApplication.services;

import com.vishal.projects.airBnbApplication.dto.HotelDto;
import com.vishal.projects.airBnbApplication.dto.HotelSearchRequest;
import com.vishal.projects.airBnbApplication.entities.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomFroAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}
