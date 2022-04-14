<template>
  <div>
    <header-default  />
    <navbar class="sticky-top"/>
    
    <div class="mission">
      <h2 class="subheading">Your New Best Friend!</h2>
    </div>

     <pet-display
      class="pet d-flex justify-content-space-evenly redback"
      v-for="pet in pets"
      v-bind:key="pet.petId"
      v-bind:pet="pet"
    />
     
     <!-- <div
      class="pet d-flex justify-content-space-evenly redback"
      v-for="pet in pets"
      v-bind:key="pet.petId" >
 
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
    </div> -->
  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault";
import PetDisplay from '../components/PetDisplay.vue';
import petService from "../services/PetService";
import Navbar from "../components/Navbar";
export default {
  components: { HeaderDefault, PetDisplay, Navbar },
  data() {
    return {
      pets: [],
    };
  },

  created() {
    petService.getDogs().then((response) => {
      this.pets = response.data;
    });

 //   this.$store.commit("Dogs");
  //  this.$router.push("/Dogs");
  },
};
</script>

<style>
</style>