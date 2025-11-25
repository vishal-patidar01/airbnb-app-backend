package com.vishal.projects.airBnbApplication.repositories;

import com.vishal.projects.airBnbApplication.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
