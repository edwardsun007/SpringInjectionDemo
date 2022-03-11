package com.springframework.factoryPattern;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("cats") // refactored into Spring bean instead of component
//@Service
public class CatPetService implements PetService{
    @Override
    public String getPetType(){
        return "Cats are the best!";
    }
}
