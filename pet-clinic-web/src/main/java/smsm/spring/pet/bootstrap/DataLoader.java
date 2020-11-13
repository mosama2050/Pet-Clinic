package smsm.spring.pet.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smsm.spring.pet.model.Owner;
import smsm.spring.pet.model.PetType;
import smsm.spring.pet.model.Vet;
import smsm.spring.pet.services.OwnerService;
import smsm.spring.pet.services.VetService;
import smsm.spring.pet.services.PetTypeService;


@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService ;
    private  final PetTypeService petTypeService ;


    public DataLoader(OwnerService ownerService, VetService vetService , PetTypeService petTypeService ) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService= petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedcatPetType = petTypeService.save(dog);


        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
