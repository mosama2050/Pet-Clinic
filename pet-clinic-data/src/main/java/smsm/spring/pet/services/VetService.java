package smsm.spring.pet.services;

import smsm.spring.pet.model.Vet;

import java.util.Set;

public interface  VetService {
    Vet findById (long id );
    Vet save(Vet vet);
    Set<Vet> findAll();
}
