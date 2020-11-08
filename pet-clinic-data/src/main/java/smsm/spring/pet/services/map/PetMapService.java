package smsm.spring.pet.services.map;

import org.springframework.stereotype.Service;
import smsm.spring.pet.model.Pet;
import smsm.spring.pet.model.Vet;
import smsm.spring.pet.services.CrudService;
import smsm.spring.pet.services.PetService;

import java.util.Set;
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}