package com.sc3.tugasspringboot.repositories;


import com.sc3.tugasspringboot.models.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoriesRepository extends JpaRepository<Inventories, Long>{
    
}