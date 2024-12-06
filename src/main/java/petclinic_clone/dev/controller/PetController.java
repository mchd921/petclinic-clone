package petclinic_clone.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import petclinic_clone.dev.model.Pet;
import petclinic_clone.dev.service.PetService;

@RestController
public class PetController {
    
    @Autowired
    PetService service;

    @GetMapping("/pet-list")
    public List<Pet> petList() {
        return service.findAll();
    }
}
