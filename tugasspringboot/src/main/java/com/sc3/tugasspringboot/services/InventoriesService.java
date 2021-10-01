package com.sc3.tugasspringboot.services;


import com.sc3.tugasspringboot.models.Inventories;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sc3.tugasspringboot.interfaces.InventoriesInterface;
import com.sc3.tugasspringboot.repositories.InventoriesRepository;
import java.util.Optional;

@Service
public class InventoriesService implements InventoriesInterface {

    @Autowired
    private InventoriesRepository todoRepository;
    
    @Override
    public List<Inventories> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public void store(Inventories todo) {
        this.todoRepository.save(todo);
    }
    
    @Override
public Inventories getById(long id) {
  Optional < Inventories > optional = todoRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Todo not found for id :: " + id);
  }

  Inventories todo = optional.get();
  return todo;
}

@Override
public void delete(long id) {
  this.todoRepository.deleteById(id);
}
}
