package com.techelevator.controller;

import com.techelevator.dao.AccountDao;
import com.techelevator.dao.PetDao;
import com.techelevator.model.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@PreAuthorize("isAuthenticated()")
@RestController
@CrossOrigin
public class AccessController {

        /*
        spring.datasource.username=final_capstone_appuser
        spring.datasource.password=finalcapstone
         */

        private PetDao petDao;
        private AccountDao accountDao;

        public AccessController(PetDao petDao, AccountDao accountDao) {
            this.petDao = petDao;
            this.accountDao = accountDao;
        }

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/allpets", method = RequestMethod.GET)
        public List<Pet> getAllPets(){
            return petDao.findAll();
        }

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/dogs", method = RequestMethod.GET)
        public List<Pet> getAllDogs(){
        return petDao.findAllDogs();
    }

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/cats", method = RequestMethod.GET)
        public List<Pet> getAllCats(){
        return petDao.findAllCats();
    }

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/otheranimals", method = RequestMethod.GET)
        public List<Pet> getAllOtherAnimals(){return petDao.findAllOtherAnimals();}

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/search", method = RequestMethod.GET)
        public List<Pet> search(@RequestParam String query){
            return petDao.getSearchResults(query);
        }

        @PreAuthorize("permitAll")
        @RequestMapping(value = "/apply", method = RequestMethod.POST)
        public Account petApplicant(@RequestBody Account newApplicant){return accountDao.createApplicant(newApplicant);}

        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = "/applicants", method = RequestMethod.GET)
        public List<Account> applicants(){return accountDao.getApplicants();}

        @RequestMapping(value = "/addpet", method = RequestMethod.POST)
        public Pet addPet(@RequestBody Pet pet){return petDao.addPet(pet);}

        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = "/approve/{id}", method = RequestMethod.POST)
        public boolean approve(@PathVariable Long id){return accountDao.acceptApplicant(id);}

        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = "/deny/{id}", method = RequestMethod.PUT)
        public boolean deny(@PathVariable Long id){return accountDao.denyApplicant(id);}


}
