package smsm.spring.pet.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smsm.spring.pet.model.Owner;
import smsm.spring.pet.model.Pet;
import smsm.spring.pet.model.PetType;
import smsm.spring.pet.model.Vet;
import smsm.spring.pet.services.OwnerService;
import smsm.spring.pet.services.VetService;
import smsm.spring.pet.services.PetTypeService;

import java.time.LocalDate;


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

        owner1.setFirstName("Mohamed");
        owner1.setLastName("Osama");
        owner1.setAddress("kherbeta");
        owner1.setCity("komhamada");
        owner1.setTelephone("01009756176");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDay(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);



        ownerService.save(owner1);

        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("kherbeta");
        owner2.setCity("komhamada");
        owner2.setTelephone("01009756176");
        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDay(LocalDate.now());
        fionasCat.setPetType(savedcatPetType);
        owner2.getPets().add(fionasCat);
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
