package com.sc3.tugasspringboot.controllers;


import com.sc3.tugasspringboot.models.Inventories;
import static javax.swing.text.StyleConstants.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.sc3.tugasspringboot.interfaces.InventoriesInterface;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    private InventoriesInterface inventoryInterface;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", inventoryInterface.getAll());
        return "index";
    }

    @GetMapping("/inventory/create")
    public String create(Model model) {
        
        Inventories inventory = new Inventories();
        model.addAttribute("inventory", inventory);
        
        return "create";
    }

    @PostMapping("/inventory/store")
    public String store(@ModelAttribute("inventory") Inventories inventory) {
        inventoryInterface.store(inventory);
        return "redirect:/";
    }
    
    @GetMapping("/inventory/{id}/edit")
    public String edit(@PathVariable(value = "id") long id, Model model) {
        Inventories todo = inventoryInterface.getById(id);

         model.addAttribute("inventory", todo);
        return "edit";
    }

    @PostMapping("/inventory/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        inventoryInterface.delete(id);
    return "redirect:/";
    }
}