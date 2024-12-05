package petclinic_clone.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic_clone.dev.model.Type;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    
}
