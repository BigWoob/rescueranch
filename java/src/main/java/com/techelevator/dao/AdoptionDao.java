package com.techelevator.dao;

import com.techelevator.model.AdoptionApplication;

public interface AdoptionDao {

    public AdoptionApplication createNewAdoption(AdoptionApplication adoptionApplication);
    public boolean approveAdoption(Long id);
    public AdoptionApplication getApplicationById(Long id);
}
