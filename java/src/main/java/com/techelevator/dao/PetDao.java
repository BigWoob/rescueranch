package com.techelevator.dao;
import com.techelevator.model.Pet;

import java.util.*;

public interface PetDao {
    List<Pet> findAll();
    List<Pet> findAllDogs();
    List<Pet> findAllCats();
    List<Pet> findAllOtherAnimals();
    List<Pet> getSearchResults(String input);
}
