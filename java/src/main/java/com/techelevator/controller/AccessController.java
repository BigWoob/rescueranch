package com.techelevator.controller;

import com.techelevator.dao.PetDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.*;
import com.techelevator.security.jwt.TokenProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.*;

@RestController
@CrossOrigin
public class AccessController {
        // changes made to
        /*
        spring.datasource.username=final_capstone_appuser
        spring.datasource.password=finalcapstone
         */

        private PetDao petDao;

        public AccessController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, UserDao userDao, PetDao petDao) {
            this.petDao = petDao;
        }


        @PermitAll
        @RequestMapping(value = "/allpets", method = RequestMethod.GET)
        public List<Pet> getAllPets(){
            return petDao.findAll();
        }

        @PermitAll
        @RequestMapping(value = "/dogs", method = RequestMethod.GET)
        public List<Pet> getAllDogs(){
        return petDao.findAllDogs();
    }

        @PermitAll
        @RequestMapping(value = "/cats", method = RequestMethod.GET)
        public List<Pet> getAllCats(){
        return petDao.findAllCats();
    }

        @PermitAll
        @RequestMapping(value = "/otheranimals", method = RequestMethod.GET)
        public List<Pet> getAllOtherAnimals(){return petDao.findAllOtherAnimals();}


}
