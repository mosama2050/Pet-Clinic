package smsm.spring.pet.services.map;

import org.springframework.stereotype.Service;
import smsm.spring.pet.model.PetType;
import smsm.spring.pet.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService  extends  AbstractMapService<PetType , Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
    super.delete(petType);
    }

    @Override
    public PetType save(PetType obj) {
        return super.save(obj);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
