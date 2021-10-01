package com.sc3.tugasspringboot.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventories")
public class Inventories {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="description")
    private String description;
    
    @Column(name="stock")
    private String stock;

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}