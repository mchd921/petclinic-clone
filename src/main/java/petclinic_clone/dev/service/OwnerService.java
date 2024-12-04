package petclinic_clone.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import petclinic_clone.dev.model.Owner;
import petclinic_clone.dev.repository.OwnerRepository;

@Service
@Transactional
public class OwnerService {
    
    @Autowired
    OwnerRepository repository;

    public List<Owner> findAll() {
        return repository.findAll();
    }

    public Owner findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Owner save(Owner owner) {
        return repository.save(owner);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
