package com.springframework.factoryPattern;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class DogPetService implements PetService{
    public String getPetType(){
        return "Dogs are the best!";
    }
}
