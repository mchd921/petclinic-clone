package petclinic_clone.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import petclinic_clone.dev.model.Pet;
import petclinic_clone.dev.repository.PetRepository;

@Service
@Transactional
public class PetService {
    
    @Autowired
    PetRepository repository;

    public List<Pet> findAll() {
        return repository.findAll();
    }
}
