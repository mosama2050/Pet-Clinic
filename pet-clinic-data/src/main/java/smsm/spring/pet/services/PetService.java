package smsm.spring.pet.services;


import smsm.spring.pet.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (long id );
    Pet save(Pet pet);
    Set<Pet> findAll();
}