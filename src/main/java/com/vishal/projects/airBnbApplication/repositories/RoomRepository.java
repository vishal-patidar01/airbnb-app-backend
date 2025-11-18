package com.vishal.projects.airBnbApplication.repositories;

import com.vishal.projects.airBnbApplication.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
