package petclinic_clone.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import petclinic_clone.dev.model.Type;
import petclinic_clone.dev.service.TypeService;

@RestController
public class TypeController {
    
    @Autowired
    TypeService service;

    @GetMapping("/type-list")
    public List<Type> typeList() {
        return service.findAll();
    }
}
