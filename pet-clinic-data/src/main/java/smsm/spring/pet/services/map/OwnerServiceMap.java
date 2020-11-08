package smsm.spring.pet.services.map;

import org.springframework.stereotype.Service;
import smsm.spring.pet.model.Owner;
import smsm.spring.pet.services.CrudService;
import smsm.spring.pet.services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save( Owner obj) {
        return super.save( obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
