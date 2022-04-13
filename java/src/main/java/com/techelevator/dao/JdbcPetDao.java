package com.techelevator.dao;


import com.techelevator.model.Pet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JdbcPetDao implements PetDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcPetDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Pet> findAll(){
        List<Pet> allPets = new ArrayList<>();
        String sql = "SELECT pet_id, animal_type, gender, pet_name, breed, age, description, available, picture_one " +
                     "FROM pets; ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Pet pet = mapRowToPet(results);
            allPets.add(pet);
        }
        return allPets;

    }

    public Pet mapRowToPet(SqlRowSet rs){
        Pet pet = new Pet();
        pet.setPetId(rs.getLong("pet_id"));
        pet.setAnimalType(rs.getString("animal_type"));
        pet.setAnimalGender(rs.getString("gender"));
        pet.setPetName(rs.getString("pet_name"));
        pet.setPetBreed(rs.getString("breed"));
        pet.setAge(rs.getInt("age"));
        pet.setAnimalDescription(rs.getString("description"));
        pet.setAvailable(rs.getBoolean("available"));
        pet.setPictureOne(rs.getString("picture_one"));
        return pet;
    }
}
