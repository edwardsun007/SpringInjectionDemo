package com.springframework.factoryPattern;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cats")
@Service
public class CatPetService implements PetService{
    public String getPetType(){
        return "Cats are the best!";
    }
}
