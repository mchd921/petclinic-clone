package petclinic_clone.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import petclinic_clone.dev.model.Owner;
import petclinic_clone.dev.service.OwnerService;

@RestController
public class OwnerController {

    @Autowired
    OwnerService service;

    @GetMapping("/owner-list")
    public List<Owner> ownerList(Model model) {
        return service.findAll();
    }
    
}
