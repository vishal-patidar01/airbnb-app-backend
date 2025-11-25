package com.vishal.projects.airBnbApplication.dto;

import com.vishal.projects.airBnbApplication.entities.User;
import com.vishal.projects.airBnbApplication.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
