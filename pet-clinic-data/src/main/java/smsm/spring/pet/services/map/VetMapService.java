package smsm.spring.pet.services.map;

import org.springframework.stereotype.Service;
import smsm.spring.pet.model.Pet;
import smsm.spring.pet.model.Vet;
import smsm.spring.pet.services.PetService;
import smsm.spring.pet.services.VetService;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}