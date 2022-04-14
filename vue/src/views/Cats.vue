<template>
  <div>
    <div class="">
      <header>
        <div>
          <img
            id="title"
            class="img-fluid"
            src="../assets/images/smallerranch.jpg"
            alt="Title and Slogan"
            srcset=""
          />
        </div>
      </header>
      <b-navbar
        id="nav"
        role="navigation"
        class="
          navbar
          bd-navbar
          flex-column flex-md-row
          navbar-dark navbar-expand
          nav-item
          sticky-top
          navbar-custom
        "
      >
        <b-navbar-nav class="d-flex justify-content-center">
          <b-nav-item href="/" class="nav-item justify-content-end"
            >Home</b-nav-item
          >

          <b-nav-item-dropdown text="Adopt" right class="nav-item">
            <b-dropdown-item href="/AllPets">See All Animals</b-dropdown-item>
            <b-dropdown-item href="/Cats">Cats and Kittens</b-dropdown-item>
            <b-dropdown-item href="/Dogs">Dogs and Puppies</b-dropdown-item>
            <b-dropdown-item href="/Others">Other Animals</b-dropdown-item>
          </b-nav-item-dropdown>

          <b-nav-item-dropdown text="Volunteer" right>
            <b-dropdown-item href="/ApplyToVolunteer"
              >Join The Team</b-dropdown-item
            >
            <b-dropdown-item href="https://www.linkedin.com/in/joe-righetti/"
              >Meet The Team</b-dropdown-item
            >
          </b-nav-item-dropdown>

          <b-nav-item class="mr-auto" href="#A">About Us</b-nav-item>

          <a class="nav-link" href="/dono"
            ><i class="fa fa-heart"></i> Donate<span class="sr-only"
              >(current)</span
            ></a
          >

          <b-nav-item href="/login" class="nav-item justify-content-end"
            >Login</b-nav-item
          >
        </b-navbar-nav>
      </b-navbar>
    </div>
    <div class="mission">
      <h2 class="subheading">Your New Best Friend!</h2>
    </div>

    <div
      class="pet d-flex justify-content-space-evenly redback"
      v-for="pet in pets"
      v-bind:key="pet.petId"
    >
      <div class="row adopt">
        <div class="col-12 adoptable">
          <img :src="pet.pictureOne" alt="" srcset="" class="img-fluid" />
          <h2 class="subyellow">{{ pet.petName }}</h2>
          <p>Animal Type: {{ pet.animalType }}</p>
          <p>Sex: {{ pet.animalGender }}</p>
          <p>Breed: {{ pet.petBreed }}</p>
          <p>Age:{{ pet.age }}</p>
          <p>Available: Yes</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

import petService from "../services/PetService";
export default {
  data() {
    return {
      pets: [],
    };
  },

  created() {
    petService.getCats().then((response) => {
      this.pets = response.data;
    });

    this.$store.commit("Cats");
    this.$router.push("/Cats");
  },
};
</script>

<style>
</style>