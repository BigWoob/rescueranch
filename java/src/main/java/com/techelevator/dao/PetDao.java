package com.techelevator.dao;
import com.techelevator.model.Pet;

import java.util.*;

public interface PetDao {
    List<Pet> findAll();
}
