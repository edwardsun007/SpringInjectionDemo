package com.springframework.factoryPattern;

/*Treat as 3rd party Jar / Lib
what we need: import this to GreetingServiceConfig.java
return instance based on parameter, so that you don't need to use @Service spring annotation any more
* */
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
