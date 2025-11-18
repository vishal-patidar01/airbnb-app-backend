package com.vishal.projects.airBnbApplication.repositories;

import com.vishal.projects.airBnbApplication.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
