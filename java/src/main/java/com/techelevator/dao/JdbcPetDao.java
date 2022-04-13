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

    public List<Pet> findAllDogs(){
        List<Pet> dogs = new ArrayList<>();
        String sql = "SELECT pet_id, animal_type, gender, pet_name, breed, age, description, available, picture_one " +
                     "FROM pets " +
                     "WHERE animal_type LIKE '%dog%';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Pet pet = mapRowToPet(results);
            dogs.add(pet);
        }
        return dogs;
    }

    public List<Pet> findAllCats(){
        List<Pet> cats = new ArrayList<>();
        String sql = "SELECT pet_id, animal_type, gender, pet_name, breed, age, description, available, picture_one " +
                     "FROM pets " +
                     "WHERE animal_type LIKE '%cat%';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Pet pet = mapRowToPet(results);
            cats.add(pet);
        }
        return cats;
    }

    public List<Pet> findAllOtherAnimals(){
        List<Pet> otherAnimals = new ArrayList<>();
        String sql = "SELECT pet_id, animal_type, gender, pet_name, breed, age, description, available, picture_one " +
                     "FROM pets " +
                     "WHERE animal_type NOT LIKE '%cat%' AND animal_type NOT LIKE '%dog%';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Pet pet = mapRowToPet(results);
            otherAnimals.add(pet);
        }
        return otherAnimals;
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
