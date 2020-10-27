package smsm.spring.pet.services;

import smsm.spring.pet.model.Owner;

import java.util.Set;

public interface OwnerService  extends CrudService<Owner ,Long>{
    Owner findByLastName(String lastName);

}
