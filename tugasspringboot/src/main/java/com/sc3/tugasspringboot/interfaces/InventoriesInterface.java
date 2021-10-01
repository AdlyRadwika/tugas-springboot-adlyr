package com.sc3.tugasspringboot.interfaces;

import com.sc3.tugasspringboot.models.Inventories;
import java.util.List;

public interface InventoriesInterface {
    List<Inventories> getAll();
    void store(Inventories todo);
    Inventories getById(long id);
    void delete(long id);
}