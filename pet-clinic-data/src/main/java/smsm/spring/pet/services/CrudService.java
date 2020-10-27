package smsm.spring.pet.services;

import java.util.Set;

public interface CrudService <T,ID>{
    Set<T> findAll();
    T findById(ID id);
    T save (T obj);
    void  delete(T t);
    void  deleteById(ID id);


}
