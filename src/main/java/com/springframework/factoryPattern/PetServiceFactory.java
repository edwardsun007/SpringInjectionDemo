package com.springframework.factoryPattern;

public class PetServiceFactory {
    public PetService getPetServices(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();

            case "cat":
                return new CatPetService();

            default:
                return new DogPetService();
        }
    }
}
