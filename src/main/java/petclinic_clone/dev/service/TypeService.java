package petclinic_clone.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import petclinic_clone.dev.model.Type;
import petclinic_clone.dev.repository.TypeRepository;

@Service
@Transactional
public class TypeService {
    
    @Autowired
    TypeRepository repository;

    public List<Type> findAll() {
        return repository.findAll();
    }

    public Type findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Type save(Type owner) {
        return repository.save(owner);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
