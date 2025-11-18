package com.vishal.projects.airBnbApplication.services;


import com.vishal.projects.airBnbApplication.entities.Room;
import com.vishal.projects.airBnbApplication.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    @Override
    public void initializeRoomFroAYear(Room room) {

    }
}
