package petclinic_clone.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import petclinic_clone.dev.model.Owner;
import petclinic_clone.dev.service.OwnerService;

@Controller
public class OwnerController {

    @Autowired
    OwnerService service;

    @GetMapping("/owner-list")
    public String ownerList(Model model) {

        List<Owner> ownerList = service.findAll();
        model.addAttribute("ownerList", ownerList);
        return "ownerList";
    }
    
}
