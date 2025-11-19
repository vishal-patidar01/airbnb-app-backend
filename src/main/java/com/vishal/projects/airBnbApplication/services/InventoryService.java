package com.vishal.projects.airBnbApplication.services;

import com.vishal.projects.airBnbApplication.entities.Room;

public interface InventoryService {

    void initializeRoomFroAYear(Room room);

    void deleteFutureInventories(Room room);
}
