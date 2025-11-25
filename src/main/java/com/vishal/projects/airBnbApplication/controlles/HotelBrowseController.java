package com.vishal.projects.airBnbApplication.controlles;

import com.vishal.projects.airBnbApplication.dto.HotelDto;
import com.vishal.projects.airBnbApplication.dto.HotelInfoDto;
import com.vishal.projects.airBnbApplication.dto.HotelSearchRequest;
import com.vishal.projects.airBnbApplication.services.HotelService;
import com.vishal.projects.airBnbApplication.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels")
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {
        Page<HotelDto> page = inventoryService.searchHotels(hotelSearchRequest);
        return  ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }
}











