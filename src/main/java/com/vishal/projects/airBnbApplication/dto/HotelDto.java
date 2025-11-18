package com.vishal.projects.airBnbApplication.dto;


import com.vishal.projects.airBnbApplication.entities.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDto {

    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
