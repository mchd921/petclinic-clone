package petclinic_clone.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petclinic_clone.dev.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>  {
    
}
