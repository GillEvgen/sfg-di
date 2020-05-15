package com.spring.sfgdi.controllers;

import com.spring.sfgdi.service.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getPet() {
        return petService.getPetType();
    }
}
