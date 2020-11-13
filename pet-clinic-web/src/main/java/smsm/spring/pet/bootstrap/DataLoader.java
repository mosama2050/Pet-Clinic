package smsm.spring.pet.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smsm.spring.pet.model.*;
import smsm.spring.pet.services.OwnerService;

import smsm.spring.pet.services.SpecialtyService;
import smsm.spring.pet.services.VetService;
import smsm.spring.pet.services.PetTypeService;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService ;
    private  final PetTypeService petTypeService ;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService= petTypeService;

        this.specialtyService = specialtyService;
    }


    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedcatPetType = petTypeService.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);

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
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}

