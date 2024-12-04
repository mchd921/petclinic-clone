package petclinic_clone.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import petclinic_clone.dev.model.Owner;
import petclinic_clone.dev.service.OwnerService;

@RestController
public class OwnerController {

    @Autowired
    OwnerService service;

    @GetMapping("/owner-list")
    public List<Owner> ownerList() {
        return service.findAll();
    }

    @GetMapping("/owner/{id}")
    public Owner getOwnerById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/owner/{id}")
    public Owner updateOwner(@PathVariable Integer id, @RequestBody Owner owner) {
        Owner existingOwner = service.findById(id);
        if (existingOwner != null) {
            existingOwner.setFirst_name(owner.getFirst_name());
            existingOwner.setLast_name(owner.getLast_name());
            existingOwner.setAddress(owner.getAddress());
            existingOwner.setCity(owner.getCity());
            existingOwner.setTelephone(owner.getTelephone());
            return service.save(existingOwner);
        }
        return null;
    }

    @DeleteMapping("/owner/{id}")
    public void deleteOwner(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @PostMapping("/owner")
        public Owner createOwner(@RequestBody Owner owner) {
        return service.save(owner);
    }

}
