package com.vishal.projects.airBnbApplication.repositories;

import com.vishal.projects.airBnbApplication.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
