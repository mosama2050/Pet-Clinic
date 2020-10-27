package smsm.spring.pet.services.map;

import smsm.spring.pet.model.Owner;
import smsm.spring.pet.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


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
        return super.save(obj.getId(),obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
