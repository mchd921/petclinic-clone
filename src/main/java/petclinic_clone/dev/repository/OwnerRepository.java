package petclinic_clone.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic_clone.dev.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    
}